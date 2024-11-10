package br.com.giulianabezerra.demo_spring_modulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class DemoSpringModulithApplicationTests {

	@Test
	void applicationModules() {
		var modules = ApplicationModules.of(DemoSpringModulithApplication.class);
		System.out.println(modules);

		modules.verify();
	}

}
