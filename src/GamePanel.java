import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
	final int MENU = 0;
	final int GAME = 1; 
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font normalFont;
	Timer frameDraw;
	Rocketship rocketship = new Rocketship(250, 700, 50, 50);
	
	public GamePanel(){
		titleFont = new Font("Arial", Font.PLAIN, 48);
		normalFont = new Font("Arial", Font.PLAIN, 24);
		frameDraw = new Timer(1000/60, this);
		frameDraw.start();
		
	}
	
	void updateMenuState() {
		
	}
	
	void updateGameState() {
		
	}
	
	void updateEndState() {
	
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("League Invaders", 75, 100);
		g.setFont(normalFont);
		g.drawString("Press ENTER to start", 125, 250);
		g.drawString("Press SPACE for instructions", 90, 550);
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		rocketship.draw(g);
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.CYAN);
		g.drawString("GAME OVER", 100, 100);
		g.setFont(normalFont);
		g.drawString("You killed enemies", 145, 250);
		g.drawString("Press ENTER to restart", 130, 550);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if(currentState == MENU) {
			drawMenuState(g);
		}else if(currentState == GAME) {
			drawGameState(g);
		}else if(currentState == END) {
			drawEndState(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU) {
			updateMenuState();
		}else if(currentState == GAME) {
			updateGameState();
		}else if(currentState == END) {
			updateEndState();
		}
		//System.out.println("action");
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			if(currentState == END) {
				currentState = MENU;
			}
			else {
				currentState++;
			}
		}
		if(arg0.getKeyCode() == KeyEvent.VK_UP) {	
			if (rocketship.y > 0) {
			System.out.println("UP");
			rocketship.up();
			}
		}else if(arg0.getKeyCode() == KeyEvent.VK_DOWN) {			
			if (rocketship.y < LeagueInvaders.HEIGHT -rocketship.height) {
				System.out.println("DOWN");
				rocketship.down();
				}
		}else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT) {			
			if (rocketship.x < LeagueInvaders.WIDTH -rocketship.width) {
				System.out.println("RIGHT");
				rocketship.right();
				}
		}else if(arg0.getKeyCode() == KeyEvent.VK_LEFT) {			
			if (rocketship.x > 0) {
				System.out.println("LEFT");
				rocketship.left();
				}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
