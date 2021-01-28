package br.net.benfatto.cttjava.aula08;

import java.util.ArrayList;
import java.util.List;

class Carro {
    private int id;
    private String modelo;

    public Carro(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

/**
 * @author Murilo Oliveira
 */
public class Lists {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(0);
        inteiros.add(1);
        inteiros.add(2);

        inteiros.add(2, 10);

        inteiros.forEach(n -> {
            System.out.println(n);
        });

        inteiros.remove(0);

        System.out.println("\n\n");
        inteiros.forEach(n -> {
            System.out.println(n);
        });

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro(1, "Ford"));
        carros.add(new Carro(2, "Fiat"));
        carros.add(new Carro(3, "Ferrari"));

        carros.forEach(carro -> {
            if (carro.getId() == 1) {
                carro.setModelo("Mustang");
            }
            System.out.println(carro);
        });
    }

}
