package cn.itcast.springboot.javaconfig;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String args[]) {
		//通过java配置来实例化spring容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		//在Spring容器中获取Bean对象
		UserService userService =context.getBean(UserService.class);
		//调用对象中的方法
		List<User> users =userService.queryUserList();
		for(User user:users) {
			System.out.println(user.getUsername()+","+user.getPassword()+","+user.getAge()+" ");
		}
		//销毁该容器
		context.destroy();
	}
}
