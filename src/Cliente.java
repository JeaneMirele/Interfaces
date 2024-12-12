public class Cliente extends Vendedor {
    private String enderecoCliente;
    private String email;
    private String nomeCliente;
    public Cliente(String nome, String endereco, String nomeVendedor, int avaliacao, String email, String enderecoCliente, String nomeCliente){
       super(nome, endereco, nomeVendedor, avaliacao);
        this.email= email;
        this.enderecoCliente= enderecoCliente;
        this.nomeCliente= nomeCliente;
    }
    public void comprar() {
        System.out.println(nomeCliente + " realizou uma compra.");
    }


}
