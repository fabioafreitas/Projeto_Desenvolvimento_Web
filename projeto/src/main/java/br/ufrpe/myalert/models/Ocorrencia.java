package br.ufrpe.myalert.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "ocorrencia")
public class Ocorrencia {
    @Id
    private String id;
    private String cpf;
    private String titulo;
    private String date;
    private String number;
    private String endereco;
    private String categoria;
    private String imagens;

    public Ocorrencia(String cpf, String titulo, String date, String number, String endereco, String categoria, String imagens) {
        this.cpf = cpf;
        this.titulo = titulo;
        this.date = date;
        this.number = number;
        this.endereco = endereco;
        this.categoria = categoria;
        this.imagens = imagens;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }
}
