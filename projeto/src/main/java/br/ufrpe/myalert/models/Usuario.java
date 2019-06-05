package br.ufrpe.myalert.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "usuario")
public class Usuario extends Pessoa{

    @Id
    private String id;

    public Usuario(String first_name, String last_name, Genero genero, Date data_nascimento, String cpf, Endereco endereco, Telefone telefone) {
        super(first_name, last_name, genero, data_nascimento, cpf, endereco, telefone);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Usuario that = (Usuario) o;
        return Objects.equals(this.getCpf(), that.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.getCpf());
    }
}