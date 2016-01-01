package learning;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        // test route
        get("/test", (req, res) -> "This is a test of a rest route!");

        // route that takes a name for an argument
        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
		});
    }
}