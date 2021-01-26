package br.net.benfatto.cttjava.aula06.interfaces;

/**
 * @author Murilo Oliveira
 */
public class Pato extends Animal {
    private AnimalAndador andador;
    private AnimalVoador voador;

    public Pato(AnimalAndador andador) {
        this.andador = andador;
    }

    public AnimalAndador getAndador() {
        return andador;
    }

    public void setVoador(AnimalVoador voador) {
        this.voador = voador;
    }

    public AnimalVoador getVoador() throws Exception {
        if (this.voador == null) {
            throw new Exception("O pato não pode voar.");
        } else {
            return voador;
        }
    }
}
