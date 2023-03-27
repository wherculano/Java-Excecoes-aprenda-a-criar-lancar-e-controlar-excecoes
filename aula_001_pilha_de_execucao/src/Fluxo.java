public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            // ex.printStackTrace();  // "rastros" do erro
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MyException{
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2()  throws MyException{
        System.out.println("Inicio do metodo2");
        RaiseErrors errors = new RaiseErrors();

        errors.foo();

        System.out.println("Fim do metodo2");
    }
}