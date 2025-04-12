import exemplo.espalhamento.model.Aluno;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Aluno> alunos = new HashSet<>();

        alunos.add(new Aluno("Gabriel Silva", "gs@2025"));
        alunos.add(new Aluno("Rute Pereira", "rp@2023"));
        alunos.add(new Aluno("Elizangela da Silva", "es@2024"));
        alunos.add(new Aluno("Janaina Costa", "jc@2025"));

//        System.out.println("-------------");
//        alunos.add(new Aluno("Renata Souza", "rs@2024"));

        System.out.println("-------------");
        System.out.println(alunos.contains(new Aluno("Ricardo Goes", "rg@2025")));
    }
}