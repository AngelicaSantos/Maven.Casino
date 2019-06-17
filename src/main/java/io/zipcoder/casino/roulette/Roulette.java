package io.zipcoder.casino.roulette;

import io.zipcoder.casino.Gamble;
import io.zipcoder.casino.Game;
import io.zipcoder.casino.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Roulette extends Game implements Gamble {

    String betType;
    protected Player roulettePlayer;
    private Double currentBet;
    private ArrayList<RoulettePanel> betPanel;
    Console console = new Console(System.in, System.out);

     RoulettePanel[] roulettePanel = {
             new RoulettePanel(Color.RED, 1),
             new RoulettePanel(Color.BLACK, 2),
             new RoulettePanel(Color.RED,3),
             new RoulettePanel(Color.BLACK, 4),
             new RoulettePanel(Color.RED, 5),
             new RoulettePanel(Color.BLACK, 6),
             new RoulettePanel(Color.RED,7),
             new RoulettePanel(Color.BLACK, 8),
             new RoulettePanel(Color.RED, 9),
             new RoulettePanel(Color.BLACK, 10),
             new RoulettePanel(Color.BLACK,11),
             new RoulettePanel(Color.RED, 12),
             new RoulettePanel(Color.BLACK, 13),
             new RoulettePanel(Color.RED, 14),
             new RoulettePanel(Color.BLACK,15),
             new RoulettePanel(Color.RED, 16),
             new RoulettePanel(Color.BLACK,17),
             new RoulettePanel(Color.RED, 18),
             new RoulettePanel(Color.RED, 19),
             new RoulettePanel(Color.BLACK, 20),
             new RoulettePanel(Color.RED,21),
             new RoulettePanel(Color.BLACK, 22),
             new RoulettePanel(Color.RED, 23),
             new RoulettePanel(Color.BLACK,24),
             new RoulettePanel(Color.RED, 25),
             new RoulettePanel(Color.BLACK,26),
             new RoulettePanel(Color.RED, 27),
             new RoulettePanel(Color.BLACK, 28),
             new RoulettePanel(Color.BLACK, 29),
             new RoulettePanel(Color.RED,30),
             new RoulettePanel(Color.BLACK, 31),
             new RoulettePanel(Color.RED, 32),
             new RoulettePanel(Color.BLACK,33),
             new RoulettePanel(Color.RED, 34),
             new RoulettePanel(Color.BLACK,35),
             new RoulettePanel(Color.RED, 36),
             new RoulettePanel(Color.GREEN, 0),
             new RoulettePanel(Color.GREEN, 0)
     };


    public RoulettePanel spin() {
        Random random = new Random();
        return roulettePanel[random.nextInt(roulettePanel.length)];
    }


    public Roulette(Player roulettePlayer) {
        this.roulettePlayer = roulettePlayer;
    }



    public void nextTurn() {

    }


    public void endGame() {

    }


    public boolean getResults() {
        // determine win or loose
        return false;
    }


    public Integer calcPayment(Integer bet, Integer odds) {

        return bet + odds * bet;
    }


    public void updateAccount(Integer num) {
        //add or remove money from the balance
        this.roulettePlayer.setAccount((double)(num));
    }

    public Double getCurrentBet() {

        return currentBet;
    }

    public void setCurrentBet(Double currentBet) {
        this.currentBet = currentBet;
    }

    public Double calcPayment(Double bet, Double odds) {

        return bet + odds * bet;
    }

    public void withdraw(Double num) {

    }

    public void deposit(Double num) {

    }

    public void play() {
        String welcome = "Welcome to Roulette!";
        console.println(welcome);

        // Get Bet Amount
        Scanner sc = new Scanner(System.in);
        console.println("Please enter Bet amount : ");
        int enterBet = sc.nextInt();
        sc.nextLine();


        console.println("Bet position : ");
        String betPosition = sc.nextLine();

        // Calculate the odds based on the position.
        double odds;
        if(betPosition.equalsIgnoreCase("red") || betPosition.equalsIgnoreCase("Black") || betPosition.equalsIgnoreCase("even") || betPosition.equalsIgnoreCase("odd")) {
            odds = 1d;

        }
        else if(betPosition.equalsIgnoreCase("1st12") || betPosition.equalsIgnoreCase("2nd12") || betPosition.equalsIgnoreCase("3rd12")) {
            odds = 2d;
        }
        else {
            odds = 35d;
        }

        // Deduct the current bet from the account balance
        this.updateBalance(enterBet * (-1d));

        // Generate a random number where the ball is going to fall - Range should be 0 to 36
        int random = (int)(Math.random() * 36 + 1);
        console.println(" Winning Number " +random);
        //System.out.println("Even " +);

        // Identify if the position of bet is winning position
        if(isWinner(betPosition, random)) {
            console.println("You Won!");
            double d = calcPayment((double)enterBet,odds );
            updateBalance(d);
        }
        else {
            console.println("Sorry..You Lose");
        }
        console.println("Game Over \n");
        console.println("Your Balance is : " +this.roulettePlayer.getAccount());
        // Update the Account Balance


    }
    public void updateBalance(Double amount) {
        String d = this.roulettePlayer.getAccount();
        String add = d + amount;
        this.roulettePlayer.setAccount(Double.parseDouble(add));

    }

    public boolean isWinner(String betPosition,int random  ) {
        if(betPosition.equalsIgnoreCase("even") && random % 2 == 0) {
            return true;
        }
        else if(betPosition.equalsIgnoreCase("odd") && random % 2 != 0) {
            return true;
        }

        else if(betPosition.equalsIgnoreCase("1st12") && random <= 12 && random >=1) {
            return true;
        }
        else if(betPosition.equalsIgnoreCase("2nd12") && random <=24 && random >=13) {
            return true;
        }
        else if(betPosition.equalsIgnoreCase("3rd12") && random <= 36 && random >=14) {
            return true;
        }
        else if(betPosition.equalsIgnoreCase(Integer.toString(random))) {
            return true;
        }
        return false;
    }

    @Override
    public Integer payOut(Integer amount) {
        return amount;
    }


}



















