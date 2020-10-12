package mainGame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Game extends JFrame{

	public Game() {
		initializeUI();
	}
	
	private void initializeUI() {
		add(new Board());
		setSize(800, 600);
		setTitle("Connect Four");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Game game = new Game();
			game.setVisible(true);
		});
	}

}
