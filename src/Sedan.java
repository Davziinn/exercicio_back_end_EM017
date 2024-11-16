public class Sedan extends Carro {
    private String tamanhoPortaMalas;

    public Sedan(String marca, String modelo, Integer ano, String tamanhoPortaMalas) {
        super(marca, modelo, ano);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
}
