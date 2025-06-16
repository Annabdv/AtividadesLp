package agenciaDeTurismo;

public class CartaoDeMetro implements VendaDeTurismoIF {
    public int qtdeViagens;
    public static final double VALOR_DE_UMA_VIAGEM = 7;

    public int getQtdeViagens() {
        return qtdeViagens;
    }

    public void setQtdeViagens(int qtdeViagens) {
        this.qtdeViagens = qtdeViagens;
    }

    public CartaoDeMetro(int qtdeViagens) throws Exception {
        if (qtdeViagens<0){
            throw new Exception("Quantidade de viagens deve ser maior que zero");
        }
        else if (qtdeViagens == 0){
            throw new Exception("Quantidade de viagens deve ser maior que zero");
        }
        else{
            this.qtdeViagens = qtdeViagens;
        }
    }

    @Override
    public String toString() {
        return "CartaoDeMetro{" +
                "qtdeViagens=" + qtdeViagens +
                '}';
    }

    @Override
    public double getPreco() {
        if (qtdeViagens<20){
            return VALOR_DE_UMA_VIAGEM * qtdeViagens;
        } else {
            return VALOR_DE_UMA_VIAGEM * qtdeViagens * 0.8;
        }
    }

    @Override
    public String getDescricao() {
        return qtdeViagens + "viagens no metrô";
    }
}