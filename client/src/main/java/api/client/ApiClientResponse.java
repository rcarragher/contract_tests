package api.client;

import com.google.api.client.util.Key;

/**
 * User: Thoughtworker Date: 7/18/13 Time: 8:35 AM
 */
public class ApiClientResponse {
    public ApiClientResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

//    public ApiClientResponse(long id, String name,String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }

    @Key
    long id;

    @Key
    String name;

//    @Key
//    String address;
}
