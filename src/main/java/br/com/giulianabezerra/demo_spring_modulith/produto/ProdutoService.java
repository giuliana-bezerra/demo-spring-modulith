package br.com.giulianabezerra.demo_spring_modulith.produto;

import java.util.Date;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import br.com.giulianabezerra.demo_spring_modulith.notificacao.NotificacaoDTO;

@Service
public class ProdutoService {
  private final ApplicationEventPublisher applicationEventPublisher;

  public ProdutoService(ApplicationEventPublisher applicationEventPublisher) {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  public void criarProduto(Produto produto) {
    System.out.println("Criando produto: " + produto);

    applicationEventPublisher.publishEvent(new NotificacaoDTO(produto.nome(), new Date(), "Email"));
  }
}
