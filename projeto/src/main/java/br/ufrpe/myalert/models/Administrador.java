package br.ufrpe.myalert.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "administrador")
public class Administrador extends Pessoa {

    @Id
    private String id;
    private String matricula;

    public Administrador(String first_name, String last_name, Genero genero, Date data_nascimento, String cpf, Endereco endereco, Telefone telefone, String matricula) {
        super(first_name, last_name, genero, data_nascimento, cpf, endereco, telefone);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Administrador that = (Administrador) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula);
    }
}
