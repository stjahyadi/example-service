package id.co.asyst.backend.service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;


@Path("/")
public class RestService {
	
	private static Logger LOG = Logger.getLogger(RestService.class);
	
	@POST
    @Path("callService")
    @Consumes({"application/json"})
    public Response callService(String inputMap) throws Exception {
		LOG.info("Success Call");
		return Response.ok("Success").build();
    }
	
}
