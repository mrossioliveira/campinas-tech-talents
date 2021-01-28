package br.net.benfatto.cttjava.aula08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Murilo Oliveira
 */
public class Array {

    public void print(int[] arr) {
        if (arr != null && arr.length > 0) {
            System.out.print("[");
            for (int n : arr) {
                System.out.print(" " + n);
            }
            System.out.print(" ]\n");
        }
    }


    /**
     * Retorna maior valor de um array.
     *
     * @param arr Um array de inteiros
     * @return O maior valor do array
     */
    public int pegarMaior(int[] arr) {
        // guardar o maior valor
        int maior = arr[0];

        // iterar a lista
        for (int i = 1; i < arr.length; i++) {

            // pego um elemento do array
            int elementoArray = arr[i];

            // verifico se ele e maior que o maior
            if (elementoArray > maior) {
                // atualizar o maior valor
                maior = elementoArray;
            }
        }

        // retornar o maior valor
        return maior;
    }

    public int pegarMenor(int[] arr) {
        int menor = arr[0];

        for (int n : arr) {
            if (n < menor) {
                menor = n;
            }
        }

        return menor;
    }

    public float pegarMedia(int[] arr) {
        float soma = 0;

        for (int n : arr) {
            soma += n;
        }

        return soma / arr.length;
    }

    public int contarZeros(int[] arr) {
        int count = 0;

        for (int n : arr) {
            if (n == 0) {
                count++;
            }
        }

        return count;
    }

    public List<Integer> inverter(int[] arr) {
        int[] arrayInvertido = new int[arr.length];

        List<Integer> list = new LinkedList<>();

        for (int i = arr.length; i > 0; i--) {
            list.add(arr[i - 1]);
        }

        return list;
    }

    public void inverterEugenio(int[] arr) {
        int helper;
        int max = arr.length - 1;

        for (int i = 0; i < max / 2; i++) {
            helper = arr[i];
            arr[i] = arr[max - i];
            arr[max - i] = helper;
        }
        for (int number : arr) {
            System.out.println(number);
        }
    }

    public void inverterGuilherme(int[] arr) {
        int[] ArrInv = new int[arr.length];
        int elementoC = 0;
        for (int elementoR = arr.length; elementoR > arr.length / 2; elementoR--) {
            ArrInv[elementoC] = arr[elementoR - 1];
            // - 10, 23, 0, 4, 45, 0
            elementoC++;
        }

        this.print(ArrInv);
    }

    public int[] inverterMurilo(int[] arr) {
        int[] arrayInvertido = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayInvertido[i] = arr[arr.length - i - 1];
        }

        return arrayInvertido;
    }
}
