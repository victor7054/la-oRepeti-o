package listaexlacorepeticao;

import java.util.Scanner;

public class ListaExLacoRepeticao {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;
       
        System.out.println("informe 2 valores");
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        System.out.println("os valores escolhidos foram " + valor1 + " " + valor2);

    }

}
