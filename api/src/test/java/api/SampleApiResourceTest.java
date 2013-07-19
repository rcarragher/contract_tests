package api;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * User: Thoughtworker Date: 7/18/13 Time: 1:13 PM
 */
public class SampleApiResourceTest {
    @Test
    public void shouldReturnContent(){
        SampleApiResource resource = new SampleApiResource();

        SampleApiContent content = resource.getContent();

        assertThat(content.getId()).isEqualTo(1L);
        assertThat(content.getName()).isEqualTo("Joe User");
        assertThat(content.getAddress()).isEqualTo("1 Main Street");
        assertThat(content.getZip()).isEqualTo("10001");
    }
}
