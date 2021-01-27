package br.net.benfatto.cttjava.aula07.primitivos;

/**
 * @author Murilo Oliveira
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Tipos primitivos
         *
         * - byte: default 0 --- 1 byte (8 bits, de -128 à 127)
         * - short: default 0 --- 2 bytes (16 bits, de -32.768 à 32.767)
         * - char: default vazio/0 --- 2 bytes (16 bits, de 0 à 65.535 (somente positivos))
         * - int: default 0 --- 4 bytes (32 bits, de -2.147.483.648 à 2.147.483.647)
         * - long: default 0 --- 8 bytes (64 bits, de 9.223.372.036.854.775.808 à -9.223.372.036.854.775.807)
         *
         * - float --- 4 bytes (32 bits, de +/-1.4 * 10⁴⁵ à +/-3.4028235 * 10³⁸)
         * - double --- 64 bytes (64 bits, de +/-4.9 à +/-1.7976931348623147 * 10³⁰⁸)
         *
         * - boolean --- 1 bit (true, false)
         */

        // inteiros
        byte b = 127;
        short s = 30000;
        char c = 77; // M - caracter
        int i = 2021;
        long l = 2222222;


        // casas decimais
        float f = 3.45f;
        double d = 4.5;

        // dividindo numeros inteiros
        System.out.println("DIVISAO INTEIRO " + (5 / 2));

        // dividindo numero decimal
        System.out.println("DIVISAO DECIMAL " + (d / 2));

        // módulo (%)
        System.out.println("MODULO " + (d % 2));

        // booleano, ou seja, verdadeiro ou falso
        boolean bool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);

        System.out.println(f);
        System.out.println(d);

        System.out.println(bool);

        System.out.println("\n\n\n\n\n\n\n\n\n");

        // cria instancia da calculadora
        Calculadora calc = new Calculadora();

        int resultadoSoma = calc.somar(4, 7);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoSubtracao = calc.subtrair(8, 3);
        System.out.println("Resultado da subtracao: " + resultadoSubtracao);

        int resultadoMultiplicacao = calc.multiplicar(2, 5);
        System.out.println("Resultado da multiplicacao: " + resultadoMultiplicacao);

        try {
            double resultadoDivisao = calc.dividir(7d, 0d);
            System.out.println("Resultado da divisao: " + resultadoDivisao);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        boolean isNumeroPar = calc.ePar(5);
        System.out.println(isNumeroPar);
    }
}
