public class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

/**
 * Chedked: Quando a classe extende diretamente Exception, ela é 'verificada' pelo compilador.
   Com isso, obrigatoriamente o metodo que irá usar o
   throw, deverá usar 'throws MyException' em sua assinatura. Ex.: public void metodo() throws MyException.
   Ou, o erro deverá ser tratado dentro de um try/catch.

 * Unchecked: Quando a classe extende RuntimeException, não será verificada pelo compilador,
   assim, não será necessário usar o 'throws', somente o 'throw' dentro de seu corpo/escopo da funcao.
 **/

