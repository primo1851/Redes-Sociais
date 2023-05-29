import java.util.ArrayList;

class main {
  public static void main(String[] args) {

    ArrayList<RedeSocial> redesSociais = new ArrayList<>();
    Facebook facebook = new Facebook();
    GooglePlus googlePlus = new GooglePlus();
    Twitter twitter = new Twitter();
    Instagram instagram = new Instagram();

    Usuario usuario = new Usuario(redesSociais);
    usuario.setNome("Nome");
    usuario.setEmail("email@usuario.com");
    usuario.mostraInfo();

    facebook.setSenha(" ");
    googlePlus.setSenha(" ");
    instagram.setSenha(" ");
    twitter.setSenha(" ");

    googlePlus.setNumAmigos(123);
    facebook.setNumAmigos(123);
    instagram.setNumAmigos(123);
    twitter.setNumAmigos(123);

    redesSociais.add(facebook);
    redesSociais.add(instagram);

    for (int i = 0; i < usuario.usa.size(); i++) {
      if (usuario.usa.get(i) instanceof Facebook) {
        Facebook fb = (Facebook) usuario.usa.get(i);
        System.out.println("---------Facebook---------");
        System.out.println("Numero de Amigos:" + fb.getNumAmigos());
        System.out.println("Senha:" + fb.getSenha());
        fb.compartilhar();
        fb.fazStreaming();
        fb.curtirPublicacao();
        System.out.println("\n");
      } else if (usuario.usa.get(i) instanceof Instagram) {
        Instagram ig = (Instagram) usuario.usa.get(i);
        System.out.println("---------Instagram---------");
        System.out.println("Numero de Amigos:" + ig.getNumAmigos());
        System.out.println("Senha:" + ig.getSenha());
        ig.postarComentario();
        ig.postarVideo();
        ig.postarFoto();
        System.out.println("\n");
      } else if (usuario.usa.get(i) instanceof Twitter) {
        Twitter tw = (Twitter) usuario.usa.get(i);
        System.out.println("---------Twitter---------");
        System.out.println("Numero de Amigos:" + tw.getNumAmigos());
        System.out.println("Senha:" + tw.getSenha());
        tw.postarComentario();
        tw.postarVideo();
        tw.postarFoto();
        System.out.println("\n");
      } else {
        GooglePlus gp = (GooglePlus) usuario.usa.get(i);
        System.out.println("---------Instagram---------");
        System.out.println("Numero de Amigos:" + gp.getNumAmigos());
        System.out.println("Senha:" + gp.getSenha());
        gp.postarComentario();
        gp.postarVideo();
        gp.postarFoto();
        System.out.println("\n");
      }
    }

  }
}