package api.client;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;

/**
 * User: Thoughtworker Date: 7/18/13 Time: 8:37 AM
 */
public class ApiServiceImpl extends ApiService {

    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static final JsonFactory JSON_FACTORY = new JacksonFactory();

    @Override
    public String getServiceResponse() throws Exception{
        HttpRequestFactory requestFactory =
          HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest request) {
                request.setParser(new JsonObjectParser(JSON_FACTORY));
            }
          });
        GenericUrl url = new GenericUrl("http://localhost:8080/api");
        HttpRequest request = requestFactory.buildGetRequest(url);

        return request.execute().parseAsString();

    }
}
