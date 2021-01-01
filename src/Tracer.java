
public class Tracer extends Character {
	
	@Override
	public void move() {
		System.out.println("트레이서가 빠르게 이동합니다.");
	}
	
	public void stop() {
		System.out.println("트레이서가 멈춥니다.");
	}
	
	public void attack() {
		System.out.println("트레이서가 펄스권총으로 공격합니다.");
	}
	
	public void skill() {
		System.out.println("트레이서가 펄스폭탄을 사용합니다.");
	}
}
