
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 60000092
 */
public class ex2VictorHugo {
    
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;
       
        System.out.println("informe 2 valores");
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        System.out.println("os valores escolhidos foram " + valor1 + " " + valor2);
        
        if(valor2 > valor1){
          System.out.println(valor2 + " e maior");
            
        }

    }

}
