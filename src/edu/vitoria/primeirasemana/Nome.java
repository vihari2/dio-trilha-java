package edu.vitoria.primeirasemana;

public class Nome {

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }

    public static void main(String[] args) {
        String nome = "Vitoria";
        String sobrenome = "Freitas";
        String meuNome = nomeCompleto(nome, sobrenome);
        System.out.println(meuNome);
    }
}
