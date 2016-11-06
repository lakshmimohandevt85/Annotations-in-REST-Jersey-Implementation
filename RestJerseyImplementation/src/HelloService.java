
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/helloService")
public class HelloService {
	
	@Path("/sayHello")
	@GET
	public String rfeg(@QueryParam("name1") String name, @QueryParam("age") int age) {
		
		return "Hello... "+name+" and you age is: "+age;

		//http://localhost:8080/RestJerseyImplementation/rest/helloService/sayHello/?name1=venkat&age=32
	}
	
	
	
}