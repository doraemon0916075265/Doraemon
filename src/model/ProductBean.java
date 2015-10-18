package model;

import java.io.Serializable;
import java.util.Date;

public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Float price;
	private Date make;
	private Integer exprice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getMake() {
		return make;
	}

	public void setMake(Date make) {
		this.make = make;
	}

	public Integer getExprice() {
		return exprice;
	}

	public void setExprice(Integer exprice) {
		this.exprice = exprice;
	}

	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", name=" + name + ", price=" + price + ", make=" + make + ", exprice=" + exprice + "]";
	}

}
