public class OperadoresRelacionais {
    public static void main(String[] asrgs){
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero um é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero um é diferente a numero 2? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numero um é maior a numero 2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numero um é menor a numero 2? " + simNao);

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }
        else{
            System.out.println("a nossa condição é falsa");
        }

        String nomeUm = "Amanda";
        String nomeDois = new String("Amanda");

        System.out.println(nomeUm.equals(nomeDois));
        //para objetos, usa o equals
    }
}
