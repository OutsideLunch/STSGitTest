
public class Overwatch {

	public static void main(String[] args) {
		
		Player p = new Player();
		Tracer t = new Tracer();
		Genzi g = new Genzi();
		Character c;
		
		p.cMove(t);
		p.cStop(t);
		p.cAttack(t);
		p.cSkill(t);
		
		c = new Mac();
		p.cAttack(c);
		p.cMove(c);
		p.cSkill(c);
		p.cStop(c);
		
		c = t;
		p.cAttack(c);
		p.cMove(c);
		p.cSkill(c);
		p.cStop(c);
		
		c = g;
		p.cAttack(c);
		p.cMove(c);
		p.cSkill(c);
		p.cStop(c);

	}

}
