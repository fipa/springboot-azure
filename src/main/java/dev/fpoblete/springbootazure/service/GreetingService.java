package dev.fpoblete.springbootazure.service;

import dev.fpoblete.springbootazure.domain.KindPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private KindPerson person;

    public String sayHello() {
        return person.sayHello();
    }


}
