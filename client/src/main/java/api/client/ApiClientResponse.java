package api.client;

import com.google.api.client.util.Key;

/**
 * User: Thoughtworker Date: 7/18/13 Time: 8:35 AM
 */
public class ApiClientResponse {
    public ApiClientResponse(String first_name, String last_name, String zip) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.zip = zip;

    }

    @Key
    String first_name;

    @Key
    String last_name;

    @Key
    String zip;
}
