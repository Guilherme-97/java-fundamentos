package controller;

import model.Product;

public class ProductController {

	Double totalValue = 0.0;
	Integer quantityInStock = 0;
	Product product;

	public Double totalValueInStock(Product produto) {
		totalValue += produto.getPrice() * quantityInStock;
		return totalValue;
	}

	public void addProducts(Integer quantity) {

		quantityInStock += quantity;

		System.out.println("Quantidade em estoque: " + quantityInStock);
	}

	public void removeProducts(Integer quantity) {
		quantityInStock -= quantity;

		System.out.println("Quantidade em estoque: " + quantityInStock);
	}
}
