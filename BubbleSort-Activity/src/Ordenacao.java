public class Ordenacao {

    private int comparacoes;
    private int trocas;
    private double tempoMs;

    public void bubbleSort(int[] vetor) {
        comparacoes = 0;
        trocas = 0;
        int n = vetor.length;

        long startTime = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocas++;
                }
            }
        }

        long endTime = System.nanoTime();
        tempoMs = (endTime - startTime) / 1_000_000.0; // Convertendo para milissegundos
    }

    public int getComparacoes() { return comparacoes; }
    public int getTrocas()      { return trocas;      }
    public double getTempoMs()  { return tempoMs;     }
}