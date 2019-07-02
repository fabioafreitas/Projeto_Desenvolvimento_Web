package api.orgao.codecipe;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ocorrencia")
public class Ocorrencia {
    @Id
    private String id;
    private String cpf;
    private String titulo;
    private String descricao;
    private String data;
    private String urgencia;
    private int categoria;

    public Ocorrencia(String cpf, String titulo, String descricao, String data, String urgencia, int categoria) {
        this.cpf = cpf;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.urgencia = urgencia;
        this.categoria = categoria;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
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

    @Override
    public String toString() {
        return "Ocorrencia{" +
                "cpf='" + cpf + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data='" + data + '\'' +
                ", urgencia='" + urgencia + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
