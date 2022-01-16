package game;

// import java.util.*;
// import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class play {
    Scanner reader = new Scanner(System.in);
    int overCount = 0;
    int option, option2 = 0;
    String playerTeam, computerTeam;

    public int Overs() {
        System.out.println("Choose the amount of overs from 1-3.");
        overCount = reader.nextInt();

        if (overCount < 1 || overCount > 3) {
            do {
                System.out.println("Error. Please choose the correct amount of overs.");
                overCount = reader.nextInt();
            } while (overCount < 1 || overCount > 3);
        }

        return overCount;
    }

    public play() {
        int ballCount = 6 * overCount;
    }

    void teamSelection() throws InterruptedException {
        System.out.println(
                "Select a Country you want to play as: \n 1. India \n 2. Sri Lanka \n 3. Australia \n 4. England \n 5. Pakistan \n 6. USA  \n 7. bangladesh \n 8. South Africa");
        option = reader.nextInt();

        switch (option) {
            case 1:
                playerTeam = "India";
                break;
            case 2:
                playerTeam = "Sri Lanka";
                break;
            case 3:
                playerTeam = "Australia";
                break;
            case 4:
                playerTeam = "England";
                break;
            case 5:
                playerTeam = "Pakistan";
                break;
            case 6:
                playerTeam = "USA";
                break;
            case 7:
                playerTeam = "New Zealand";
                break;
            case 8:
                playerTeam = "Bangladesh";
                break;
            case 9:
                playerTeam = "South Africa";
                break;
        }

        System.out.println("Now that You've selected a team.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(
                "Select a team that you want to face (other than your own): \n 1. India \n 2. Sri Lanka \n 3. Australia \n 4. England \n 5. Pakistan \6. USA 7. bangladesh \n 8. South Africa");
            option2 = reader.nextInt();
        switch (option2) {
            case 1:
                computerTeam = "India";
                break;
            case 2:
                computerTeam = "Sri Lanka";
                break;
            case 3:
                computerTeam = "Australia";
                break;
            case 4:
                computerTeam = "England";
                break;
            case 5:
                computerTeam = "Pakistan";
                break;
            case 6:
                computerTeam = "USA";
                break;
            case 7:
                computerTeam = "New Zealand";
                break;
            case 8:
                computerTeam = "Bangladesh";
                break;
            case 9:
                computerTeam = "South Africa";
                break;
        }
        if (playerTeam.equals(computerTeam)) {
            do{
                System.out.println("Error. You want to play against yourself?? Choose again.");
            option2 = reader.nextInt();
            switch (option2) {
                case 1:
                    computerTeam = "India";
                    break;
                case 2:
                    computerTeam = "Sri Lanka";
                    break;
                case 3:
                    computerTeam = "Australia";
                    break;
                case 4:
                    computerTeam = "England";
                    break;
                case 5:
                    computerTeam = "Pakistan";
                    break;
                case 6:
                    computerTeam = "USA";
                    break;
                case 7:
                    computerTeam = "New Zealand";
                    break;
                case 8:
                    computerTeam = "Bangladesh";
                    break;
                case 9:
                    computerTeam = "South Africa";
                    break;
            }
            } while(playerTeam.equals(computerTeam));
        } else {
            System.out.println("Great Matchup!");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        play obj = new play();
        obj.Overs();
        obj.teamSelection();
    }
}