package zpp.testBoot.domain;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zpp.testBoot.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
