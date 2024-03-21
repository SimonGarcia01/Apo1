package model;

public class Ship{

	//atributes
	private String name;
	private double limMin;
	private double limMax;
	
	//Relations
	
	//methods
	public Ship(String name, double limMin, double limMin){
		this.name = name;
		this.limMin = limMin;
		this.limMax = limMax;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public void getLimMax(){
		return limMax;
	}
	
	public void setLimMax(double newLimMax){
		this.limMax = newLimMax;
	}

}