package petShop;

public class Tosa extends ServicoPetshop implements ServicoPetshopIF {

    public Tosa(int codigo, TamanhoDoAnimal tamanhoAnimal) {
        super(codigo, tamanhoAnimal);
    }

    @Override
    public double calculaPreco() {
        double preco = 0.0;
        if (getTamanhoAnimal() == TamanhoDoAnimal.PEQUENO) {
            preco += 30.00;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.MEDIO) {
            preco += 40.00;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.GRANDE) {
            preco += 50.00;
        } else {
            throw new IllegalArgumentException("Tamanho do animal inválido.");
        }
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Tosa para animal de " + getTamanhoAnimal() + " porte, custa R$ " + calculaPreco();
    }
}