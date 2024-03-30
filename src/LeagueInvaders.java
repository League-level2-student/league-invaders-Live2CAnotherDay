import javax.swing.JFrame;

public class LeagueInvaders {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeagueInvaders invader = new LeagueInvaders();
	}
	JFrame frame = new JFrame();
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	public LeagueInvaders() {
		frame.getMaximumSize();
	}
	void setup() {
		WIDTH = 500;
		HEIGHT = 800;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
