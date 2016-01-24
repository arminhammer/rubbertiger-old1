package arminhammer.rubbertiger;

import io.vertx.core.AbstractVerticle;
//import io.vertx.core.Vertx;


public class ServerVerticle extends AbstractVerticle {

    @Override
    public void start() {
        // Create an HTTP server which simply returns "Hello World!" to each request.
        vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World from Vertx!")).listen(8080);
        vertx.createHttpServer().requestHandler(req -> req.response().end("Welcome to the admin listener!")).listen(8081);
    }
}