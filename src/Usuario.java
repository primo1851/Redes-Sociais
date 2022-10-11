public class Usuario{
  private String nome;
  private String email;


  Facebook facebook = new Facebook();
  GooglePlus googlePlus = new GooglePlus();
  Twitter twitter = new Twitter();
  
  
  void usuario(RedeSocial[] redeSociais){
    
    facebook.fazStreaming();
    facebook.compartilhar();
    redeSociais[0].curtirPublicacao();
    redeSociais[0].postarComentario();
    redeSociais[0].postarVideo();
    System.out.println("\n");

    googlePlus.fazStreaming();
    googlePlus.compartilhar();
    redeSociais[1].curtirPublicacao();
    redeSociais[1].postarComentario();
    redeSociais[1].postarVideo();
    System.out.println("\n");

    twitter.fazStreaming();
    twitter.compartilhar();
    redeSociais[2].curtirPublicacao();
    redeSociais[2].postarComentario();
    redeSociais[2].postarVideo();
    System.out.println("\n");
    
    redeSociais[3].curtirPublicacao();
    redeSociais[3].postarComentario();
    redeSociais[3].postarFoto();
    redeSociais[3].postarVideo();
    System.out.println("\n");
  }

  Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
}