package br.com.listasalura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Julia");
        alunos.add("Karoline");
        alunos.add("Jessica");
        alunos.add("Cassia");

        System.out.println(alunos.size());

        for (String aluno: alunos) {
            System.out.println(alunos);
        }


    }
}
