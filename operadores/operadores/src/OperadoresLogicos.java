public class OperadoresLogicos {
    public static void main(String[] args){
        //tabela verdade
        //operadores booleanos

        boolean condição1 = true;

        boolean condição2 = false;

        if(condição1 && condição2){
            System.out.println("as duas condições são verdadeiras");
        }
        
        if(condição1 || condição2){
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");

        condição1 = true;

        condição2 = true;

        if(condição1 && condição2){
            System.out.println("as duas condições são verdadeiras");
        }
        
        if(condição1 || condição2){
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");

        if (condição1 && (7>4)){
            System.out.println("as duas condições são verdadeiras");
        }
        
    }
}
