package petShop;

import java.util.Objects;

public class Banho extends ServicoPetshop implements ServicoPetshopIF {
    public TamanhoPelo tamanhoPelo;
    private double preco;

    public Banho(int codigo, TamanhoDoAnimal tamanhoAnimal, TamanhoPelo tamanhoPelo) {
        super(codigo, tamanhoAnimal);
        this.tamanhoPelo = tamanhoPelo;
        this.preco = calculaPreco();
    }

    @Override
    public double calculaPreco() {
        double precoBanho = 0.0;
        if (getTamanhoAnimal() == TamanhoDoAnimal.PEQUENO) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                precoBanho += 50.0;
            } else if (tamanhoPelo == TamanhoPelo.MEDIO) {
                precoBanho += 65.0;
            } else if (tamanhoPelo == TamanhoPelo.LONGO) {
                precoBanho += 75.0;
            } else {
                throw new IllegalArgumentException("O tamanho do pelo é inválido");
            }
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.MEDIO) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                precoBanho += 60.0;
            } else if (tamanhoPelo == TamanhoPelo.MEDIO) {
                precoBanho += 75.0;
            } else if (tamanhoPelo == TamanhoPelo.LONGO) {
                precoBanho += 85.0;
            } else {
                throw new IllegalArgumentException("O tamanho do pelo é invalido.");
            }
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.GRANDE) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                precoBanho += 75.0;
            } else if (tamanhoPelo == TamanhoPelo.MEDIO) {
                precoBanho += 85.0;
            } else if (tamanhoPelo == TamanhoPelo.LONGO) {
                precoBanho += 95.0;
            } else {
                throw new IllegalArgumentException("O tamanho do pelo é inválido.");
            }
        } else {
            throw new IllegalArgumentException("O tamanho do animal é inválido.");
        }
        return precoBanho;
    }

    public TamanhoPelo getTamanhoPelo() {
        return tamanhoPelo;
    }

    public void setTamanhoPelo(TamanhoPelo tamanhoPelo) {
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public String getDescricao() {
        return "Banho para animal de " + getTamanhoAnimal() + " porte e pelo de tamanho " +tamanhoPelo+ ", custa R$ " +calculaPreco();
    }

    @Override
    public String toString() {
        return "Banho{" +
                "tamanhoPelo=" + tamanhoPelo +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banho banho = (Banho) o;
        return Double.compare(preco, banho.preco) == 0 && tamanhoPelo == banho.tamanhoPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanhoPelo);
    }
}