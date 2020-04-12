package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {
	
	GettingStarted g;
	
    @BeforeEach
    public void setup() {
    	g = new GettingStarted();
    }
    
    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }


//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    
//    @Test
//    public void badPractice() {
//    	int result = g.addFive(0);
//    	Assertions.assertEquals(5, result);
//    	result = g.addFive(1);
//    	Assertions.assertEquals(6, result);
//    	result = g.addFive(6);
//    	Assertions.assertEquals(11, result);
//    }
}
