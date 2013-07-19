package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class SampleApiConfiguration extends Configuration {
    @NotEmpty
    @JsonProperty
    private String template;

    public String getTemplate(){
        return template;
    }

}
