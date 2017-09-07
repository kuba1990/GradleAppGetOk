package com.example.demo;

import com.example.demo.restApp.controller.demoAppController;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest(classes= DemoApplication.class)

public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		//given
		String actual = "name";
		String expected = "Hi name Bisnode";
		//when
		demoAppController controller = new demoAppController();
		controller.talkWithMe("name");
		//then
		Assert.assertTrue(controller.talkWithMe("name").equals(expected));
	}
}
