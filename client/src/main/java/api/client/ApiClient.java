package api.client;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ApiClient {

    private ApiService service;

    public ApiClient(ApiService service){
        this.service = service;
    }

    public static void main(String []args) throws Exception{

        ApiClientResponse aResponse = new ApiClient(new ApiServiceImpl()).consumeEndpoint();
        System.out.println("My response is first_name:" + aResponse.first_name + " last_name:" + aResponse.last_name + " zip:" + aResponse.zip);
    }

    public ApiClientResponse consumeEndpoint() throws Exception{
        String apiClientResponse = service.getServiceResponse();

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject)parser.parse(apiClientResponse);
        ApiClientResponse response = new ApiClientResponse(jsonObject.get("first_name").getAsString(),
                                                           jsonObject.get("last_name").getAsString(),
                                                           jsonObject.get("address").getAsJsonObject().get("zip").getAsString());
        //ApiClientResponse response = new ApiClientResponse(jsonObject.get("id").getAsLong(),jsonObject.get("name").getAsString(),jsonObject.get("address").getAsString());

        return response;
    }
}
