package io.zipcoder.casino.roulette;

import io.zipcoder.casino.utilities.Console;

import java.util.Scanner;



public class RouletteMediator {


    Scanner RouletteScanner;
    String response;
    Boolean playerRequest;
    Integer gameAction;



    public RouletteMediator() {
        RouletteScanner = new Scanner(System.in);
    }

    public void welcometoRoulette() {
        Console.println("Welcome to Roulette");
    }

    public Integer gameAction() {
        Console.println("Would you like to Bet?" + "\n 1)Yes" + "\n 2)No");
        gameAction = RouletteScanner.nextInt();

        if( gameAction == 1 || gameAction == 2) {
            return gameAction;
        }

        else {
            System.out.println("Please enter a valid number");
                    return gameAction;

        }
    }
//
//



}
