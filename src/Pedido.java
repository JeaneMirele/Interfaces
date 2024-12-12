public class Pedido extends Produto implements l1 {
    private int numeroPedido;
    private double valor;



    public Pedido(String nome, String endereco, String nomeVendedor, int avaliacao, int numeroPedido, double valor){
        super(nome, endereco, nomeVendedor, avaliacao);
        this.numeroPedido= numeroPedido;
        this.valor= valor;


    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pedido #" + numeroPedido + ", Total: " + valor);
    }

    public void calcularFrete() {
        System.out.println("Frete calculado.");
    }


}
