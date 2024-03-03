package laboratorio5_exercicio2;

public class Main {
    public static void main(String[] args) {
        CarroFacade carro = new CarroFacade();

        System.out.println("Iniciando corrida...");
        carro.ligarCarro();

        System.out.println("\nFinalizando corrida...");
        carro.desligarCarro();
    }
}