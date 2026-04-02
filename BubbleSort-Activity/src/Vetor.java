import java.util.Scanner;

public class Vetor {

    private final int[] data;

    public Vetor(int n) {
        this.data = new int[n];
    }

    public void lerValores(Scanner sc) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            data[i] = sc.nextInt();
        }
    }

    public int[] getDados() {
        return data;
    }

    public int getTamanho() {
        return data.length;
    }

    public void exibir() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}