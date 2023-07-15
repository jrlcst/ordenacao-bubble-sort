package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(vetor));

        bubbleSort(vetor);

        System.out.println("Vetor ordenado:");
        System.out.println(Arrays.toString(vetor));


        System.out.println();

        /**
         * ao inves de utilizar o bubble sort, temos a opção de usar o metodo Sequential
         * neste caso, eu transformo o vetor em uma stream, e a ordeno, logo após transformo em um array e o imprimo
         * em minha visao, se o java nos provem um metodo que ja faz esta ordenação, nao faria sentido escrever outro igual
         */
        System.out.println("----------- ORDENAÇÃO ALTERNATIVA -----------------");
        System.out.println(Arrays.toString(
                Arrays.stream(vetor).sequential()
                        .toArray()));
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean troca;

        for (int i = 0; i < n - 1; i++) {
            troca = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    troca = true;
                }
            }

            if (!troca) {
                break;
            }
        }
    }
}