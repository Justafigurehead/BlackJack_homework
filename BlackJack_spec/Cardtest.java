import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import BlackJack.*;


public class CardTest{

  Card one;
  Card ace;

  @Before
  public void before(){
    one = new Card("One", 1);
    ace = new Card("Ace", 11);
  }

  // TESTS for basic card

  @Test
  public void testCanGetCardValue(){
    assertEquals(1, one.getValue());
  }

  @Test
  public void testCanChangeCardValue(){
    ace.setValue(1);
    assertEquals(1, ace.getValue());
  }

  @Test 
  public void testGetCardName(){
    assertEquals("Ace", ace.getName());
  }


}