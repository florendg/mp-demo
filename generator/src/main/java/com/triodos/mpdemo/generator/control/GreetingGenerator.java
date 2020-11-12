package com.triodos.mpdemo.generator.control;

import java.text.MessageFormat;

public class GreetingGenerator {

    public String greet(String name) {
        return MessageFormat.format("Hello {0}",name);
    }
}
