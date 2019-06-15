package io.zipcoder.casino.Slots;

import io.zipcoder.casino.Gamble;
import io.zipcoder.casino.SpinGame;
import io.zipcoder.casino.utilities.Console;

public class SlotsMediator {


  public void slotsMediator() {

      Console myConsole = new Console(System.in, System.out);

      String consoleText;

      Integer n0 = 1;
      Integer n1 = 10;
      Integer n2 = 100;
      Integer n3 = 1000;
      Integer n4 = 10000;

      Integer payLines = 0;
      Integer payOut = 0;
      Integer odds = (int) (0.9 * (8 * 8 * 8) / 7);

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

      consoleText = "";
      myConsole.println(consoleText);

      consoleText = "How many dollars do you want to bet? ";
      Integer myBet = myConsole.getIntegerInput(consoleText);//

      Slots slots = new Slots();
      Integer myResult = slots.spin();


      if (myResult >= n4) {
          payLines++;
          myResult = myResult - n4;
      }

      if (myResult >= n3) {
          payLines++;
          myResult = myResult - n3;
      }

      if (myResult >= n2) {
          payLines++;
          myResult = myResult - n2;
      }

      if (myResult >= n1) {
          payLines++;
          myResult = myResult - n1;
      }

      if (myResult >= n0) {
          payLines++;
          myResult = myResult - n0;
      }

        payOut = myBet * payLines * odds;

        if (payLines == 0) {
            consoleText = "Sorry, you lose!";
            myConsole.println(consoleText);
        }
        else {
            consoleText = "You win $" + payOut + " !";
            myConsole.println(consoleText);
        }




  }




      public static boolean isInteger (String s){
          try {
              Integer.parseInt(s);
          } catch (NumberFormatException e) {
              return false;
          } catch (NullPointerException e) {
              return false;
          }
          return true;
      }

}


