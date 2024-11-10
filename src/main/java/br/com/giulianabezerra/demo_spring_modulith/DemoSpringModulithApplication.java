package br.com.giulianabezerra.demo_spring_modulith;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import br.com.giulianabezerra.demo_spring_modulith.produto.Produto;
import br.com.giulianabezerra.demo_spring_modulith.produto.ProdutoService;

@EnableAsync
@SpringBootApplication
public class DemoSpringModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringModulithApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(ProdutoService produtoService) {
		return args -> {
			produtoService.criarProduto(new Produto("Produto 1", "Descrição do produto 1", 100.0));
		};
	}
}
