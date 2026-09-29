package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entities.Client;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Client> list = new ArrayList<>();
        System.out.println("      Sistema Hospitalar     ");
        System.out.println("Digite o seu tipo de acesso: ");
        System.out.println("""
                1 - Médico
                2 - Paciente
                0- Sair
                 """);
        int choice = sc.nextInt();
        while (choice != 0) {
            
                
        }
 


    }
}