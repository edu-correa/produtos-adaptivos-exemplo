package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoRowMapper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException {
        String tipo = resultSet.getString("tipo");
        if (tipo.equalsIgnoreCase("ELETRONICO")){
            Eletronico eletronico = new Eletronico();
            eletronico.setId(resultSet.getInt("id"));
            eletronico.setNome(resultSet.getString("nome"));
            eletronico.setFabricante(resultSet.getString("fabricante"));
            eletronico.setPeso(resultSet.getDouble("peso"));
            eletronico.setTensao(resultSet.getInt("tensao"));
            eletronico.setPrecoBase(resultSet.getDouble("preco_base"));
            return eletronico;
        } else{
            Vestuario vestuario = new Vestuario();
            vestuario.setId(resultSet.getInt("id"));
            vestuario.setNome(resultSet.getString("nome"));
            vestuario.setPrecoBase(resultSet.getDouble("preco_base"));
            vestuario.setCor(resultSet.getString("cor"));
            vestuario.setTamanho(resultSet.getString("tamanho"));
            vestuario.setWhiteLabel(resultSet.getBoolean("white_label"));
            return vestuario;
        }
    }
}
