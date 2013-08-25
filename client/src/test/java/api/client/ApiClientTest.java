package api.client;


import api.ApiContractTest;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class ApiClientTest {

    @Test
    public void shouldGetValidResult() throws Exception {
        ApiService service = mock(ApiService.class);

        //The client CONSUMES at most id and name
        when(service.getServiceResponse()).thenReturn(ApiContractTest.THE_CONTRACT);

        ApiClient client = new ApiClient(service);

        ApiClientResponse response = client.consumeEndpoint();

        assertThat(response.first_name).isEqualTo("Rick");
        assertThat(response.last_name).isEqualTo("Carragher");
        assertThat(response.zip).isEqualTo("10001");

    }
}
