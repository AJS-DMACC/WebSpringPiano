package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data @Entity
public class Piano{	
	private String brand;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long serialNum;
	private int numKeys;
	private boolean isElectric;
	@Autowired
	private Bench bench;
	
	public Piano() {
		super();	
	}
	
	public Piano(String brand) {
		super();
		this.brand = brand;
	}
	
	public Piano(String brand, boolean isElectric, int numKeys, Bench bench) {
		super();
		this.brand = brand;
		this.isElectric = isElectric;
		this.numKeys = numKeys;
		this.bench = bench;
	}

}