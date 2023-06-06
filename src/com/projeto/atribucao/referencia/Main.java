package com.projeto.atribucao.referencia;

public class Main {
    public static void main(String[] args) {
    int intA = 1;
    int intB = intA;

    System.out.println("intA: " + intA);
    System.out.println("intB: " + intB);

        MyObject objA = new MyObject(1);
        //objeto objB recebe o mesmo endereço de memória de objA
        //e não copiando o valor de objA para objB
        MyObject objB = objA;

        System.out.println("objA: " + objA + " objB: " + objB);
        objA.setNum(2);
        System.out.println("objA: " + objA + " objB: " + objB);


    }
}
