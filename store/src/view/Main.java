package view;

import controller.ProductController;
import model.Product;

public class Main {

	public static void main(String[] args) {

		Product product = new Product("Tv", 2000.00);
		ProductController controller = new ProductController();
		controller.addProducts(3);
		controller.removeProducts(0);
		Double tot;
		tot = controller.totalValueInStock(product);
		System.out.println("Valor total em estoque: " + tot);

	}
}
