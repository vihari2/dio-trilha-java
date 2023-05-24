package edu.vitoria.primeirasemana;


// Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
// Ela tenha as características: ligada (boolean), canal (int) e volume (int);
// Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
// Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
// Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

public class Usuario {



    public static void main(String[] args) throws Exception {
            
        //Nesta linha de código: SmartTv smartTv = new SmartTv();, estamos criando um objeto chamado smartTv da classe SmartTv.
        SmartTv smartTv = new SmartTv();

        //O System.out.println é um método que pertence à classe PrintStream e é usado para imprimir uma linha de texto no console
        System.out.println("Tv Ligada?   " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Qual é o volume:  " + smartTv.volume);

        smartTv.ligar(); //A chamada do método ligar() alterou o valor do atributo ligada para true.
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);
        System.out.println("Novo Status -> Volume atual " + smartTv.volume); 
        System.out.println("Novo Status -> Canal atual " + smartTv.canal);

    }
    
}
