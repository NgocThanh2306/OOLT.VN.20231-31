package model.object;



public class CubeShapedObject extends MainObject {
	
	private double sideLength;

	public CubeShapedObject(double mass, double velocity, double sideLength) {
		super(mass, velocity);
		
		// TODO Auto-generated constructor stub
		this.sideLength = sideLength;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
		
	

}