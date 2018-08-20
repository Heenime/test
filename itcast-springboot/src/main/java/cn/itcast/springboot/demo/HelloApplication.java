package cn.itcast.springboot.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {
	/* implements EmbeddedServletContainerCustomizer*/
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello Springboot";
	}
	public static void main(String args[]) {
		SpringApplication.run(HelloApplication.class,args);
		System.out.println("ok");
	}
	/*public void customize(ConfigurableEmbeddedServletContainer container){
		container.setPort(8081);
	}*/ //这个例子证明了，代码还是优先级要高于配置文件的，有了代码端口号是8081，没有代码端口号是8089
}
