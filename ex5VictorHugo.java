/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000092
 */
import java.util.Random;
import java.util.Scanner;

public class ex5VictorHugo {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroEscolhido = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentativa = 0;
        int chute;

        System.out.println("Tente adivinhar o número entre 1 e 10");

        while (tentativa < 5) {
            System.out.print("Digite um numero: ");
            chute = scanner.nextInt();
            tentativa++;

            if (chute == numeroEscolhido) {
                System.out.println("Parabens Voce adivinhou o numero em " + tentativa + " tentativas.");
                break;
            } else if (chute < numeroEscolhido) {
                System.out.println("Seu chute foi baixo.");
            } else {
                System.out.println("Seu chute foi alto.");
            }
        }

        if (tentativa == 5) {
            System.out.println("Você atingiu o limite de tentativas. O numero era " + numeroEscolhido);
        }

        scanner.close();
    }
}
