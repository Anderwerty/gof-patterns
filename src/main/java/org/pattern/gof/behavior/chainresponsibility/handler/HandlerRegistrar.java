package org.pattern.gof.behavior.chainresponsibility.handler;

import org.pattern.gof.behavior.chainresponsibility.domain.Request;
import org.pattern.gof.behavior.chainresponsibility.domain.Response;

import java.util.List;

public class HandlerRegistrar {
    private final List<ServiceHandler> handlers;

    public HandlerRegistrar(List<ServiceHandler> handlers) {
        this.handlers = handlers;
    }

    public Response handleRequests(Request request) {
        Response response = new Response();
        handlers.forEach(x -> x.handle(request, response));

        return  response;
    }
}
