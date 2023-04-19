public class SmartTV {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        //volume = volume + 1; // tambem da certo!
        volume++;
        System.out.println("Aumentando o volume para: " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void mudarcanal(int novoCanal){
        canal = novoCanal;
    }

    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal--;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}
