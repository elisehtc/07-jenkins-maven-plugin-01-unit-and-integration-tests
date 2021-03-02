package be.businesstraining.unitTests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import be.businesstraining.domain.Message;

public class MessageTest {

	private Message message = new Message(); //Object under tes

	@Test
	public void messageSaysHello() {
		// ARRANGE
		String expected = "Hello World";

		//ACT
		String actual = message.sayHello();

		//ASSERT
		assertThat(actual, containsString(expected));
	}

}
