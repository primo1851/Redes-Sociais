public class Twitter extends RedeSocial implements IVideoConferencia,ICompartilhamento{
@Override
public void fazStreaming(){
    System.out.println("Realizou uma vídeo conferência no Twitter");
  }
@Override
public void compartilhar(){
    System.out.println("Realizou um compartilhamento no Twitter" );
  }
@Override
public void curtirPublicacao(){
  System.out.println("Curtiu uma publicação no Twitter");
  }

@Override
public void postarComentario(){
  System.out.println("Postou um comentario no Twitter");
}
@Override
public void postarVideo(){
  System.out.println("Postou um video no Twitter");
}

@Override
public void postarFoto(){
  System.out.println("Postou uma foto no Facebook");
}

}