
public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.sendMsg();
		
		Iphone i = new Iphone();
		i.sendMsg();
		
		GalaxyPhone g = new GalaxyPhone();
		g.sendMsg();
		
		p = i;
		p.sendMsg();
		
		p = g;
		p.sendMsg();
	}

}
