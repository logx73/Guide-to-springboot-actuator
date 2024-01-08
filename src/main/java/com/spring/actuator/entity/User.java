package com.spring.actuator.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component // Annotation used for automatically registering  instance of the class in application context.
@RequiredArgsConstructor // Lombok's annotation used for generating parameterized constructor.
@Data // Lombok's annotation for generating getter's, setter's, toString, EqualsAndHashCode for fields.
public class User {
    private int id = 1;
    private String name = "Lokesh Gadiya";
    private String userName = "@lucky73";
    private String email = "logx@geek";
    private String pincode = "413-709";
}
