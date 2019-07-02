package br.ufrpe.myalert.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "ocorrencia")
public class Ocorrencia {
    public enum Urgencia {
        URGENTE (5), ALTA    (4),
        NORMAL  (3), BAIXA   (2),
        MINIMA  (1);

        private final int nivel;

        Urgencia(int nivel) {
            this.nivel = nivel;
        }

        public int getNivel() {
            return nivel;
        }
    }


    @Id
    private String id;
    private String cpf;
    private String titulo;
    private String descricao;

    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private Date dataCriacao; // data de criação da ocorrência

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date dataOcorrencia; // data do evento retratado na ocorrência


    private Urgencia urgencia;
    private Endereco localizacao;
    private int categoria;
    private String imagens; //TODO

    public Ocorrencia(String cpf, String titulo, String descricao, Date dataCriacao, Date dataOcorrencia, Urgencia urgencia, Endereco localizacao, int categoria, String imagens) {
        this.cpf = cpf;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataOcorrencia = dataOcorrencia;
        this.urgencia = urgencia;
        this.localizacao = localizacao;
        this.categoria = categoria;
        this.imagens = imagens;
    }

    public Ocorrencia() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(Urgencia urgencia) {
        this.urgencia = urgencia;
    }

    public Endereco getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Endereco localizacao) {
        this.localizacao = localizacao;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }

    @Override
    public String toString() {
        return "Ocorrencia{" +
                "id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataOcorrencia=" + dataOcorrencia +
                ", urgencia=" + urgencia +
                ", localizacao=" + localizacao +
                ", categoria=" + categoria +
                ", imagens='" + imagens + '\'' +
                '}';
    }
}
