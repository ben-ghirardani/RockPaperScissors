package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/08/2017.
 */

public class Game {

    String[] computer = new String[]{"Rock", "Paper", "Scissors"};
    Game game;

    public int countResults() {
        return computer.length;
    }

    public String getAnswerFromComputer () {
        Random generator = new Random();
        int randomIndex = generator.nextInt(computer.length);
        String result = computer[randomIndex];
        return result;
    }

    public String runGame(String playerChoice, String computerChoice) {
        if (playerChoice == computerChoice) {
            return "It's a draw!";
        } else if (playerChoice == "Rock" && computerChoice == "Paper") {
            return "Computer wins!";
        } else if (playerChoice == "Rock" && computerChoice == "Scissors") {
            return "Player wins!";
        } else if (playerChoice == "Paper" && computerChoice == "Rock") {
            return "Player wins!";
        } else if (playerChoice == "Paper" && computerChoice == "Scissors") {
            return "Computer wins!";
        } else if (playerChoice == "Scissors" && computerChoice == "Rock") {
            return "Computer wins";
        } else {
            return "Player wins!"
        }
    }

}
