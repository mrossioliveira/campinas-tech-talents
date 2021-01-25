package br.net.benfatto.cttjava.aula05.jogo;

/**
 * @author Murilo Oliveira
 */
public class Pato extends Animal {
    private AnimalAndador andador;
    private AnimalNadador nadador;
    private AnimalVoador voador;

    public AnimalAndador getAndador() {
        return andador;
    }

    public void setAndador(AnimalAndador andador) {
        this.andador = andador;
    }

    public AnimalNadador getNadador() {
        return nadador;
    }

    public void setNadador(AnimalNadador nadador) {
        this.nadador = nadador;
    }

    public AnimalVoador getVoador() {
        return voador;
    }

    public void setVoador(AnimalVoador voador) {
        this.voador = voador;
    }
}
