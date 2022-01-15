package game;
// import java.util.*;
// import java.util.Random;
import java.util.Scanner;


public class play {
    Scanner reader = new Scanner(System.in);
    int overCount = 0;

    void Overs(){
        System.out.println("Choose the amount of overs from 1-3.");
        overCount = reader.nextInt();

        if (overCount < 1 || overCount > 3){
            do {
            System.out.println("Error. Please choose the correct amount of overs.");
            overCount = reader.nextInt();
            } while(overCount == 1 || overCount == 2 || overCount == 3);
        }
    }

    public static void main(String[] args) {
        play method = new play();

        method.Overs();
    }

}