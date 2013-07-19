package api.client;


import api.ApiContractTest;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * User: Thoughtworker Date: 7/18/13 Time: 8:56 AM
 */
public class ApiClientTest {

    @Test
    public void shouldGetValidResult() throws Exception {
        ApiService service = mock(ApiService.class);

        //The client CONSUMES at most id and name
        when(service.getServiceResponse()).thenReturn(ApiContractTest.CONTRACT);

        ApiClient client = new ApiClient(service);

        ApiClientResponse response = client.consumeEndpoint();
        assertThat(response.id).isEqualTo(1);
        assertThat(response.name).isEqualTo("Rick");
    }
}
