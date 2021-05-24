package org.pattern.gof.behavior.chainresponsibility.handler;

import org.pattern.gof.behavior.chainresponsibility.domain.Criterion;
import org.pattern.gof.behavior.chainresponsibility.domain.Request;
import org.pattern.gof.behavior.chainresponsibility.domain.Response;

public interface ServiceHandler {

    void handle(Request request, Response response);

    default boolean checkIfShouldBeInvoked(Request request, Criterion criterion) {
        return request.getCriteria().stream().anyMatch(x -> x == criterion);
    }
}
