public class Vendedor extends Loja{
    private int avaliacao;
    private String nomeVendedor;

    public Vendedor(String nomeVendedor, String nome, String endereco, int avaliacao){
        super(nome,endereco);
        this.avaliacao= avaliacao;
        this.nomeVendedor= nomeVendedor;
    }


    public void Vendas(){
        System.out.println(nomeVendedor + " fez uma venda");
    }

    @Override
    public void operar() {
        System.out.println(nome + " operando com vendedor " + nomeVendedor);
    }
}



