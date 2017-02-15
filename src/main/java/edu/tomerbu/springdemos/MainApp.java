package edu.tomerbu.springdemos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by tomerbuzaglo on 15/02/2017.
 */
public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Coach coach = context.getBean("swimmingCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }
}
