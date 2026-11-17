import java.util.Scanner;

public class Exe_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = entrada.nextInt();
                soma = soma + matriz[i][j];
            }

        }
        System.out.println("Soma: " + soma);
        entrada.close();
    }
}