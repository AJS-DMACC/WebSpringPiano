package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public long getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}

	public int getNumKeys() {
		return numKeys;
	}

	public void setNumKeys(int numKeys) {
		this.numKeys = numKeys;
	}
	
	public boolean getIsElectric() {
		return isElectric;
	}
	
	public void setIsElectric( boolean isElectric) {
		this.isElectric = isElectric;
	}
	
	@Override
	public String toString() {
		return "Contact [bench=" + bench + "brand=" + brand + ", serial number=" + serialNum + ", keys=" + numKeys + "Is an electric piano" + isElectric +"]";
	}

	public Bench getBench() {
		return bench;
	}

	public void setBench(Bench bench) {
		this.bench = bench;
	}
}