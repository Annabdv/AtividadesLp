package repositorioVoadores;

public class Passaro implements Voador {
    private String especie;
    private double velocidadeEmMetrosPorSegundo;

    public Passaro(String especie, double velocidadeEmMetrosPorSegundo) {
        this.especie = especie;
        this.velocidadeEmMetrosPorSegundo = velocidadeEmMetrosPorSegundo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getVelocidadeEmMetrosPorSegundo() {
        return velocidadeEmMetrosPorSegundo;
    }

    public void setVelocidadeEmMetrosPorSegundo(double velocidadeEmMetrosPorSegundo) {
        this.velocidadeEmMetrosPorSegundo = velocidadeEmMetrosPorSegundo;
    }

    @Override
    public String getIdentificacao() {
        return "Pássaro: " + especie;
    }

    @Override
    public double voa(double distanciaEmMetros) {
        return distanciaEmMetros / velocidadeEmMetrosPorSegundo;
    }
}
