package game;
import java.util.Scanner;
import java.util.*;

public class Battingproject {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random random1 = new Random();
        battingmethods battingmethods = new battingmethods();
        int ballcount = 0;
        int wickets = 10;
        int yourscore = 0;
        String bigshot = "Big shot";
        String driveshot = "Drive shot";
        String defenseshot = "Defense shot";
        // boolean validateshotchoice1;
        // boolean validateshotchoice2;
        // boolean validateshotchoice3;

        for (int i = -18; i < ballcount; i++) {
            if (wickets > 0) {
                int balltype = random1.nextInt(4) + 1;
                int trivia1 = random1.nextInt(21);
                int trivia2 = random1.nextInt(21);

                if (balltype == 1) {

                    System.out.println("Answer the following: what is " + trivia1 + " times " + trivia2 + "?");
                    int useranswerfortrivia = reader.nextInt();
                    if (useranswerfortrivia == trivia1 * trivia2)
                        ;
                    {
                        System.out.println(
                                "Correct! The opposing team will bowl a full ball. What shot type do you want to play against it? Big shot, drive shot, or defense shot?");
                        String usershotchoice = reader.next();

                        if (usershotchoice.equals(bigshot)) {
                            battingmethods.ball1shot1();
                        }

                        if (usershotchoice.equals(driveshot)) {
                            battingmethods.ball1shot2();
                        }

                        if (usershotchoice.equals(defenseshot)) {
                            battingmethods.ball1shot3();
                        }

                    }

                    if (useranswerfortrivia != trivia1 * trivia2)
                        ;
                    {
                        System.out.println(
                                "Incorrect! We cannot reveal the ball type that the opposing team will bowl. What shot type do you want to play? Big shot, Drive shot, or Defense shot? Type it in exactly as printed.");
                        String usershotchoice = reader.next();

                        if (usershotchoice.equals(bigshot)) {
                            battingmethods.ball1shot1();
                        }
                        if (usershotchoice.equals(driveshot)) {
                            battingmethods.ball1shot2();
                        }
                        if (usershotchoice.equals(defenseshot)) {
                            battingmethods.ball1shot3();
                        }
                    }

                    if (balltype == 2) {

                        System.out.println("Answer the following: what is " + trivia1 + " times " + trivia2 + "?");
                        useranswerfortrivia = reader.nextInt();
                        if (useranswerfortrivia == trivia1 * trivia2)
                            ;
                        {
                            System.out.println(
                                    "Correct! The opposing team will bowl a short ball. What shot type do you want to play against it? Big shot, drive shot, or defense shot?");
                            String usershotchoice = reader.next();

                            if (usershotchoice.equals(bigshot)) {
                                battingmethods.ball1shot1();
                            }
                            if (usershotchoice.equals(driveshot)) {
                                battingmethods.ball1shot2();
                            }
                            if (usershotchoice.equals(defenseshot)) {
                                battingmethods.ball1shot3();
                            }

                        }
                    }

                    if (useranswerfortrivia != trivia1 * trivia2)
                        ;
                    {
                        System.out.println(
                                "Incorrect! We cannot reveal the ball type that the opposing team will bowl. What shot type do you want to play? Big shot, Drive shot, or Defense shot? Type it in exactly as printed.");
                        String usershotchoice = reader.next();

                        if (usershotchoice.equals(bigshot)) {
                            battingmethods.ball1shot1();
                        }
                        if (usershotchoice.equals(driveshot)) {
                            battingmethods.ball1shot2();
                        }
                        if (usershotchoice.equals(defenseshot)) {
                            battingmethods.ball1shot3();
                        }
                    }

                    if (balltype == 3) {

                        System.out.println("Answer the following: what is " + trivia1 + " times " + trivia2 + "?");
                        useranswerfortrivia = reader.nextInt();
                        if (useranswerfortrivia == trivia1 * trivia2)
                            ;
                        {
                            System.out.println(
                                    "Correct! The opposing team will bowl a good ball. What shot type do you want to play against it? Big shot, drive shot, or defense shot?");
                            String usershotchoice = reader.next();

                            if (usershotchoice.equals(bigshot)) {
                                battingmethods.ball1shot1();
                            }
                            if (usershotchoice.equals(driveshot)) {
                                battingmethods.ball1shot2();
                            }
                            if (usershotchoice.equals(defenseshot)) {
                                battingmethods.ball1shot3();
                            }

                        }
                    }

                    if (useranswerfortrivia != trivia1 * trivia2)
                        ;
                    {
                        System.out.println(
                                "Incorrect! We cannot reveal the ball type that the opposing team will bowl. What shot type do you want to play? Big shot, Drive shot, or Defense shot? Type it in exactly as printed.");
                        String usershotchoice = reader.next();

                        if (usershotchoice.equals(bigshot)) {
                            battingmethods.ball1shot1();
                        }
                        if (usershotchoice.equals(driveshot)) {
                            battingmethods.ball1shot2();
                        }
                        if (usershotchoice.equals(defenseshot)) {
                            battingmethods.ball1shot3();
                        }

                    }

                    if (balltype == 4) {

                        System.out.println("Answer the following: what is " + trivia1 + " times " + trivia2 + "?");
                        useranswerfortrivia = reader.nextInt();
                        if (useranswerfortrivia == trivia1 * trivia2)
                            ;
                        {
                            System.out.println(
                                    "Correct! The opposing team will bowl a perfect ball. What shot type do you want to play against it? Big shot, drive shot, or defense shot?");
                            String usershotchoice = reader.next();

                            if (usershotchoice.equals(bigshot)) {
                                battingmethods.ball1shot1();
                            }
                            if (usershotchoice.equals(driveshot)) {
                                battingmethods.ball1shot2();
                            }
                            if (usershotchoice.equals(defenseshot)) {
                                battingmethods.ball1shot3();
                            }

                        }
                    }

                    if (useranswerfortrivia != trivia1 * trivia2)
                        ;
                    {
                        System.out.println(
                                "Incorrect! We cannot reveal the ball type that the opposing team will bowl. What shot type do you want to play? Big shot, Drive shot, or Defense shot? Type it in exactly as printed.");
                        String usershotchoice = reader.next();
                        if (usershotchoice.equals(bigshot)) {
                            battingmethods.ball1shot1();
                        }
                        if (usershotchoice.equals(driveshot)) {
                            battingmethods.ball1shot2();
                        }
                        if (usershotchoice.equals(defenseshot)) {
                            battingmethods.ball1shot3();
                        }

                    }
                }

                if (wickets == 0) {
                    System.out.println("Your team is all out! Innings over!");
                }

            }

            System.out.println("Your final innings score is: " + yourscore + " runs, " + wickets
                    + " wickets lost. Take a quick break and get ready for the second half of the game!");

        }
    }
}