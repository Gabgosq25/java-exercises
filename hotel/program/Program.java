package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class Program { 
    public static void main(String[] args){ 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Room[] vect = new Room[10];
        sc.nextLine();

        for (int i=0; i < n; i++){
            System.out.println("Rent#" + (i+1) + ": ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
            vect[roomNumber] = new Room(name, email, roomNumber);
        }

        System.out.println();

        for (int i=0; i < 10; i++){
            if (vect[i] != null) {
                System.out.println("Rent#" + (i+1) + ": ");
                System.out.println("Name: " + vect[i].getName());
                System.out.println("Email: " + vect[i].getEmail());
                System.out.println("Room: " + vect[i].getRoomNumber());
            }
        }




        sc.close();


    }

}
