public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        System.out.println();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();


        smartTv.mudarcanal(50);
        System.out.println("O canal atual é: "+ smartTv.canal);
    
        
        System.out.println("A Tv está ligada?: " + smartTv.ligada);
        System.out.println("O canal atual é: "+ smartTv.canal);
        System.out.println("O volume atua é: "+ smartTv.volume);
        
        smartTv.desligar();
        System.out.println("A Tv está ligada?: " + smartTv.ligada);
        


    }
}
