package org.example;

public class Eletronico extends Produto{

    private Integer tensao;
    private Double peso;
    private String fabricante;

    public Eletronico() {

    }

    public Eletronico(Double precoBase, Integer id, String nome, Integer tensao, Double peso, String fabricante) {
        super(precoBase, id, nome);
        this.tensao = tensao;
        this.peso = peso;
        this.fabricante = fabricante;
    }

    @Override
    public Double calcularImposto() {
        return this.getPrecoBase() * 0.15;
    }

    public Integer getTensao() {
        return tensao;
    }

    public void setTensao(Integer tensao) {
        this.tensao = tensao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "tensao=" + tensao +
                ", peso=" + peso +
                ", fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
}
