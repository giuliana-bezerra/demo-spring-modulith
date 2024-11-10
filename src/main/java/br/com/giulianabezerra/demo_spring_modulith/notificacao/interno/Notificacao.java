package br.com.giulianabezerra.demo_spring_modulith.notificacao.interno;

import java.util.Date;

public record Notificacao(
        String nomeProduto,
        Date data,
        String formato) {

}
