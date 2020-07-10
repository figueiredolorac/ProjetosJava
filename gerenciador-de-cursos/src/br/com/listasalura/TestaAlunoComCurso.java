package br.com.listasalura;

import java.util.Iterator;
import java.util.Set;

public class TestaAlunoComCurso {

        public static void main(String[] args) {

            Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");

            javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
            javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
            javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

            Aluno a1 = new Aluno("Julia", 34672);
            Aluno a2 = new Aluno("Cassia", 5617);
            Aluno a3 = new Aluno("Karoline", 17645);

            javaColecoes.matricula(a1);
            javaColecoes.matricula(a2);
            javaColecoes.matricula(a3);

            System.out.println("Todos os alunos matriculados: ");
            javaColecoes.getAlunos().forEach(a -> {
                System.out.println(a);
            });

            System.out.println(javaColecoes.estaMatriculado(a1));

            String alunoProcurado = "Rodrigo Turini";

            Aluno turini = new Aluno("Rodrigo Turini", 34672);
            System.out.println("E esse Turini, está matriculado?");
            System.out.println(javaColecoes.estaMatriculado(turini));


            Set<Aluno> alunos = javaColecoes.getAlunos();
            Iterator<Aluno> iterador = alunos.iterator();

            while (iterador.hasNext()) {
                System.out.println(iterador.next());
            }

        }
}
