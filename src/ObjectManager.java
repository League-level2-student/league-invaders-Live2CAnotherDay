import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocketship;
	ArrayList<Projectile> projectiles;
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	Random random = new Random();
	
	public ObjectManager(Rocketship rocketship) {
		this.rocketship = rocketship;
		projectiles = new ArrayList <Projectile>();
	}
	
	void addProjectile(Projectile projectile) {
		projectiles.add(projectile);
	}
	
	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
	}
	
	void update() {
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
			if(aliens.get(i).y > 10 || aliens.get(i). y , 10) {
				
			}
		}
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
	}
	
	void draw() {
		
	}
}
