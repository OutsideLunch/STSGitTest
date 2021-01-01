
public class ChildMain {

	public static void main(String[] args) {
		
		Parents1 p1 = new Parents1();
		p1.output1();
		p1.output2();
		
		Child1 c1 = new Child1("유재석", "youtube@naver.com");
		c1.output1();
		c1.output2();
		
		System.out.println("c1.name " + c1.name);
		c1.name = "아이유";
		System.out.println("c1.name " + c1.name);
		
//		System.out.println("c1.email " + c1.email);
//		c1.email = "yyyy@naver.com";
//		System.out.println("c1.email " + c1.email);
	}

}
