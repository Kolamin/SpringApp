package ru.anton.springcuorse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}