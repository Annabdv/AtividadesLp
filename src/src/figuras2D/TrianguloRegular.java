package figuras2D;

public class TrianguloRegular implements Figuras2D {
    private double lado;

    public TrianguloRegular(double lado) {
        this.lado = lado;

    }

    public TrianguloRegular() {

    }

    public TrianguloRegular(int i) {
    }

    @Override
    public double calculaArea() {
        return lado * Math.sqrt(3)/4;
    }

    @Override
    public double calculaPerimetro() {
        return 3 * lado;
    }

    @Override
    public String obterTipoFigura() {
        return "Triangulo Regular";
    }
}