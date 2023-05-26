package edu.vitoria.primeirasemana;

public class forEach {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //String aluno : alunos -> De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
        for(String aluno : alunos) {
            System.out.println(aluno);
        }
    
    }
}
