package blocoDeNotas;

import java.time.LocalDate;

public class Anotacao {
    private static int contador = 1;
    private int id;
    private String texto;
    private LocalDate dataCriacao;
    private boolean removida;

    public Anotacao(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("Inválido. O texto está vazio.") ;
        }
        this.id = contador++;
        this.texto = texto;
        this.dataCriacao = LocalDate.now();
        this.removida = false;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String novoTexto) {
        if (novoTexto == null || novoTexto.trim().isEmpty()) {
            throw new IllegalArgumentException("Inválido. O texto está vazio.");
        }
        this.texto = novoTexto;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public boolean isRemovida() {
        return removida;
    }

    public void remover() {
        this.removida = true;
    }

    @Override
    public String toString() {
        return "Anotacao" + id + " (" + dataCriacao + "): " + texto;
    }
}