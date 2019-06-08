package br.ufrpe.myalert.models;

import java.util.Date;
import java.util.Objects;

public class Pessoa {


    // dúvida com relação ao id de pessoa
    private String nome;
    private String genero;
    private Date data_nascimento;
    private String cpf;
    private Endereco endereco;
    private Telefone telefone;

    public Pessoa(String nome, String genero, Date data_nascimento, String cpf, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.genero = genero;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
