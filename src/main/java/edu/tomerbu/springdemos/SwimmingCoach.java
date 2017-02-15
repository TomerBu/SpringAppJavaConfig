package edu.tomerbu.springdemos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by tomerbuzaglo on 15/02/2017.
 */

@Scope("prototype")
@Component
public class SwimmingCoach implements Coach {

    // The value is read from the app.properties file loaded in the configuration file using the @PropertySource Annotation
    @Value("${co.team}")
    private String team;

    public String getDailyWorkout() {
        return "Swim 1000m for worm up";
    }

    //OnCreate Life Cycle Method
    @PostConstruct
    public void init() {
        System.out.println("init " + getClass().getName());
        System.out.println("The Team: " + team);
    }

    //OnDestroy Life Cycle Method
    @PreDestroy
    public void stop() {
        System.out.println("stop " + getClass().getName());
    }

    //Injected, using the qualifier if there is more than one @Component that matches the type injected.
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneTeller(FortuneTeller fortuneTeller) {
        this.fortuneTeller = fortuneTeller;
    }

    //this field is injected with the setter above
    private FortuneTeller fortuneTeller;

    //using the fortuneTeller Field that was injected.
    public String getDailyFortune() {
        return fortuneTeller.getDailyFortune();
    }
}
