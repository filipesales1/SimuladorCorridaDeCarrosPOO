package pooSimuladorDeCorrida;

public class SimuladorDeCorrida {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        int distanciaMaxima = 50;

        while (carro1.getDistancia() < distanciaMaxima && carro2.getDistancia() < distanciaMaxima) {
            
        	carro1.getVelocidade();
            carro2.getVelocidade();

            System.out.println("--------------------------------------------------");
            carro1.imprimirCorrida(1);
            carro2.imprimirCorrida(2);
            System.out.println("--------------------------------------------------");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (carro1.getDistancia() > carro2.getDistancia()) {
            System.out.println("O carro 1 venceu a corrida!");
        } else if (carro2.getDistancia() > carro1.getDistancia()) {
            System.out.println("O carro 2 venceu a corrida!");
        } else {
            System.out.println("empate!");
        }
    }

}


