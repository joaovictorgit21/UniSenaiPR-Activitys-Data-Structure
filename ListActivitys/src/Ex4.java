import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) mat[i][j] = sc.nextInt();
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++)
            System.out.println("mat["+i+"]["+i+"] = " + mat[i][i]);
    }
}