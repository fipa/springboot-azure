package dev.fpoblete.springbootazure.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class KindPersonTest {

    @Test
    public void itShouldSayHelloKindly() {
        assertEquals("Kind greetings", new KindPerson().sayHello());
    }

}