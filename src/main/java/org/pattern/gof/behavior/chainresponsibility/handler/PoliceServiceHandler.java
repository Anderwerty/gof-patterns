package org.pattern.gof.behavior.chainresponsibility.handler;

import org.pattern.gof.behavior.chainresponsibility.domain.Criterion;
import org.pattern.gof.behavior.chainresponsibility.domain.Request;
import org.pattern.gof.behavior.chainresponsibility.domain.Response;

public class PoliceServiceHandler implements ServiceHandler{
    @Override
    public void handle(Request request, Response response) {
        boolean isPolice = checkIfShouldBeInvoked(request, Criterion.POLICE);
        if (isPolice) {
            response.addMessage("The police will arrive soon");
        }
    }
}
