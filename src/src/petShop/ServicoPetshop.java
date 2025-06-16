package petShop;

import java.time.LocalDate;

public abstract class ServicoPetshop {
    private int codigo;
    private TamanhoDoAnimal tamanhoAnimal;
    private LocalDate data;

    public ServicoPetshop(int codigo, TamanhoDoAnimal tamanhoAnimal) {
        this.codigo = codigo;
        this.tamanhoAnimal = tamanhoAnimal;
        this.data = LocalDate.now();
    }

    public abstract double calculaPreco();

    public int getCodigo() {
        return codigo;
    }

    public TamanhoDoAnimal getTamanhoAnimal() {
        return tamanhoAnimal;
    }

    public LocalDate getData() {
        return data;
    }

    public abstract String getDescricao();

    public void teste() {
        System.out.println("Teste apaga isso depois");
    }
}