package sistem;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();
            sum += height;
            vect[i] = new Product(name, age, height);

        }

        double avg = sum / n;

        System.out.printf("%nAltura média: %.2f%n", avg);

        int nmenores = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                nmenores++;
            }
        }

        double percent = (double) nmenores * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        sc.close();
    }

}