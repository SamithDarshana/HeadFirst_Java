package GameLauncher;

import java.util.Scanner;

public class Player {
    int number;

    int  guess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to guess : ");
        number = sc.nextInt();
        return number;
    }
}
