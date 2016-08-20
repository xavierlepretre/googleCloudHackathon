package myapp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import myapp.model.LongLat;


@Path("/api")
public class Api {
	
	@GET
	@Path("/loc")
	@Produces("application/json")
	public int getDistance(LongLat longLat) {
		return 10;
	}
}
