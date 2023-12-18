package QuizPackage;

import org.junit.*;

public class TestCase {
	


	@Test
	public void OneTC1() {
		QuizOneJunit Obj = new QuizOneJunit();
		Assert.assertEquals(81, Obj.square(9));
	}
	
	@Test
	public void TwoTC1() {
		QuizOneJunit Obj = new QuizOneJunit();
		Assert.assertEquals(3, Obj.countLetterA("AaA"));
	}
	
	@Test
	public void TwoTC2() {
		QuizOneJunit Obj = new QuizOneJunit();
		Assert.assertEquals(0, Obj.countLetterA("Bowie"));
	}

	@Test
	public void TwoTC3() {
		QuizOneJunit Obj = new QuizOneJunit();
		Assert.assertEquals(0, Obj.countLetterA(""));
	}
	
	@Test
	public void ThreeTC1() {
		QuizOneJunit Obj = new QuizOneJunit();
		Assert.assertEquals(false,Obj.checkTwoLetter("a"));
	}
	
	@Test
	public void ThreeTC2() {
		QuizOneJunit Obj = new QuizOneJunit();
		Assert.assertEquals(true, Obj.checkTwoLetter("Ha"));
	}

	@Test
	public void ThreeTC3() {
		QuizOneJunit Obj = new QuizOneJunit();
		Assert.assertEquals(true, Obj.checkTwoLetter("BoBo"));
	}
	
}
