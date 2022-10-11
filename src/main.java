class main{
  public static void main(String[] args) {
    RedeSocial redeSociais[] = new RedeSocial[100];

    Facebook facebook = new Facebook();
    GooglePlus googlePlus = new GooglePlus();
    Twitter twitter = new Twitter();
    Instagram instagram = new Instagram();

    Usuario usuario = new Usuario("nome", "email");
    
    facebook.setSenha(" ");
    googlePlus.setSenha(" ");
    instagram.setSenha(" ");
    twitter.setSenha(" ");

    googlePlus.setNumAmigos(123);
    facebook.setNumAmigos(123);
    instagram.setNumAmigos(123);
    twitter.setNumAmigos(123);

    redeSociais[0] = facebook;
    redeSociais[1] = googlePlus;
    redeSociais[2] = twitter;
    redeSociais[3] = instagram;
    
    usuario.usuario(redeSociais);
  } 
}