/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000092
 */
public class ex7VictorHugo {
    public class SomaImparesMultiplosDeTres {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma de todos os números ímpares que são múltiplos de 3 de 1 a 100 é: " + soma);
    }
}

}
