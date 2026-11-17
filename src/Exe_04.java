import java.util.Scanner;

public class Exe_04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int quantidade = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = entrada.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    quantidade++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + quantidade);
        entrada.close();
    }
}