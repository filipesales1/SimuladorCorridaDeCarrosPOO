package pooSimuladorDeCorrida;

import java.util.Random;

public class Carro {
	
	private int velocidade;
    private int distancia;

    public Carro() {
        this.velocidade = 0;
        this.distancia = 0;
    }

    public int getDistancia() {
        return distancia;
    }


    public int getVelocidade() {
        Random rd = new Random();
        velocidade = rd.nextInt(3) + 1;
        distancia += velocidade;
        return velocidade;
    }

    public void imprimirCorrida(int numeroCarro) {
        for (int i = 0; i < distancia; i++) {
            System.out.print(" ");
        }
        System.out.println("#" + numeroCarro);
    }

}
