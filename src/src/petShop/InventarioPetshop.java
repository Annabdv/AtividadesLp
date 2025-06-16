package petShop;

import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {
    private List<ServicoPetshopIF> servicos = new ArrayList<>();

    public int adicionaServico(ServicoPetshopIF servico) {
        servicos.add(servico);
        return servicos.indexOf(servico);
    }

    public double calculaValorServico() {
        double valor = 0;
        for (ServicoPetshopIF servico : servicos) {
            valor += servico.calculaPreco();
        }
        return valor;
    }

    public String listaServico() {
        StringBuilder lista = new StringBuilder();
        for (ServicoPetshopIF servico : servicos) {
            lista.append(servico.getDescricao()).append("\n");
        }
        return lista.toString();
    }
}