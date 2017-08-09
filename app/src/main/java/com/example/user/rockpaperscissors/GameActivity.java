package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Game game = new Game();
    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        buttonRock = (Button)findViewById(R.id.button_rock);
        buttonPaper = (Button)findViewById(R.id.button_paper);
        buttonScissors = (Button)findViewById(R.id.button_scissors);
    }

    public void onButtonClickedRock(View buttonRock)  {
        String playerChoice = "Rock";
        String computerChoice = game.getAnswerFromComputer();
        String result = game.runGame(playerChoice, computerChoice);
        TextView playerChoiceText = (TextView)findViewById(R.id.player_choice_text);
        TextView computerChoiceText = (TextView)findViewById(R.id.computer_choice_text);
        TextView resultText = (TextView)findViewById(R.id.result_text);
        playerChoiceText.setText("You picked " + playerChoice);
        computerChoiceText.setText("Computer picked " + computerChoice);
        resultText.setText("Result: " + result);
    }

    public void onButtonClickedPaper(View buttonPaper)  {
        String playerChoice = "Paper";
        String computerChoice = game.getAnswerFromComputer();
        String result = game.runGame(playerChoice, computerChoice);
        TextView playerChoiceText = (TextView)findViewById(R.id.player_choice_text);
        TextView computerChoiceText = (TextView)findViewById(R.id.computer_choice_text);
        TextView resultText = (TextView)findViewById(R.id.result_text);
        playerChoiceText.setText("You picked " + playerChoice);
        computerChoiceText.setText("Computer picked " + computerChoice);
        resultText.setText("Result: " + result);
    }

    public void onButtonClickedScissors(View buttonScissors)  {
        String playerChoice = "Scissors";
        String computerChoice = game.getAnswerFromComputer();
        String result = game.runGame(playerChoice, computerChoice);
        TextView playerChoiceText = (TextView)findViewById(R.id.player_choice_text);
        TextView computerChoiceText = (TextView)findViewById(R.id.computer_choice_text);
        TextView resultText = (TextView)findViewById(R.id.result_text);
        playerChoiceText.setText("You picked " + playerChoice);
        computerChoiceText.setText("Computer picked " + computerChoice);
        resultText.setText("Result: " + result);
    }
}
