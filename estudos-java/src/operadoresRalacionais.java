public class operadoresRalacionais {
     public static void main(String[] args) {
        String nomeUm = "Gleyson";
        //String nomeDois = "Gleison";
        String nomeDois = new String("Gleyson");

        System.out.println(nomeUm.equals(nomeDois));// condiçao mais apropriada!
        System.out.println(nomeUm == nomeDois);


        int number1 = 1;
        int number2 = 2;

        boolean simNao = number1 == number2;

        if (number1 < number2){ // aparece se for verdadeira!
        System.out.println("A nossa condiçao é verdadeira" + simNao);

        }

        System.out.println("number1 é igual a number2? " + simNao);

        simNao = number1 != number2;
        System.out.println("number1 é diferente a number2? " + simNao);

        simNao = number1 < number2;
        System.out.println("number1 é menor a number2? " + simNao);

        simNao = number1 > number2;
        System.out.println("number1 é maior a number2? " + simNao);
    
        }
    
}
