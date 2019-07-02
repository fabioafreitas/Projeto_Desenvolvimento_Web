package br.ufrpe.myalert.modelsDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OcorrenciaDTO {

    private String cpf;
    private String titulo;
    private String descricao;

    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private Date data;

    private String urgencia;
    private int categoria;

    public OcorrenciaDTO(String cpf, String titulo, String descricao, Date data, String urgencia, int categoria) {
        this.cpf = cpf;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.urgencia = urgencia;
        this.categoria = categoria;
    }

    public OcorrenciaDTO() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}

