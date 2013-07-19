package api;

import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * User: Thoughtworker Date: 7/17/13 Time: 6:24 PM
 */
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class SampleApiResource {
    private final AtomicLong counter;

    public SampleApiResource(){
        counter = new AtomicLong();
    }

    @GET
    @Timed
    public SampleApiContent getContent(){
        return new SampleApiContent(counter.incrementAndGet(),"Joe User","1 Main Street","10001");
    }
}
