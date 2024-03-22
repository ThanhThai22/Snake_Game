package snakeGame;

import javax.swing.JFrame;

public class GameFrameGD extends JFrame{
	GameFrameGD() {
		GamePanel panel = new GamePanel();
		this.add(panel);
		
		//this.add(new GamePanel());
		this.setTitle("Snake Game Java!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
