import java.sql.Date;

public class Operatores {
    public static void main(String[] args) {
        
        System.out.println();
        
        Date dataNascimento = new Date(0);
        System.out.println(dataNascimento);
    
        double soma = 24 + 53;
        int subtracao = 43 - 23;
        int multiplicacao = 43 * 4;
        int divisao = 54 / 65;
        int modulo = 16 % 7; 

        double resultado = (10 * 2) + (20/4);
        System.out.println(resultado);
        System.out.println();

        int ano = 2023;
        ano = 2022;
        double altura = 1.72;
        altura = 1.82;
        boolean abertura = false;
        String logoMarca = "Adidas";
        logoMarca = "Nike";
        System.out.println("Ano - " + ano);
        System.out.println("altura - " + altura + "m");
        System.out.println("Esta aberto ? " + abertura);
        System.out.println("logoMarca - " + logoMarca); 
        System.out.println();

        String primeiroNome = "Filipe";
        String segundoNome = "André";
        
        String nomeCompleto = nomeCompletoString(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompletoString (String primeroNome, String segundoNome){
        return "NOME - " + primeroNome.concat(" ").concat(segundoNome) + ".";
    }
  


}

