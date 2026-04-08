import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4], b = new int[4][4], soma = new int[4][4];
        System.out.println("Matriz A:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) a[i][j] = sc.nextInt();
        System.out.println("Matriz B:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) b[i][j] = sc.nextInt();
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) soma[i][j] = a[i][j] + b[i][j];
        System.out.println("\nA + B:");
        for (int[] row : soma) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();
        }
    }
}