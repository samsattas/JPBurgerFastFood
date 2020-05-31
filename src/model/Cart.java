package model;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<Product> products;
	
	public Cart() {
		products = new ArrayList<Product>();
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	
}
