package br.ufrpe.myalert.models;

import java.util.Objects;

public class Telefone {
    private long fixo;
    private long celular;

    public Telefone(long fixo, long celular) {
        this.fixo = fixo;
        this.celular = celular;
    }

    public Telefone() {
    }

    public long getFixo() {
        return fixo;
    }

    public void setFixo(long fixo) {
        this.fixo = fixo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return fixo == telefone.fixo &&
                celular == telefone.celular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixo, celular);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "fixo=" + fixo +
                ", celular=" + celular +
                '}';
    }
}
