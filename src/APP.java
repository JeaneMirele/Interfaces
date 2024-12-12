public class APP {
    public static void main(String[] args){
        Loja loja = new Vendedor("João", "VipMake", "Rua Tulipas", 10);
        loja.operar();

        Produto produto = new Produto("VipMake", "Rua Tulipas", "Celular", 1500);
        produto.exibirDetalhes();
        produto.calcularDesconto(10);
        produto.alterarPreco(1200);

        Cliente cliente = new Cliente("VipMake", "Rua Tulipas", "João", 10, "Felipe@hotmail.com", "Rua das dores, 07, Maranhão", "José");
        cliente.comprar();

        Pedido pedido = new Pedido("VipMake", "Rua Tulipas", "João", 10, 1, 1200);
        pedido.exibirDetalhes();
        pedido.calcularFrete();
    }
}
