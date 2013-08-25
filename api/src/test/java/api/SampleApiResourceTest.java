package api;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class SampleApiResourceTest {
    @Test
    public void shouldReturnContent(){
        SampleApiResource resource = new SampleApiResource();

        SampleApiContent content = resource.getContent();

        assertThat(content.getId()).isEqualTo(1L);
        assertThat(content.getFirst_name()).isEqualTo("Joe");
        assertThat(content.getLast_name()).isEqualTo("User");
        assertThat(content.getAddress().getStreet()).isEqualTo("1 Main Street");
        assertThat(content.getAddress().getZip()).isEqualTo("10001");
    }
}
