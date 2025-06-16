package repositorioVoadores;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Voador[] voadores = new Voador[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int tipoVoador = random.nextInt(3);
            switch (tipoVoador) {
                case 0:
                    voadores[i] = new GalinhaVoadora();
                    break;
                case 1:
                    voadores[i] = new Drone();
                    break;
                case 2:
                    voadores[i] = new Borboleta();
                    break;
            }
        }
        //

        for (Voador voador : voadores) {
            System.out.println(voador.getIdentificacao());
            voador.voa(100);

            if (voador instanceof GalinhaVoadora) {
                ((GalinhaVoadora) voador).planar();
            }
            if (voador instanceof Borboleta) {
                ((Borboleta) voador).voarComCor();
            }
            if (voador instanceof Drone) {
                ((Drone) voador).voar();
            }
        }
    }
}