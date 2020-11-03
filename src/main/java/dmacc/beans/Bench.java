package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Bench {
	private int legs;//number of legs
	private int height;//height in inches
	private String shape;//shape of the bench
	
	public Bench() {
		super();
		//default no args constructor
	}
	
	public Bench(int legs, int height, String shape) {
		super();
		this.legs = legs;
		this.height = height;
		this.shape = shape;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Bench: legs-" + legs + " height-" + height + " shape-" + shape;
	}
	
	
}
