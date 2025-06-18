package June18thClass;

import java.util.Scanner;

public class Lab016_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a year (between 2000 to 2025):");
        int year = scanner.nextInt();

        if (year>=2000 && year<=2025){
            if ((year %4==0 && year %100 != 0) || (year %400 == 0 )) {
                System.out.println(year + "Leap Year");
            }  else {
                System.out.println(year + "Non leap year");
            }

        } else {
            System.out.println("Please enter a year between 2000 and 2025.");
        }

    }

}


