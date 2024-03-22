package model;

public class Ship{

	//atributes
	private String name;
	private double limMin;
	private double limMax;
	
	//Relations
	
	//methods
	public Ship(String name, double limMin, double limMax){
		this.name = name;
		this.limMin = limMin;
		this.limMax = limMax;
	}
	

	//Getters and Setters
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		this.name = newName;
	}

	public double getLimMin(){
		return limMin;
	}
	
	public void setLimMin(double newLimMin){
		this.limMin = newLimMin;
	}
	
	public double getLimMax(){
		return limMax;
	}
	
	public void setLimMax(double newLimMax){
		this.limMax = newLimMax;
	}

}