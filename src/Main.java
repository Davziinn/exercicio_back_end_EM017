public class Main {
    public static void main(String[] args) {
        ListaDeCarros<Carro> listDeCarros = new ListaDeCarros();

        Sedan sedan = new Sedan("Toyota", "Corolla", 2015, "450 Litros");
        SUV suv = new SUV("Jeep", "Compass", 2023, "Alta");
        Ret ret = new Ret("Volkswagen", "Gol", 2010, "Convencional");

        listDeCarros.adicionarCarro(sedan);
        listDeCarros.adicionarCarro(suv);
        listDeCarros.adicionarCarro(ret);

        System.out.println("Carro na lista: ");
        listDeCarros.exibeCarro();
    }
}