package org.example;

public class Vestuario extends Produto{
    private String tamanho;
    private String cor;
    private Boolean whiteLabel;

    public Vestuario(Double precoBase, Integer id, String nome, String tamanho, String cor, Boolean whiteLabel) {
        super(precoBase, id, nome);
        this.tamanho = tamanho;
        this.cor = cor;
        this.whiteLabel = whiteLabel;
    }

    public Vestuario() {
    }

    @Override
    public Double calcularImposto() {
        return getPrecoBase() * 0.1;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getWhiteLabel() {
        return whiteLabel;
    }

    public void setWhiteLabel(Boolean whiteLabel) {
        this.whiteLabel = whiteLabel;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "tamanho='" + tamanho + '\'' +
                ", cor='" + cor + '\'' +
                ", whiteLabel=" + whiteLabel +
                "} " + super.toString();
    }
}
