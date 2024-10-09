/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000092
 */
public class ex6VictorHugo {
    public static void main(String[] args) throws InterruptedException {
        int minutos = 10;
        int segundos = 0;

        while (minutos >= 0) {
            while (segundos >= 0) {
                // Formata e exibe o tempo no formato mm:ss
                System.out.printf("%02d:%02d%n", minutos, segundos);
                Thread.sleep(1000); // Pausa de 1 segundo

                if (segundos == 0) {
                    break;
                }
                segundos--;
            }
            minutos--;
            segundos = 59;
    }
}


        }
 

