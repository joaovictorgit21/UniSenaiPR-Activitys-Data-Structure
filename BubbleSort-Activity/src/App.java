import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores: ");
        int n = sc.nextInt();

        Vetor vetor       = new Vetor(n);
        Ordenacao ord     = new Ordenacao();
        Relatorio rel     = new Relatorio();

        vetor.lerValores(sc);

        System.out.println("\nVetor antes da ordenação:");
        vetor.exibir();

        ord.bubbleSort(vetor.getDados());

        System.out.println("\nVetor depois da ordenação:");
        vetor.exibir();

        rel.exibirMetricas(ord.getTempoMs(), ord.getComparacoes(), ord.getTrocas());

        sc.close();
    }
}