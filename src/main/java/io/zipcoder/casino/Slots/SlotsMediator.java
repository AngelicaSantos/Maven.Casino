package io.zipcoder.casino.Slots;

import io.zipcoder.casino.Gamble;
import io.zipcoder.casino.SpinGame;
import io.zipcoder.casino.utilities.Console;

public class SlotsMediator {

static Integer myBet;

  public static void slotsMediator(SlotsPlayer player) {

      Integer payOut = 0;

        Integer wallet = 100;
        Integer turns = 0;

      SlotsPlayer myPlayer = player;


      Slots slots = new Slots();

      Console myConsole = new Console(System.in, System.out);


      while ((wallet > 0) && (wallet <=3000)) {

          String consoleText;

          Integer payLines = 0;

          Integer odds = (int) (0.70 * (8 * 8 * 8));

          consoleText = "Welcome to ZCW Slots!";
          myConsole.println(consoleText);

          consoleText = "";
          myConsole.println(consoleText);

          consoleText = "$1 bet gets the middle horizontal PayLine.";
          myConsole.println(consoleText);

          consoleText = "$3 bet gets all three horizontal PayLines.";
          myConsole.println(consoleText);

          consoleText = "$5 bet gets all horizontal and two diagonal PayLines.";
          myConsole.println(consoleText);

          consoleText = "0 ends the game. ";
          myConsole.println(consoleText);

          consoleText = "How many dollars do you want to bet (1 - 3 - 5) ?" ;
          myBet = myConsole.getIntegerInput(consoleText);

          if (myBet == 0) {
              break;
          }

//          myConsole.print(consoleText);
//          myBet = myPlayer.bet();
//          consoleText = myBet.toString();
//          myConsole.println(consoleText);

          if (wallet < 5) myBet = 3;
          if (wallet < 3) myBet = 1;

          wallet = wallet - myBet;

          turns++;

          Integer myResult = slots.spin();

          payOut = myResult * odds;


          if (payOut > 0) {
              consoleText = "You won $" + payOut + " !";
              myConsole.println(consoleText);

          } else {
              consoleText = "Sorry, you lose. ";
              myConsole.println(consoleText);

          }

          wallet = wallet + payOut;


          consoleText = "Your wallet is $" + wallet + " after " + turns + " turns !";
          myConsole.println(consoleText);

      }

  }

      public static Integer getBet() {
          return myBet;
      }

  }








