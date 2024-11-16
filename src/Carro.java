public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;

    public Carro (String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + ")";
    }
}
