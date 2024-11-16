public class SUV extends Carro{
    private String capacidadeTerrenoIrregular;

    public SUV (String marca, String modelo, Integer ano, String capacidadeTerrenoIrregular) {
        super(marca, modelo, ano);
        this.capacidadeTerrenoIrregular = capacidadeTerrenoIrregular;
    }
}
