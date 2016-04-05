package or.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import or.test.springboot.hook.ShutdownHookThread;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = { "or.test.springboot" })
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		// 添加进程结束时的处理
		Runtime.getRuntime().addShutdownHook(new Thread(new ShutdownHookThread()));
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8008);
	}
}