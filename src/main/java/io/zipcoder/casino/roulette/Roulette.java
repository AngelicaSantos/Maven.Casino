package io.zipcoder.casino.roulette;
import io.zipcoder.casino.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.Random;
import java.util.Scanner;

public class Roulette
{
    Player player;

    public Roulette(Player player) {
        this.player=player;
    }

    public void startRoulette() {
    }

    public Integer getPlayerBalance() {
        return getPlayerBalance();
    }

    public Integer playerBet() {
        return playerBet();
    }

    public void run()
        {
            Console console = new Console(System.in, System.out);
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        double total = player.getMoney();
        double amount;
        int choice, win = 0, lose = 0, spin = 0;
        int number;
        int rouletteNum;
        int result;
        char response = 'y';
        int resultArr[] = new int[36];

        while (response == 'y' || response == 'Y' && total <= 0 )
        {
        console.println("Enter your bet amount: ");
        amount = keyboard.nextDouble();
        console.println("0 - Even\n1 - Odd\n2 - Number\n");
        choice = -1;


        while (choice < 0 || choice > 2)
        {
        console.println("Place your bet on: ");
        choice = keyboard.nextInt();
        }
        number = 0;
        if (choice == 2)
        {
        while (number < 1 || number > 36)
        {
        console.println("Place your bet on number(1-36): ");
        number = keyboard.nextInt();
        }
        }
        rouletteNum = generator.nextInt(37);
        spin++;
        console.println("Roulette number: " + rouletteNum);

        if (choice == 2)
        {
        if (rouletteNum == number)
        result = 35;
        else
        result = 0;
        }
        else
        {
        if (rouletteNum == 0 || rouletteNum % 2 != choice)
        result = 0;
        else
        result = 1;
        }

        //Print out game result, win/lose amount
        if (result > 0)
        {
        console.println("Congratulatons!!! You win!");
        console.println("You have won $%.2f \n", result * amount);
        console.println("Here's your money back: $%.2f \n",
        (result + 1) * amount);
        total = (result + 1) * amount + total;
        win ++;
        resultArr[rouletteNum]++;

        }
        else
        {
        console.println("You lose. Better luck next time!");
        console.println("You have lost $%.2f \n",
        (result + 1) * amount);
        total = total - (result + 1) * (amount);
        lose ++;
        resultArr[rouletteNum]++;

        if (total <= 0) {
        break;
        }

        }

        //Ask for another game
        for (int totals=1; totals<36; totals++) {
        if( resultArr[totals] > 0 ) {
        console.println("The number " + totals + " won " + resultArr[totals] + " times.");
        }
        }


        console.println("You haye $" + total + " remaining." );
        console.println("You have won " + win + " games.");
        console.println("You have lost " + lose + " games.");
        console.println("The wheel has been spun " + spin + " times.");
        console.println("\nWould you like to play another game? (y/n) ");

        response = keyboard.next().charAt(0);



        }

        }


}
































