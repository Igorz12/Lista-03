import java.util.Scanner;

public class Exe_03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }

        }
        System.out.println("Maior valor: " + maior);
        entrada.close();
    }
}