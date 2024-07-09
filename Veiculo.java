public class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco: " + preco);
    }

}
