package edu.andre.metodos;

public class SmartTv {
    boolean ligada  = false;
    int canal       = 1;
    int volume      = 25;
    public void ligar(){
        ligada = true;
    }

    public void desligar(){

    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
