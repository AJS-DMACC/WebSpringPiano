package dmacc.beans;

import javax.persistence.Embeddable;
import lombok.Data;

@Data @Embeddable
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

}
