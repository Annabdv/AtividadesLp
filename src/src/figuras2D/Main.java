package figuras2D;

public class Main{
    public static void main(String[] args) {
        RepositorioFiguras2D repositorio = new RepositorioFiguras2D();

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        TrianguloRegular triangulo = new TrianguloRegular();

        repositorio.adicionaFigura(circulo);
        repositorio.adicionaFigura(quadrado);
        repositorio.adicionaFigura(triangulo);

        System.out.println("Area circulo: " + repositorio.recuperaArea(0));
        System.out.println("Perimetro circulo: " + repositorio.recuperaPerimetro(0));
        System.out.println("Tipo da figura: " + repositorio.recuperaTipo(0));

        System.out.println("Area quadrado: " + repositorio.recuperaArea(1));
        System.out.println("Perimetro quadrado: " + repositorio.recuperaPerimetro(1));
        System.out.println("Tipo da figura: " + repositorio.recuperaTipo(1));

        System.out.println("Area triangulo: " + repositorio.recuperaArea(2));
        System.out.println("Perimetro triangulo: " + repositorio.recuperaPerimetro(2));
        System.out.println("Tipo da figura: " + repositorio.recuperaTipo(2));

        repositorio.removeFigura(0);
    }
}
