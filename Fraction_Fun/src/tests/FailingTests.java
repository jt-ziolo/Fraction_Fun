package tests;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import game.Board;
import game.Player;

public class FailingTests {
	
	private static Board board;

	@BeforeClass
	public void initialize(){
		board = new Board();
		board.initialize();
	}
	
	@Test
	public void playerMovesOneForward() {
		Player player = new Player();
		player.move();
		assertEquals(board.getCurrentPlayer().getLocation(), )
	}
	
	@Test
	public void CPUMovesCorrectly(){
		
	}
	
	@Test
	public void gameEndsRight(){
		
	}
	
	@Test
	public void TestCore1(){
		
	}
	
	@Test
	public void TestCore2(){
		
	}
	
	@Test
	public void TestCore3b(){
		
	}
	
	@Test
	public void TestCore3c(){
		
	}
	
	@Test
	public void TestCore4(){
		
	}
	
	@Test
	public void TestCore5(){
		
	}

}
