package cn.itcast.springboot.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao; //注入bean对象
	
	public List<User> queryUserList(){
		return this.userDao.queryUserList();
	}
}
