import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/PathParamEx")
public class PathParamEx 
{
 @GET
 @Path("/service/{age1}")
 
 public String service(@QueryParam ("name1")String name,@PathParam("age1") int age)
 {
	 return "Hello..."+age;
 }
}
 
 /*
  * @Path("/service/{name1}/{age1}")
  * http://localhost:8080/RestJerseyImplementation/rest/PathParamEx/service/kv/11
  */
 
 /*
  *  @Path("/service/{name1}")
  * http://localhost:8080/RestJerseyImplementation/rest/PathParamEx/service/11/
  */
 
 
//In JAX-RS, you can use @PathParem to inject the value of URI parameter that 
//defined in @Path expression, into Java method.

