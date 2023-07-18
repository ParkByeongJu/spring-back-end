package di.pojo;

public class Car {
	
	private Tire tire;
	
	public Car() {
		
	}
	
	//생성자 주입
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	//세터 주입
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void printTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}

	
}
