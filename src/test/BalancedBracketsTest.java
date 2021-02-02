package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Should be true if there is a left and right bracket and no text
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //should be true if there are 2 sets of brackets
    @Test
    public void doubleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    //should be true if there are characters in left/right brackets
    @Test
    public void bracketsWithCharInsideReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[something]"));
    }

    //returns false if there is only one bracket
    @Test
    public void singleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //returns false if there is unbalanced brackets
    @Test
    public void unbalancedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    //returns true if no brackets
    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //returns false if brackets are facing away from another
    @Test
    public void opposingBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void moreClosingBracketsThanOpening(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]["));
    }
    @Test
    public void opposingBracketsWithWordsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void closeBracketsFirstEdgeFail(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][a][b][["));
    }
    @Test
    public void tonsOfBracketsBalancedTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[a][b]][[[c][d]]]"));
    }






}
