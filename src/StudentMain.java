
public class StudentMain {

	public static void main(String[] args) {
		Person p = new Person("유재석");
		Student s = new Student("아이유");
		s.grade = "A";
		s.department = "Com";
		s.id = "1001";
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.grade);
		System.out.println(s.department);
		
//		Child1 c = new Child1("유재석","ㅇㄹㄴ");
//		c = s; // 서로 클래스 타입이 다를 경우 대입이 불가능함
		
//		Person 클래스의 변수 p에 Student 클래스의 객체를 대입
//		객체지향 언어의 다형성 특성 때문에 부모 클래스의 변수에 자식 클래스의 객체를 대입할 수 있음
		p = s;
//		변수의 겉모양은 부모 클래스인 Person 임
//		변수의 속 내용은 자손 클래스인 Student 임
//		p.name의 값이 Student 클래스 객체의 값이 출력됨
		System.out.println(p.name);
		
//		Person 클래스 타입의 변수 p에 자손 클래스 타입의 객체가 들어 있으므로 p.grade, p.department 가 동작
//		될 것이라 생각하지만 부모 클래스 객체로 잠시 모습이 변해있는 형태이기 때문에 자손 클래스 타입의 멤버들을 
//		사용할 수 없음
//		p.grade = "A";
//		p.department = "Com";
	}

}
