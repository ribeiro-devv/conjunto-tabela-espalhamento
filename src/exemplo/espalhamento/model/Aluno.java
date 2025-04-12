package exemplo.espalhamento.model;

import java.util.Objects;

public class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(matricula);
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        System.out.printf("%s = %s%n", getMatricula(), ((Aluno) o).getMatricula());
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return matricula.charAt(0);

//        Boa pratica, seguindo contrato
//        return Objects.hashCode(matricula);
    }
}
