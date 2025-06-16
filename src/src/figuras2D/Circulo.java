package figuras2D;

public class Circulo implements Figuras2D {
    private double raio;

    public Circulo() {
    }

    public Circulo(int i) {
    }

    public double Circulo(double raio) {
        this.raio = raio;

        return raio;
    }
    @Override
    public double calculaArea() {
        return Math.PI * Math.pow (raio,2);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String obterTipoFigura() {
        return "Circulo";
    }
}