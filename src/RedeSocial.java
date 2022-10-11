public abstract class RedeSocial{
  protected String senha;
  protected int numAmigos;

   public abstract void postarFoto();
   public abstract void postarVideo();
   public abstract void postarComentario();

   void curtirPublicacao(){
    
    System.out.println("Curtiu uma publicação");
   }
  
    public int getNumAmigos() {
        return this.numAmigos;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
}