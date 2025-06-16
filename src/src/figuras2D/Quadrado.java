package figuras2D;

public class Quadrado implements Figuras2D {
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;

    }

    public Quadrado() {

    }

    public Quadrado (int i) {
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public String obterTipoFigura() {
        return "Quadrado";
    }
}