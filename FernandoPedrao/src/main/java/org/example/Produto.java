package org.example;

public abstract class Produto {
    private Double precoBase;
    private Integer id;
    private String nome;

    public Produto() {
    }

    public Produto(Double precoBase, Integer id, String nome) {
        this.precoBase = precoBase;
        this.id = id;
        this.nome = nome;
    }

    public Double precoTotal(){
        return precoBase + calcularImposto();
    }

    public abstract Double calcularImposto();

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "precoBase=" + precoBase +
                ", id=" + id +
                ", nome='" + nome + "', " +
                "imposto= " + calcularImposto() +
                ", preco total= " + precoTotal() +
                '}';
    }
}
