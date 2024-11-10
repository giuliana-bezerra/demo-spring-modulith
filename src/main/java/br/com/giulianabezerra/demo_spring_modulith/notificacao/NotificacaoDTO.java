package br.com.giulianabezerra.demo_spring_modulith.notificacao;

import java.util.Date;

import br.com.giulianabezerra.demo_spring_modulith.notificacao.interno.Notificacao;

public record NotificacaoDTO(
    String nomeProduto,
    Date data,
    String formato) {

  public Notificacao fromDTO() {
    return new Notificacao(nomeProduto, data, formato);
  }
}
