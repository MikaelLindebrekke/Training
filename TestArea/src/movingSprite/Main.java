package movingSprite;

import java.awt.EventQueue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {
	
	public Main() {
		initUI(); 
	}
	private void initUI() {
		add(new Board());
		setResizable(false);
		pack();
		setTitle("SPACESHIP!");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Main ex = new Main(); 
			ex.setVisible(true);
		});
	}
}
