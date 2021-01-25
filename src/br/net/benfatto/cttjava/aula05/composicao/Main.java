package br.net.benfatto.cttjava.aula05.composicao;

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {
        // Um sistema de petshop onde atendemos cachorros.
        // Queremos armazenar os cachorros e também as raças.

        // Criar um Boxer
        Cachorro boxer = new Cachorro("Buba");
        boxer.setIdade(16);
        boxer.setNomeDono("Murilo");

        Raca racaBoxer = new Raca("Boxer");
        boxer.setRaca(racaBoxer);

        // Criar um Shih tzu
        Cachorro shihtzu = new Cachorro("Jhonny");
        shihtzu.setIdade(13);
        shihtzu.setNomeDono("Murilo");

        Raca racaShihtzu = new Raca("Shih Tzu");
        shihtzu.setRaca(racaShihtzu);

        System.out.println(boxer.getNome());
        System.out.println(boxer.getIdade());
        System.out.println(boxer.getNomeDono());

        Raca raca = boxer.getRaca();

        System.out.println(raca.getNome());
//        System.out.println(boxer.getRaca().getNome());
    }
}
