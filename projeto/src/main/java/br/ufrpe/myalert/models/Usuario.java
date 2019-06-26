package br.ufrpe.myalert.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "usuario")
public class Usuario {
    public enum Sexo {
        MASCULINO   ("masculino"),
        FEMININO    ("feminino");

        private final String sexo;

        Sexo(String sexo) {
            this.sexo = sexo;
        }

        public String getSexo() {
            return sexo;
        }
    }

    @Id
    private String id;

    private String nome;
    private Sexo sexo;

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date data_nascimento;

    private String cpf;
    private Endereco endereco;
    private Telefone telefone;
    private String username;
    private String password;

    public Usuario(String nome, Sexo sexo, Date data_nascimento, String cpf, Endereco endereco, Telefone telefone, String username, String password) {
        this.nome = nome;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.username = username;
        this.password = password;
    }

    public Usuario(String nome, String cpf, String username, String password) {
        this.nome = nome;
        this.cpf = cpf;
        this.username = username;
        this.password = password;
    }

    public Usuario() {

    }

    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
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
        Usuario usuario = (Usuario) o;
        return Objects.equals(cpf, usuario.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}