package br.net.benfatto.cttjava.aula05.jogo;

/**
 * @author Murilo Oliveira
 */
public class Cachorro extends Animal {
    private AnimalAndador andador;
    private AnimalNadador nadador;

    public void setAndador(AnimalAndador andador) {
        this.andador = andador;
    }

    public AnimalAndador getAndador() {
        return this.andador;
    }

    public void setNadador(AnimalNadador nadador) {
        this.nadador = nadador;
    }

    public void latir() {
        System.out.println("Latindo");
    }

    public AnimalNadador getNadador() {
        return nadador;
    }
}
