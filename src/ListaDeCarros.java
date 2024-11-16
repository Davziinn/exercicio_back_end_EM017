import java.util.*;

public class ListaDeCarros<T extends Carro> {
    private List<T> carros = new ArrayList();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void exibeCarro() {
        for (T carro : carros) {
            System.out.println(carro);
        }
    }
}
