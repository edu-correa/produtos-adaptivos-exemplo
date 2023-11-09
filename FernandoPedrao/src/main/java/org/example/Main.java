package org.example;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        JdbcTemplate con = new Conexao().getConexao();

        Eletronico e1 = new Eletronico(430.00, null, "eduardo",
                4, 59.0, "Jussara e Fernando");

        Vestuario v1 = new Vestuario(100.00, null,
                "Camiseta do Sasuke", "GG", "Preto", true);

        con.execute("DROP TABLE IF EXISTS produtos;");
        con.execute("""
                CREATE TABLE produtos(
                    id int primary key auto_increment,
                    nome varchar(150) not null,
                    tipo varchar(100) not null,
                    preco_base decimal(10,2) not null,
                    tensao int,
                    peso decimal(10,2),
                    fabricante varchar(200),
                    tamanho varchar(5),
                    cor varchar(100),
                    white_label boolean
                );
                """);
        con.update("INSERT INTO produtos(nome, preco_base, tamanho, cor, white_label, tipo) " +
                "VALUES (?, ?, ?, ?, ?, ?)", v1.getNome(), v1.getPrecoBase(), v1.getTamanho(),
                v1.getCor(), v1.getWhiteLabel(), "VESTUARIO");

        con.update("INSERT INTO produtos(nome, preco_base, tensao, peso, fabricante, tipo) " +
                        "VALUES (?, ?, ?, ?, ?, ?)", e1.getNome(), e1.getPrecoBase(), e1.getTensao(),
                e1.getPrecoBase(), e1.getFabricante(), "ELETRONICO");


        List<Produto> todosOsProdutos = con.query("SELECT * FROM produtos", new ProdutoRowMapper());
        System.out.println(todosOsProdutos);



    }
}