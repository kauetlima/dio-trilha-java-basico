public class SmartTV {

    boolean  ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal (int canalNovo) {
        canal = canalNovo;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume atual : " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume atual : " + volume);
    }

    public void ligar(){
    ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
}
