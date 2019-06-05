package br.ufrpe.myalert.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

public class Pessoa {
    enum Genero {
        MASCULINO("M"), FEMININO("F"), NAO_DEFINIDO("N");
        private String genero;
        Genero(String genero) {
            this.genero = genero;
        }
        public String getGenero() {
            return this.genero;
        }
    }

    // dúvida com relação ao id de pessoa
    private String first_name;
    private String last_name;
    private Genero genero;
    private Date data_nascimento;
    private String cpf;
    private Endereco endereco;
    private Telefone telefone;

    public Pessoa(String first_name, String last_name, Genero genero, Date data_nascimento, String cpf, Endereco endereco, Telefone telefone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.genero = genero;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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
