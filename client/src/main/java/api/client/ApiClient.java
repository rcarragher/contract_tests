package api.client;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * User: Thoughtworker Date: 7/17/13 Time: 7:51 PM
 */
public class ApiClient {

    private ApiService service;

    public ApiClient(ApiService service){
        this.service = service;
    }

    public static void main(String []args) throws Exception{

        ApiClientResponse aResponse = new ApiClient(new ApiServiceImpl()).consumeEndpoint();
        System.out.println("My response is id:" + aResponse.id + " name:" + aResponse.name);
    }

    public ApiClientResponse consumeEndpoint() throws Exception{
        String apiClientResponse = service.getServiceResponse();

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject)parser.parse(apiClientResponse);
        //ApiClientResponse response = new ApiClientResponse(jsonObject.get("id").getAsLong(),jsonObject.get("name").getAsString());
        ApiClientResponse response = new ApiClientResponse(jsonObject.get("id").getAsLong(),jsonObject.get("name").getAsString(),jsonObject.get("address").getAsString());

        return response;
    }
}
