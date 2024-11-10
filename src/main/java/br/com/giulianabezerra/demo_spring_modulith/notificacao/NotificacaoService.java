package br.com.giulianabezerra.demo_spring_modulith.notificacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {
  private final static Logger LOGGER = LoggerFactory.getLogger(NotificacaoService.class);

  @ApplicationModuleListener
  public void criarNotificacao(NotificacaoDTO notificacaoDTO) {
    var notificacao = notificacaoDTO.fromDTO();
    LOGGER.info("Criando notificação: {}", notificacao);
  }
}
