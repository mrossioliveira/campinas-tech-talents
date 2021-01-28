package br.net.benfatto.cttjava.aula07.arrays;

import java.util.Arrays;

/**
 * @author Murilo Oliveira
 */
public class Main {

    public static void main(String[] args) {

        // int[] arr = [1, 2, 3, 4, 5]
        // tamanho = 5
        // [0, 1, 2, 3, 4] - indexacao em java comeca no zero
        //

        // criando uma variavel do tipo array de inteiros de tamanho 5
        int[] arr = {10, 20, 30, 40, 50};
        int segundoElemento = arr[1];
        System.out.println(segundoElemento);

        System.out.println("\nTodos os itens do array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    // arr = [1, 5, 6, 2, 0] > 6
    public int maior(int[] arr) {
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

    public int menor(int[] arr) {
        return 0;
    }

    public int media(int[] arr) {
        return 0;
    }

    public int countZeros(int[] arr) {
        return 0;
    }

    public void printarArrayInvertido(int[] arr) {

    }
}
