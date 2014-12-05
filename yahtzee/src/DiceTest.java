
import org.junit.*;
import static org.junit.Assert.*;

public class DiceTest {
	
    @Test
    public void dice_rolls_between_one_and_six() {
 
    	Dice dice = new Dice();
    	
    	assertTrue(dice.roll() >= 1 && dice.roll() <= 6);
    }
    
    

}
