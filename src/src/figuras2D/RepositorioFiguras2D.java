package figuras2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RepositorioFiguras2D {
    private List<Figuras2D> figuras;

    public RepositorioFiguras2D() {
        figuras = new ArrayList<>();
    }

    public void adicionaFigura(Figuras2D figura) {
        figuras.add(figura);
    }

    public void removeFigura(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            figuras.remove(posicao);
        } else {
            System.out.println("Essa posiçao nao é valida.");
        }
    }

    public double recuperaArea(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).calculaArea();
        } else {
            System.out.println("Essa posiçao nao é valida");
            return -1;
        }
    }

    public double recuperaPerimetro(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).calculaPerimetro();
        } else {
            System.out.println("Essa posiçao nao é valida.");
            return -1;
        }
    }

    public String recuperaTipo(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).obterTipoFigura();
        } else {
            System.out.println("Posição inválida.");
            return null;
        }
    }
}