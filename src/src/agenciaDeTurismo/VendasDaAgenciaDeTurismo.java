package agenciaDeTurismo;

import java.util.ArrayList;
import java.util.List;

public class VendasDaAgenciaDeTurismo {
    public List<VendaDeTurismoIF> vendas = new ArrayList<>();

    public int adicionaVenda(VendaDeTurismoIF item) {
        vendas.add(item);
        return vendas.indexOf(item);
    }

    public double getPrecoDeVenda(int posicao) throws Exception {
        if(posicao < 0) {
            throw new Exception("Inválido");
        }
        return vendas.get(posicao).getPreco();
    }

    public double getPrecoTotal() {
        double precoTotal = 0;
        for(VendaDeTurismoIF venda : vendas) {
            precoTotal += venda.getPreco();
        }
        return precoTotal;
    }

    public String listagemDeVendas() {
        String saida = "";
        for (VendaDeTurismoIF venda : vendas) {
            saida += venda.getDescricao();
        }
        return saida;
    }
}