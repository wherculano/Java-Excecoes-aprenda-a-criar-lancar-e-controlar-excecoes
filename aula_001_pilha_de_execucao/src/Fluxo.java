public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: Não foi possível fazer divisão por 0");
            // O try/catch estando aqui, na primeira divisao por zero o metodo 2 (loop for) será encerrado.
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            int divisaoInteira = i / 0;
            // Se o try/catch estivesse aqui, o loop todo seria efetuado
        }
        System.out.println("Fim do metodo2");
    }
}