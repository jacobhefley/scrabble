import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {
//
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, yourApp.calculateScore("a"));
  }
  @Test
  public void calculateScore_returnsScoreFor1pointers() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, yourApp.calculateScore("aeioulnrst"));
  }
  
  @Test
  public void calculateScore_returnsScoreFor2pointers() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, yourApp.calculateScore("dg"));
  }
  @Test
  public void calculateScore_returnsScoreFor3pointers() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 12;
    assertEquals(expected, yourApp.calculateScore("bcpm"));
  }

  @Test
  public void calculateScore_returnsScoreFor4pointers() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 20;
    assertEquals(expected, yourApp.calculateScore("fhvwy"));
  }

  @Test
  public void calculateScore_returnsScoreFor5pointers() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, yourApp.calculateScore("k"));
  }

  @Test
  public void calculateScore_returnsScoreFor8pointers() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 16;
    assertEquals(expected, yourApp.calculateScore("jx"));
  }

  @Test
  public void calculateScore_returnsScoreFor10pointers() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 20;
    assertEquals(expected, yourApp.calculateScore("zq"));
  }
  @Test
  public void calculateScore_returnsScoreForAll() {
    Scrabble yourApp = new Scrabble();
    Integer expected = 87;
    assertEquals(expected, yourApp.calculateScore("abcdefghijklmnopqrstuvwxyz"));
  }
}
