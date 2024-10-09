
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 60000092
 */
public class ex4VictorHugo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int valor;
        int soma = 0;
        do {
            System.out.println("informe um valor");
            valor = scanner.nextInt();
             if(valor <=100 && valor>=0){
                    if(valor %2 ==0){
                        soma = soma + valor;
                    }
                }else {
                 System.out.println("valor invalido");
             }

        } while (valor != 0);
        System.out.println("o resultado da soma e " + soma);
    }

}
