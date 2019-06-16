package io.zipcoder.casino.Slots;

import io.zipcoder.casino.Gamble;
import io.zipcoder.casino.SpinGame;
import io.zipcoder.casino.utilities.Console;

//public class Slots extends SpinGame implements Gamble {
    public class Slots extends SpinGame {


        @Override
        public Integer spin() {
            Integer iBet = 0;
            String slotFace = "";
            Integer results = 0;

            Reel reel0 = new Reel();
            Reel reel1 = new Reel();
            Reel reel2 = new Reel();

            reel0.spin();
            reel1.spin();
            reel2.spin();

            slotFace ="\n";

            slotFace += "--------------------------------------------" + "\n";
            slotFace += "| " + reel0.getReelPlace(0);   // A
            slotFace += "| " + reel1.getReelPlace(0);   // B
            slotFace += "| " + reel2.getReelPlace(0);   // C
            slotFace += " |" + "\n";
            slotFace += "--------------------------------------------" + "\n";

            slotFace += "| " + reel0.getReelPlace(1);   // D
            slotFace += "| " + reel1.getReelPlace(1);   // E
            slotFace += "| " + reel2.getReelPlace(1);   // F
            slotFace += " |" + "\n";
            slotFace += "--------------------------------------------" + "\n";

            slotFace += "| " + reel0.getReelPlace(2);   // G
            slotFace += "| " + reel1.getReelPlace(2);   // H
            slotFace += "| " + reel2.getReelPlace(2);   // I
            slotFace += " |" + "\n";
            slotFace += "--------------------------------------------" + "\n";


            Console myConsole = new Console(System.in, System.out);
            myConsole.println(slotFace);

            results = 0;

           iBet = SlotsMediator.getBet();

            if (iBet >= 1) {

                // Middle horizontal
                if ((reel0.getReelPlace(1) == reel1.getReelPlace(1)) && (reel0.getReelPlace(1) == reel2.getReelPlace(1))) {
                    results++;
                }
            }



            if (iBet >= 3) {

                // Top Horizontal
                if ((reel0.getReelPlace(0) == reel1.getReelPlace(0)) && (reel0.getReelPlace(0) == reel2.getReelPlace(0))) {
                    results++;
                }

                // Bottom horizontal
                if ((reel0.getReelPlace(2) == reel1.getReelPlace(2)) && (reel0.getReelPlace(2) == reel2.getReelPlace(2))) {
                    results++;
                }
            }



            if (iBet >= 5) {

                // Diagonal toward top left
                if ((reel0.getReelPlace(0) == reel1.getReelPlace(1)) && (reel0.getReelPlace(0) == reel2.getReelPlace(2))) {
                    results++;
                }

                // Diagonal toward top right
                if ((reel2.getReelPlace(0) == reel1.getReelPlace(1)) && (reel2.getReelPlace(0) == reel0.getReelPlace(2))) {
                    results++;
                }
            }
            return results;
        }

    }


