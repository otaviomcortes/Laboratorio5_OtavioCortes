package laboratorio5_exercicio2;

class CarroFacade {
    private final Motor motor;
    private final CintoDeSeguranca cinto;
    private final Porta porta;
    private final Farol farol;
    private final Radio radio;

    public CarroFacade() {
        this.motor = new Motor();
        this.cinto = new CintoDeSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void ligarCarro() {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar("Chitãozinho e xororo");
    }

    public void desligarCarro() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
