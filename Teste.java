import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        Pedido pedido = new Pedido(cliente);

        while (true) {
            System.out.println("Adicionar Veículo");
            System.out.print("Tipo (1 para Carro, 2 para Moto, 0 para sair): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            if (tipo == 0) break;

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Preco: ");
            double preco = scanner.nextDouble();

            if (tipo == 1) {
                Carro carro = new Carro(modelo, preco);
                pedido.adicionarCarro(carro);
            } else if (tipo == 2) {
                Moto moto = new Moto(modelo, preco);
                pedido.adicionarMoto(moto);
            } else {
                System.out.println("Tipo inválido.");
            }
        }

        System.out.println("Resumo do Pedido:");
        pedido.exibirPedido();

        scanner.close();
    }
}
