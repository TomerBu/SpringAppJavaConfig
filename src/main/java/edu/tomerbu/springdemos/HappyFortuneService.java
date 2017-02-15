package edu.tomerbu.springdemos;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by tomerbuzaglo on 15/02/2017.
 */

@Component
public class HappyFortuneService implements FortuneTeller {

    private String[] fortunes = {
            "Today is your lucky day!",
            "Love is in the air",
            "Work hard and your wishes will come true",
            "See the good in your actions and good will come",
            "Always do right.  This will gratify some people and astonish the rest."
    };
    private static Random randGen = new Random();

    public String getDailyFortune() {
        return fortunes[randGen.nextInt(fortunes.length)];
    }
}
