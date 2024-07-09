public class Moto extends Veiculo {
    public Moto(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public void exibirDados() {
        System.out.println("Moto:");
        super.exibirDados();
    }
}
