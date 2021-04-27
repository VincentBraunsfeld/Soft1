import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class TestTasks {
	TaskIF task = null;
	
	String[] sequenz2 = null;
	
	

	@BeforeEach
	public void setUp() {
		
		sequenz2 = new String[] { "A", "C", "C", "D" };
		
	}

	@AfterEach
	public void reset() {
		task = null;
		
		
	}

	@Test
	@DisplayName("Soll false ergeben, gdw. ein String in der Sequenz doppelt vorkommt.")
	public void testTruekommtJederStringNurEinmanlVor() {
		assertEquals(false, task.kommtJederStringNurEinmalVor(sequenz2));
	}
}
