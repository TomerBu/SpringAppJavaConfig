package edu.tomerbu.springdemos;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by tomerbuzaglo on 15/02/2017.
 */


public class SadFortuneService implements FortuneTeller {

    private String[] fortunes = {
            "You'll be sorry for what you just did...",
            "Good news from afar can turn you down unexpectedly",
            "I See a black stain in your coffee"
    };
    private static Random randGen = new Random();

    public String getDailyFortune() {
        return fortunes[randGen.nextInt(fortunes.length)];
    }
}
