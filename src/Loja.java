public abstract class Loja{
    protected String nome;
    protected String endereco;

    public Loja(String nome, String endereco){
        this.nome = nome;
        this.endereco= endereco;
    }

   public abstract void operar();


}