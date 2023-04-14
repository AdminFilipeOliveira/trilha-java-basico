
/* */

public class typeOfVariables {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
       
        byte idade = 123;
        short ano = 2023;
        int cep = 12345678;
        long cpf = 12345678901L;
        float pi = 3.14f;
        double salario = 1234.50;
        
        short numeroCurto = 1;
        short numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        final double VALOR_DE_PI = 3.14;  
        
        /*⛔️VALOR_DE_PI = 10.4;*/


        System.out.println(salarioMinimo);
        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);
        System.out.println(numeroCurto);
        System.out.println(numeroCurto2);
        System.out.println(VALOR_DE_PI);

    }
}
