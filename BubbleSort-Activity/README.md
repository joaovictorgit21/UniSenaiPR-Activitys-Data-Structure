# BubbleSort-Activity — UNISENAI 3º Período

Implementação dos algoritmos de ordenação quadráticos em Java para análise comparativa.

## Algoritmos Implementados
- Bubble Sort (com otimização de flag de troca)
- Selection Sort
- Insertion Sort

## Estrutura do Projeto
```
BubbleSort-Activity/
├── src/
│   ├── App.java         ← Ponto de entrada principal
│   ├── Ordenacao.java   ← Implementação dos 3 algoritmos
│   ├── Relatorio.java   ← Tabela comparativa de resultados
│   └── Vetor.java       ← Leitura dos arquivos de dados
├── dados/
│   ├── 1000_ordenado.txt
│   ├── 1000_desordenado.txt
│   ├── 1000_inverso.txt
│   ├── 5000_ordenado.txt
│   ├── 5000_desordenado.txt
│   └── 5000_inverso.txt
└── bin/                 ← Classes compiladas (gerado pelo javac)
```

## Como Executar

### Compilar
```bash
javac -encoding UTF-8 -d bin src/*.java
```

### Executar (a partir da raiz do projeto)
```bash
java -Dfile.encoding=UTF-8 -cp bin App
```

O programa localizará automaticamente a pasta `dados/` e processará todos os arquivos .txt encontrados.

## Métricas Coletadas
- Tempo de execução (ms)
- Quantidade de comparações realizadas
- Quantidade de trocas/movimentações realizadas
