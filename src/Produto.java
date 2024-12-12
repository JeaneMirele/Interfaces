public class Produto extends Loja implements l1,l2{
   private String nomeProduto;
   private double preco;

   public Produto(String nome, String endereco, String nomeProduto, double preco){
        super(nome,endereco);
        this.nomeProduto=nomeProduto;
        this.preco= preco;
       }


    @Override
    public void exibirDetalhes() {
        System.out.println("Produto: " + nomeProduto + ", Preço: " + preco);

    }

    @Override
    public void calcularDesconto(double percentual) {
        this.preco -= this.preco * (percentual / 100);
        System.out.println("Preço com desconto: " + preco);
    }

    @Override
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("Preço alterado para: " + preco);
    }

    @Override
    public void operar() {
        System.out.println("Produto sendo operado.");
    }
}

