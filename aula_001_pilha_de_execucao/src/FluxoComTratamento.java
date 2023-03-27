public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("Exception: " + ex.getMessage());
            // ex.printStackTrace();  // "rastros" do erro
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        throw new ArithmeticException("Algo deu errado");
        // System.out.println("Fim do metodo2");
    }
}