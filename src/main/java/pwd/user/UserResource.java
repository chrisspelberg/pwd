package pwd.user;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    @Path("current")
    public Response getCurrentUser() {
        return Response.ok(new User("usert", "usert@localhost", "Usert Nitwit").toString(), MediaType.TEXT_PLAIN_TYPE).build();
    }

    @GET
    public Response getUserResponse() {
        return Response.ok(new User("usert", "usert@localhost", "Usert Nitwit")).build();
    }

}
