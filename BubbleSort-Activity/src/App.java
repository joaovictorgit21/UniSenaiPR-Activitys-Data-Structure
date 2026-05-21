import java.io.IOException;

public class App {

    public static void main(String[] args) {
        // ---------------------------------------------------------------
        // Configure the files to test here.
        // Each entry: { "path/to/file.txt", "Description" }
        // ---------------------------------------------------------------
        String[][] files = {
            { "data/10000_ordenado.txt",        "Ordenado     | 10.000"     },
            { "data/100000_ordenado.txt",       "Ordenado     | 100.000"    },
            { "data/500000_ordenado.txt",       "Ordenado     | 500.000"    },
            { "data/1000000_ordenado.txt",      "Ordenado     | 1.000.000"  },

            { "data/10000_inverso.txt",       "Invertido    | 10.000"     },
            { "data/100000_inverso.txt",      "Invertido    | 100.000"    },
            { "data/500000_inverso.txt",      "Invertido    | 500.000"    },
            { "data/1000000_inverso.txt",     "Invertido    | 1.000.000"  },

            { "data/10000_desordenado.txt",     "Desordenado  | 10.000"     },
            { "data/100000_desordenado.txt",    "Desordenado  | 100.000"    },
            { "data/500000_desordenado.txt",    "Desordenado  | 500.000"    },
            { "data/1000000_desordenado.txt",   "Desordenado  | 1.000.000"  },
        };

        NumberFileReader reader = new NumberFileReader();
        BubbleSort    bubble    = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();

        System.out.println("=".repeat(85));
        System.out.printf("%-30s %-14s %-16s %-12s %-16s%n",
                "Arquivo", "Algoritmo", "Comparações", "Trocas", "Tempo (ms)");
        System.out.println("=".repeat(85));

        for (String[] entry : files) {
            String filePath   = entry[0];
            String fileLabel  = entry[1];

            int[] numbers;
            try {
                numbers = reader.readNumbers(filePath);
            } catch (IOException e) {
                System.out.printf("%-30s  [ERRO ao ler arquivo: %s]%n", fileLabel, e.getMessage());
                System.out.println("-".repeat(85));
                continue;
            }

            int total = numbers.length;

            // --- Bubble Sort ---
            long start = System.currentTimeMillis();
            bubble.sort(numbers);
            long elapsed = System.currentTimeMillis() - start;
            printResult(fileLabel, "Bubble Sort", total,
                    bubble.getComparisons(), bubble.getSwaps(), elapsed);

            // --- Selection Sort ---
            start = System.currentTimeMillis();
            selection.sort(numbers);
            elapsed = System.currentTimeMillis() - start;
            printResult(fileLabel, "Selection Sort", total,
                    selection.getComparisons(), selection.getSwaps(), elapsed);

            // --- Insertion Sort ---
            start = System.currentTimeMillis();
            insertion.sort(numbers);
            elapsed = System.currentTimeMillis() - start;
            printResult(fileLabel, "Insertion Sort", total,
                    insertion.getComparisons(), insertion.getSwaps(), elapsed);

            System.out.println("-".repeat(85));
        }
    }

    private static void printResult(String fileLabel, String algorithm,
                                    int total, long comparisons, long swaps, long elapsedMs) {
        System.out.printf("%-30s %-14s %,-16d %,-12d %,-16d%n",
                fileLabel, algorithm, comparisons, swaps, elapsedMs);
    }
}