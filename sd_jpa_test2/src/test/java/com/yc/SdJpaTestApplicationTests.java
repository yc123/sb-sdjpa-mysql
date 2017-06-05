package com.yc;

import com.yc.entity.User;
import com.yc.repository.UserRepository;
import com.yc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SdJpaTestApplicationTests {

	/*@Autowired
	UserRepository userRepository;*/

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {




//		userRepository.save(new User("test2",19));
//		userRepository.save( new User("3test",12));
//		userRepository.save( new User("test4",13));
//		userRepository.save( new User("5test",14));
		System.out.println(userService.findById(1L));
//		List<User> listUser = userRepository.findByNameStartingWith("test");
//		for (User user: listUser
//			 ) {
//			System.out.println(user);
//		}
		userService.updateNameById("杨超",1L);
		System.out.println(userService.findById(1L));
	}

}
