package a_SimpleProjects.a12_SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotSymbolGame {
    public static void main(String[] args) {

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        Scanner in = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println(" Welcome to JAVA Slots Game");
        System.out.println("  Symbols: 🍕 🧨 ✨ 🎉 🎀");
        System.out.println("***************************");

        while (balance > 0) {

            System.out.println("Current balnce: $" + balance);
            System.out.print("Enter your bet amount: ");
            bet = in.nextInt();
            in.nextInt();

            if(bet > balance){
                System.out.println("Insuffitient amount!!!!!");
                continue;

            } else if (bet <= 0) {
                System.out.println("Bet can not be negative!!!!");
                continue;

            }else {
                balance-= bet;
            }

            System.out.println("Spinning ...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);
            if (payout > 0){
                System.out.println("You Won $" + payout);
                balance += payout;
            }else {
                System.out.println("Sorry you lost this round");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine().toLowerCase();
            if(!playAgain.equals("Y")){
                break;
            }
        }

    }

    public static String[] spinRow(){
        String[] symbols = {"🍕", "🧨",  "✨",  "🎉", "🎀"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        //System.out.print(row[0] + row[1] + row[2]);
        return row;
    }

    public static void printRow(String[] row){
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************");

    }

    public static int getPayout(String[] row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍕" ->  bet * 5;
                case "✨" ->  bet * 10;
                case "🧨" ->  bet * 15;
                case "🎉" ->  bet * 20;
                case "🎀" ->  bet * 50;
                default -> 0;

            };
        } else  if (row[0].equals(row[1])){
            return switch (row[0]){
                case "🍕" ->  bet * 3;
                case "✨" ->  bet * 5;
                case "🧨" ->  bet * 8;
                case "🎉" ->  bet * 10;
                case "🎀" ->  bet * 20;
                default -> 0;

            };
        }else  if (row[2].equals(row[1])){
            return switch (row[1]){
                case "🍕" ->  bet * 3;
                case "✨" ->  bet * 5;
                case "🧨" ->  bet * 8;
                case "🎉" ->  bet * 10;
                case "🎀" ->  bet * 20;
                default -> 0;

            };
        }else  if (row[0].equals(row[2])){
            return switch (row[2]){
                case "🍕" ->  bet * 3;
                case "✨" ->  bet * 5;
                case "🧨" ->  bet * 8;
                case "🎉" ->  bet * 10;
                case "🎀" ->  bet * 20;
                default -> 0;

            };
        }

            return 0;
    }
}
