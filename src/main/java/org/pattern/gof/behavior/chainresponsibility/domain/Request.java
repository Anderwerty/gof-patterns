package org.pattern.gof.behavior.chainresponsibility.domain;

import java.util.List;
import java.util.Objects;

public class Request {
    private final String address;
    private final List<Criterion> criteria;

    public Request(String address, List<Criterion> criteria) {
        this.address = address;
        this.criteria = criteria;
    }

    public List<Criterion> getCriteria() {
        return criteria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(address, request.address) && Objects.equals(criteria, request.criteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, criteria);
    }
}
