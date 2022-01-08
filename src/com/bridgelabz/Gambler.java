package com.bridgelabz;

import java.util.Random;

public class Gambler {

    private static final int DAILY_STAKE = 100;
    private static final int GAME_BET = 1;
    private static final Random random = new Random();
    private static final int IS_WON = 1;


    public static void main(String[] args) {


        int j=1;
        int totalWon=0;
        int totalLoss=0;
        int winMax=0;
        int winLoss=0;
        int luckDay=0;
        int unluckDay=0;
        while(j<=20)
        {
            int winCount = 0;
            int loseCount=0;
            int i =0;
            while (i <= DAILY_STAKE) {
                int betResult = random.nextInt(2);
                //System.out.println(betResult);
                if (betResult == IS_WON)
                    winCount++;
                else
                    loseCount++;
                if (winCount == DAILY_STAKE / 2) {
                    System.out.println("Won 50% Daily Stake for the Day");
                    break;
                }
                if (loseCount == DAILY_STAKE / 2) {
                    System.out.println("Loss 50% Daily Stake for the Day");
                    break;
                }

                i++;


            }
            totalWon=totalWon+winCount;
            totalLoss=totalLoss+loseCount;
            int diff=winCount-loseCount;
            if(diff>0)
            System.out.println("Day "+j+" Win Count "+winCount+" Lose Count "+loseCount+ "Won By "+diff);
            else
                System.out.println("Day "+j+" Win Count "+winCount+" Lose Count "+loseCount+"Lost By "+(-diff));
            j++;
            if(winCount>winMax) {
                winMax = winCount;
            }
            if (loseCount>winLoss) {
                winLoss = loseCount;
            }

        }
        System.out.println("Total Won "+totalWon);
        System.out.println("Total Loss "+totalLoss);
        System.out.println(" Win Max  "+winMax);
        System.out.println(" Win Loss "+winLoss);

    }
}
