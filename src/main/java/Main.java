import static spark.Spark.*;
import org.apache.log4j.Logger;


public class Main {
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        get("/test", (req, res) -> "This is a test of a rest route!");

        // matches "GET /hello/foo" and "GET /hello/bar"
		// request.params(":name") is 'foo' or 'bar'
		get("/hello/:name", (request, response) -> {
			log.debug("the route hello has been run with the name: " + request.params(":name"));
    		return "Hello: " + request.params(":name");
		});
    }
}