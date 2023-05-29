public class Facebook extends RedeSocial implements IVideoConferencia, ICompartilhamento {

  @Override
  public void fazStreaming() {
    System.out.println("Realizou uma vídeo conferência no Facebook");
  }

  @Override
  public void compartilhar() {
    System.out.println("Realizou um compartilhamento no Facebook");
  }

  @Override
  public void curtirPublicacao() {
    System.out.println("Curtiu uma publicação no Facebook");
  }

  @Override
  public void postarComentario() {
    System.out.println("Postou um comentario no Facebook");
  }

  @Override
  public void postarVideo() {
    System.out.println("Postou um video no Facebook");
  }

  @Override
  public void postarFoto() {
    System.out.println("Postou uma foto no Facebook");
  }

}
