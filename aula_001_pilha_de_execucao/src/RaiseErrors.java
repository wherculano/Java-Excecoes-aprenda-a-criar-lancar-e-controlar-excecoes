public class RaiseErrors extends Exception{
    public void foo() throws MyException{
        System.out.println("Um erro qualquer sendo tratado DENTRO da funcao foo!");
    }
}
