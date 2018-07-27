package application.rest.v1;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;
import java.util.Random;

class Cheese{
	Random m_random = new Random();
    public void run() {
        int randomInt = m_random.nextInt(10);
        if(randomInt < 5)
            System.out.println("[WARN] Cheese is Gouda.");
        else if(randomInt >= 5 && randomInt < 8)
            System.out.println("[FATAL] Cheese is quite smelly");
        else if (randomInt == 8)
            System.out.println("[INFO] Cheese was breeding ground for listeria.");
        else
            System.out.println("[ERROR] Cheese is too ripe!");
    }
}
@Path("v1/example")
public class Example {



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response example() {
        Cheese m_cheese = new Cheese();
        m_cheese.run();

        List<String> list = new ArrayList<>();

        list.add("Hello world!!");
        return Response.ok(list.toString()).build();
    }

}
