package edu.vitoria.primeirasemana;

public class SmartTv {
    //atributos 
    boolean ligada = false;
    int canal = 1;
    int volume = 2; 
    //metodo
    public void ligar() {
        ligada = true;
    }
    //metodo
    public void desligar() {
        ligada = false;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void diminuirVolume() {
        volume--;

    }

    public void aumentarVolume() {
        volume++;

    }
}
