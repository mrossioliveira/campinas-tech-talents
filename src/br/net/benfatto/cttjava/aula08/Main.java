package br.net.benfatto.cttjava.aula08;

import java.util.List;

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        int[] arr = {10, 23, 0, 4, 45, 0};

        System.out.print("Array original -> ");
        array.print(arr);

        // busca maior valor no array
//        int maior = array.pegarMaior(arr);
//        System.out.println("\nMaior: " + maior); // 45
//
//        // busca menor valor no array
//        int menor = array.pegarMenor(arr);
//        System.out.println("\nMenor: " + menor); // 0
//
//        // calcula a media dos elementos do array
//        float media = array.pegarMedia(arr);
//        System.out.println("\nMedia: " + media); //
//
//        // busca total de zeros
//        int totalZeros = array.contarZeros(arr);
//        System.out.println("\nTotal de zeros: " + totalZeros);

        // inverte o array
//        List<Integer> arrayInvertido = array.inverter(arr);
//        System.out.print("\nArray invertido -> \n");
//        arrayInvertido.forEach(System.out::println);
////        array.print(arrayInvertido);
//
        System.out.println("\n\n");
//        array.inverterEugenio(arr);
//
//        System.out.println("\n\n");
//        array.inverterGuilherme(arr);

        array.print(arr);
        System.out.println("\n\n");
        int[] arrayInvertidoMurilo = array.inverterMurilo(arr);
        array.print(arrayInvertidoMurilo);
    }
}
