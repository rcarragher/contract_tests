package api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.fest.assertions.api.Assertions.assertThat;

public class ApiContractTest {

    private JsonElement contractElements;

    public static final String THE_CONTRACT="{first_name:\"Rick\", " +
            "last_name:\"Carragher\"," +
            "address: { zip: \"10001\"}}";

    @Before
    public void setup() {
        JsonParser parser = new JsonParser();
        contractElements = parser.parse(THE_CONTRACT);
    }

    @Test
    public void shouldIncludeContractFields(){
        String response = makeRequest();

        JsonParser parser = new JsonParser();
        JsonElement responseJson = parser.parse(response);

        //The producer PRODUCES at least the elements in the contract
        assertItIsThere(responseJson,contractElements);

    }

    private void assertItIsThere(JsonElement responseJson,JsonElement contractElements){
        assertThat(responseJson.isJsonObject()).isTrue();
        JsonObject responseJsonAsObject = responseJson.getAsJsonObject();
        for(Map.Entry<String,JsonElement> element: contractElements.getAsJsonObject().entrySet()){
            //Ensure the response has the fields we're expecting.
            assertThat(responseJsonAsObject.get(element.getKey())).isInstanceOf(JsonElement.class);
            //Ensure that children of this object are also there.
            if (element.getValue().isJsonObject()){
                assertItIsThere(responseJsonAsObject.get(element.getKey()),element.getValue());
            }
        }
    }

    private String makeRequest(){
      //This should really call the service...
      return "{first_name:\"Rick\", last_name: \"Carragher\", address: { street: \"1 Main Street\",zip: \"10001\"}}";
    }
}
