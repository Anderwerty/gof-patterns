package org.pattern.gof.behavior.chainresponsibility.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Response {
    private final List<String> messages;

    public Response() {
        this.messages = new ArrayList<>();
    }

    public List<String> getMessages() {
        return Collections.unmodifiableList(messages);
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    @Override
    public String toString() {
        return "Response{" +
                "messages=" + Arrays.toString(messages.toArray()) +
                '}';
    }
}
