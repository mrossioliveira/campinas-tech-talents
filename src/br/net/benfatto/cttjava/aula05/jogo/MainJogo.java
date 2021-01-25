package br.net.benfatto.cttjava.aula05.jogo;

/**
 * @author Murilo Oliveira
 */
public class MainJogo {
    public static void main(String[] args) {
        AnimalAndador animalAndador = new AnimalAndador();
        AnimalNadador animalNadador = new AnimalNadador();
        AnimalVoador animalVoador = new AnimalVoador();

        System.out.println("#Cachorro");

        Cachorro cachorro = new Cachorro();
        cachorro.setAndador(animalAndador);
        cachorro.setNadador(animalNadador);

        cachorro.latir();
        cachorro.comer();
        cachorro.dormir();
        cachorro.getAndador().andar();
        cachorro.getNadador().nadar();

        System.out.println("\n#Gato");
        Gato gato = new Gato();
        gato.setAndador(animalAndador);
        gato.getAndador().andar();
        gato.comer();

        System.out.println("\n#Peixe");
        Peixe peixe = new Peixe();
        peixe.setNadador(animalNadador);
        peixe.comer();
        peixe.dormir();
        peixe.getNadador().nadar();

        System.out.println("\n#Pato");
        Pato pato = new Pato();
        pato.setAndador(animalAndador);
        pato.setNadador(animalNadador);
        pato.setVoador(animalVoador);

        pato.comer();
        pato.getVoador().voar();
        pato.getNadador().nadar();
        pato.getAndador().andar();

    }
}
