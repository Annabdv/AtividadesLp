package blocoDeNotas;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BlocoNotas {
    private List<Anotacao> anotacoes;

    public BlocoNotas() {
        this.anotacoes = new ArrayList<>();
    }

    public void adicionarAnotacao(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("Inválido. O texto está vazio.");
        }
        anotacoes.add(new Anotacao(texto));
    }

    public void editarAnotacao(int id, String novoTexto)  {
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getId() == id && !anotacao.isRemovida()) {
                anotacao.setTexto(novoTexto);
                return;
            }
        }
        throw new NoSuchElementException("Anotação não encontrada ou deletada.");
    }

    public void removerAnotacao(int id) {
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getId() == id && !anotacao.isRemovida()) {
                anotacao.remover();
                return;
            }
        }
        throw new NoSuchElementException("Anotação não encontrada ou deletada.");
    }

    public List<Anotacao> buscarPorTexto(String termo) {
        List<Anotacao> resultados = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isRemovida() && anotacao.getTexto().contains(termo)) {
                resultados.add(anotacao);
            }
        }
        return resultados;
    }

    public List<Anotacao> listarAnotacoes() {
        List<Anotacao> ativas = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isRemovida()) {
                ativas.add(anotacao);
            }
        }
        return ativas;
    }
}