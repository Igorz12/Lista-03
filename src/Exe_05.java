import java.util.Scanner;

public class Exe_05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.print("Diagonal principal: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        entrada.close();
    }
}