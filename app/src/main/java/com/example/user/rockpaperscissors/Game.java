package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/08/2017.
 */

public class Game {

    String[] computer = new String[]{"Rock", "Paper", "Scissors"};


    public int countResults() {
        return computer.length;
    }

    public String getAnswerFromComputer () {
        Random generator = new Random();
        int randomIndex = generator.nextInt(computer.length);
        String result = computer[randomIndex];
        return result;
    }

    

}
