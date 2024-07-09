public class Carro extends Veiculo {
    public Carro(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public void exibirDados() {
        System.out.println("Carro:");
        super.exibirDados();
    }
}
