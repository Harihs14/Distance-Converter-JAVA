package distance;

import java.util.Scanner;

public class DistanceConverter {
    public static void convertDistance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select conversion type:");
        System.out.println("1. Meter to KM\n2. Miles to KM\n3. KM to Meter\n4. KM to Miles");
        int choice = sc.nextInt();
        System.out.print("Enter the distance: ");
        double distance = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: result = distance / 1000; break;  // Meter to KM
            case 2: result = distance * 1.609; break;  // Miles to KM
            case 3: result = distance * 1000; break;   // KM to Meter
            case 4: result = distance / 1.609; break;  // KM to Miles
            default: System.out.println("Invalid choice."); return;
        }
        System.out.println("Converted distance: " + result);
    }
}
