package edu.kh.poly.ex1.model.vo;

public class Car {
	
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴개수
	
	public Car() {}

	// alt + shift + s -> o -> enter
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// Object.toString() 오버라이딩
	@Override // 오버라이딩했다는걸 알려주는 Override 어노테이션
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}

	
	
	

}
