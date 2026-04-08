import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int negativos = 0;
        System.out.println("Digite os 25 elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) negativos++;
            }
        System.out.println("Quantidade de elementos negativos: " + negativos);
    }
}