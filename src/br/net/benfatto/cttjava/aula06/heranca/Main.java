package br.net.benfatto.cttjava.aula06.heranca;

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("# Cachorro");
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();

        System.out.println("\n# Gato");
        Gato gato = new Gato();
        gato.comer();
        gato.dormir();

        System.out.println("\n# Pato");
        Pato pato = new Pato();
        pato.comer();
        pato.dormir();
    }
}
