package game;

import java.util.*;

public class battingmethods {

    int ballcount = 18; // whatever the user enters
    int wickets = 10;
    int yourscore = 0;
    String bigshot = "Big shot";
    String driveshot = "Drive shot";
    String defenseshot = "Defense shot";

    public static void wicket(int wickets, int ballcount, int yourscore) {
        wickets = wickets - 1;
        ballcount = ballcount + 1;
        System.out.println("You are out! The next batter is on their way in. Your new score is: " + yourscore
                + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
    }

    public static void runreaction(int runsadded, int yourscore, int ballcount, int wickets) {
        switch (runsadded) {
            case 0:

                yourscore = runsadded + yourscore;
                ballcount = ballcount + 1;
                System.out.println("Not bad, dot ball (No runs). Your new score is: " + yourscore + " runs, " + wickets
                        + " wickets down, " + ballcount + " balls elapsed.");

            case 1:

                yourscore = runsadded + yourscore;
                ballcount = ballcount + 1;
                System.out.println("Well played, 1 run. Your new score is: " + yourscore + " runs, " + wickets
                        + " wickets down, " + ballcount + " balls elapsed.");

            case 2:

                yourscore = runsadded + yourscore;
                ballcount = ballcount + 1;
                System.out.println("Nicely played, 2 runs. Your new score is: " + yourscore + " runs, " + wickets
                        + " wickets down, " + ballcount + " balls elapsed.");

            case 3:

                yourscore = runsadded + yourscore;
                ballcount = ballcount + 1;
                System.out.println("Good shot, 3 runs. Your new score is: " + yourscore + " runs, " + wickets
                        + " wickets down, " + ballcount + " balls elapsed.");

            case 4:

                yourscore = runsadded + yourscore;
                ballcount = ballcount + 1;
                System.out.println("Great shot! Boundary, 4 runs. Your new score is: " + yourscore + " runs, " + wickets
                        + " wickets down, " + ballcount + " balls elapsed.");

            case 5:

                yourscore = runsadded + yourscore;
                ballcount = ballcount + 1;
                System.out.println("Wow! 5 runs. Your new score is: " + yourscore + " runs, " + wickets
                        + " wickets down, " + ballcount + " balls elapsed.");

            case 6:

                yourscore = runsadded + yourscore;
                ballcount = ballcount + 1;
                System.out.println("WHAT A SHOT! 6 runs, into the crowd! Your new score is: " + yourscore + " runs, "
                        + wickets + " wickets down, " + ballcount + " balls elapsed.");

        }
    }

    public void ball1shot1() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(10) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(7);
            runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball2shot1() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(10) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(7);
            runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball3shot1() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(5) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(7);
            runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball4shot1() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(2) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(7);
            runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball1shot2() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(20) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            battingmethods.wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(5);
            battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball2shot2() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(20) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            battingmethods.wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(5);
            battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball3shot2() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(10) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            battingmethods.wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(5);
            battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball4shot2() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(5) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            battingmethods.wicket(wickets, ballcount, yourscore);
        }
        if (wicketchancecalculator != 1) {
            int runsadded = random1.nextInt(5);
            battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
        }
    }

    public void ball1shot3() {
        Random random1 = new Random();
        int runsadded = random1.nextInt(2);
        battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
    }

    public void ball2shot3() {
        Random random1 = new Random();
        int runsadded = random1.nextInt(2);
        battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
    }

    public void ball3shot3() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(20) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            battingmethods.wicket(wickets, ballcount, yourscore);
        }
        int runsadded = random1.nextInt(2);
        battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
    }

    public void ball4shot3() {
        Random random1 = new Random();
        int wicketchancecalculator = random1.nextInt(10) + 1;
        if (wicketchancecalculator == 1)
            ;
        {
            battingmethods.wicket(wickets, ballcount, yourscore);
        }
        int runsadded = random1.nextInt(2);
        battingmethods.runreaction(runsadded, yourscore, ballcount, wickets);
    }

}