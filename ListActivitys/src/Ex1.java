import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        System.out.println("Digite os 9 elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("mat["+i+"]["+j+"]: ");
                mat[i][j] = sc.nextInt();
            }
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++)
                System.out.printf("%4d", mat[i][j]);
            System.out.println(" ]");
        }
    }
}