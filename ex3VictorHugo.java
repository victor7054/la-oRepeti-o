
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 60000092
 */
public class ex3VictorHugo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;
        System.out.println("insira 2 numeros");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        while (true) {
            if (num1 <= num2) {
                System.out.println(num1 + "");
                num1++;
                if(num1>num2)
                    break;
            } 
            if (num1 >= num2) {
                System.out.println(num1 + "");
                num1--;
                if(num1<num2)
                    break;
            } 
        }

    }

}
