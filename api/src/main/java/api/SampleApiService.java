package api;


import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class SampleApiService extends Service<SampleApiConfiguration> {
    public static void main(String []args) throws Exception {
        new SampleApiService().run(args);
    }

    @Override
    public void initialize(Bootstrap<SampleApiConfiguration> bootstrap) {
        bootstrap.setName("sample-api");
    }

    @Override
    public void run(SampleApiConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new SampleApiResource());
    }
}
