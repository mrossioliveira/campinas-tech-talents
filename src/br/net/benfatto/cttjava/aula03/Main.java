package br.net.benfatto.cttjava.aula03;

/**
 * Aula 03
 * - Estruturas de Laço/Loop
 * - Abstração
 * - Classes e Objetos
 * - Construtores
 * - Modificadores de Acesso
 * --- private
 * --- protected
 * --- public
 * <p>
 * - Encapsulamento
 * - Herança e Composição
 * - Polimorfismo
 * - Herança vs Composição
 */

class Loop {
    // -- atributos
    private int countTo;

    // -- construtor
    public Loop() {
    }

    // construtor
    public Loop(int countTo) {
        this.countTo = countTo;
    }

    // -- atributos

    // getter
    public int getCountTo() {
        return countTo;
    }

    // setter
    public void setCountTo(int countTo) {
        this.countTo = countTo;
    }

    /**
     * FOR LOOP - Recomendado quando o número de iterações é fixo.
     */
    public void forLoop() {
        for (int i = 0; i <= this.countTo; i++) {
            System.out.println(i);
        }
    }

    /**
     * WHILE LOOP - Recomendado quando o número de iterações não é fixo.
     */
    public void whileLoop() {
        int i = 0;

        while (i < this.countTo) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * DO WHILE LOOP - Recomendado quando o número de iterações não é fixo
     * e precisa ser executado pelo menos uma vez.
     */
    public void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < this.countTo);
    }

}

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        Integer a = scanner.nextInt();

//        Loop loopObj = new Loop(10);
//        loopObj.whileLoop();
//
//        loopObj.setCountTo(5);
//        loopObj.forLoop();

        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(100);
        funcionario.setNome("Murilo");

        System.out.println("Código: " + funcionario.getCodigo());
        System.out.println("Funcionario: " + funcionario.getNome());
    }
}
