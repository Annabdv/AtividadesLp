package agenciaDeTurismo;

import java.util.Objects;

public class PasseioDeLancha implements VendaDeTurismoIF{
    private int numeroDePessoas;
    private int qtdeDeHoras;
    public final double PRECO_POR_PESSOA = 60;

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int qtdeAtual) throws Exception {
        if(numeroDePessoas < 1) {
            throw new Exception("Inválido. Pelo menos uma pessoa deve participar da viagem.");
        }

        this.numeroDePessoas = qtdeAtual;
    }

    public int getQtdeDeHoras() {
        return qtdeDeHoras;
    }

    public void setQtdeDeHoras(int qtdeAtual) throws Exception {
        if(qtdeDeHoras < 1 || qtdeDeHoras > 10) {
            throw new Exception("O passeio deve durar no mínimo 1h e no máximo 10h");
        }
        this.qtdeDeHoras = qtdeAtual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PasseioDeLancha that = (PasseioDeLancha) o;
        return numeroDePessoas == that.numeroDePessoas && qtdeDeHoras == that.qtdeDeHoras && Double.compare(PRECO_POR_PESSOA, that.PRECO_POR_PESSOA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePessoas, qtdeDeHoras, PRECO_POR_PESSOA);
    }

    @Override
    public String toString() {
        return "PasseioDeLancha{" +
                "numeroDePessoas=" + numeroDePessoas +
                ", qtdeDeHoras=" + qtdeDeHoras +
                ", PRECO_POR_PESSOA=" + PRECO_POR_PESSOA +
                '}';
    }

    @Override
    public double getPreco() {
        return numeroDePessoas * qtdeDeHoras * PRECO_POR_PESSOA;
    }

    @Override
    public String getDescricao() {
        return "O passeio de lancha com " + numeroDePessoas + " e duração de " + qtdeDeHoras + "horas";
    }
}

