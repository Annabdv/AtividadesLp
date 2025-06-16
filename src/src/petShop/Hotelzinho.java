package petShop;

public class Hotelzinho extends ServicoPetshop implements ServicoPetshopIF {
    private int qtdeHoras;

    public Hotelzinho(int codigo, TamanhoDoAnimal tamanhoAnimal, int qtdeHoras) {
        super(codigo, tamanhoAnimal);
        this.qtdeHoras = qtdeHoras;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    @Override
    public double calculaPreco() {
        double precoBase = 0.0;
        if (getTamanhoAnimal() == TamanhoDoAnimal.PEQUENO) {
            precoBase += 12.0;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.MEDIO) {
            precoBase += 18.0;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.GRANDE) {
            precoBase += 25.0;
        }

        return precoBase * qtdeHoras;
    }

    @Override
    public String getDescricao() {
        return "Hotelzinho para animal de " + getTamanhoAnimal() + " porte, por " + qtdeHoras + " horas, custa R$ " + calculaPreco();
    }
}