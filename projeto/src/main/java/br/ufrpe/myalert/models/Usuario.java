package br.ufrpe.myalert.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "usuario")
public class Usuario extends Pessoa{

    @Id
    private String id;
    private String username;
    private String password;

    public Usuario(String nome, String genero, Date data_nascimento,
                   String cpf, Endereco endereco, Telefone telefone,
                   String username, String password) {
        super(nome, genero, data_nascimento, cpf, endereco, telefone);
        this.username = username;
        this.password = password;
    }

    public Usuario(String nome, String cpf, String username, String password) {
        super(nome, cpf);
        this.username = username;
        this.password = password;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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