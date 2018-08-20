package cn.itcast.springboot.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration  //通过该注解表明这是一个spring的配置，相当于xml文件
@ComponentScan(basePackages="cn.itcast.springboot.javaconfig") //配置扫描包
@PropertySource(value= {"classpath:jdbc.properties"},ignoreResourceNotFound=true)//导入外部配置文件，自动忽略没有发现的配置文件
public class SpringConfig {
	@Bean          //通过该注解表明是一个bean对象，相当于xml中的bean
	public UserDao getUserDao(){
		return new UserDao();  //直接new对象做演示
	}
	
	@Value("${jdbc.driverClassName}")
	private String jdbcDriverClassName;
	
	@Value("${jdbc.url}")
    private String jdbcUrl;
	
	@Value("${jdbc.username}")
	private String userName;
	
	@Value("${jdbc.password}")
	private String passWord; 
	
	@Bean(destroyMethod="close")
	public BoneCPDataSource boneCPDataSource(){
		BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
		//数据库驱动
		boneCPDataSource.setDriverClass(jdbcDriverClassName);
		//相应驱动的jdbcURL
		boneCPDataSource.setJdbcUrl(jdbcUrl);
		//数据库用户名
		boneCPDataSource.setUsername(userName);
		//数据库密码
		boneCPDataSource.setPassword(passWord);
		return boneCPDataSource;
	}
}
