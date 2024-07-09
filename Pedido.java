import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Carro> carros;
    private List<Moto> motos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.carros = new ArrayList<>();
        this.motos = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void adicionarMoto(Moto moto) {
        motos.add(moto);
    }

    public void exibirPedido() {
        cliente.exibirDados();
        System.out.println("Carros Pedidos:");
        for (Carro carro : carros) {
            carro.exibirDados();
        }
        System.out.println("Motos Pedidas:");
        for (Moto moto : motos) {
            moto.exibirDados();
        }
    }
}
