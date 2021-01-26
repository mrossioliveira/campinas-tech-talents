package br.net.benfatto.cttjava.aula06.interfaces;

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n# Cachorro");
        Cachorro cachorro = new Cachorro(new AnimalAndadorCachorroCincoCasas());
//        cachorro.comer();
//        cachorro.dormir();
        cachorro.getAndador().andar();

//        System.out.println("\n# Pato");
//        Pato pato = new Pato(new AnimalAndador());
////        pato.comer();
////        pato.dormir();
//        pato.getAndador().andar();
//
////        pato.setVoador(new AnimalVoador());
////        pato.getVoador().voar();
//
//        pato.setVoador(new AnimalVoador());
//        try {
//            pato.getVoador().voar();
//        } catch (Exception ex) {
//            System.out.println("Erro ao tentar voar...");
//            System.out.println(ex.getMessage());
//        }

    }
}
