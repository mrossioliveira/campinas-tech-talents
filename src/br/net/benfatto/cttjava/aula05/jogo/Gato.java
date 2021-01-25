package br.net.benfatto.cttjava.aula05.jogo;

/**
 * @author Murilo Oliveira
 */
public class Gato extends Animal {
    private AnimalAndador andador;

    public void setAndador(AnimalAndador andador) {
        this.andador = andador;
    }

    public AnimalAndador getAndador() {
        return andador;
    }

    public void miar() {
        System.out.println("Miar");
    }
}
