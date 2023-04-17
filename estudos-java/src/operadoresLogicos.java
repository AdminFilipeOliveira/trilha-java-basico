public class operadoresLogicos {
    public static void main(String[] args) {
        boolean condiçao1 = true;
        boolean condiçao2 = true;

        if(condiçao1 && (7 < 4)){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condiçao1 || condiçao2){
            System.out.println("Uma das duas condições é verdadeira");
        }
        System.out.println("Fim");

    }
    
}
