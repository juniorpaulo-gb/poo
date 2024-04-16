package br.com.initial;

import java.util.Date;

public class Locacao {
    private Long id;
    private Date inicio;
    private Date fim;
    private Long kmRetirada;
    private Long kmDevolucao;
    private Boolean paga;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Long getKmRetirada() {
        return kmRetirada;
    }

    public void setKmRetirada(Long kmRetirada) {
        this.kmRetirada = kmRetirada;
    }

    public Long getKmDevolucao() {
        return kmDevolucao;
    }

    public void setKmDevolucao(Long kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    public Boolean getPaga() {
        return paga;
    }

    public void setPaga(Boolean paga) {
        this.paga = paga;
    }


}
