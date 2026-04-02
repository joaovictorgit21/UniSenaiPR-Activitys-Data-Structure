public class Relatorio {

    public void exibirMetricas(double tempoMs, int comparacoes, int trocas) {
        System.out.printf("\nTempo de execução: %.3f ms\n", tempoMs);
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }
}