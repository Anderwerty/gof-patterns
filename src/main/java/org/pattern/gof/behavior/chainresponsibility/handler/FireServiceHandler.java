package org.pattern.gof.behavior.chainresponsibility.handler;

import org.pattern.gof.behavior.chainresponsibility.domain.Criterion;
import org.pattern.gof.behavior.chainresponsibility.domain.Request;
import org.pattern.gof.behavior.chainresponsibility.domain.Response;

public class FireServiceHandler implements ServiceHandler {
    @Override
    public void handle(Request request, Response response) {
        boolean isFire = checkIfShouldBeInvoked(request, Criterion.FIRE_DEPARTMENT);
        if (isFire) {
            response.addMessage("Firefighters came to you");
        }
    }


}
