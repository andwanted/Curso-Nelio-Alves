package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYY) ");
		Date bDate = sdf.parse(sc.nextLine());

		Client client = new Client(name, email, bDate);

		System.out.println();
		System.out.println("Enter order data: ");
		System.out.print("Status");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("How many item to this order? ");
		int nOrder = sc.nextInt();

		for (int i = 1; i <= nOrder; i++) {
			System.out.println("Enter #" + nOrder + "item data");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			

			Product product = new Product(prodName,prodPrice);

			
			System.out.print("Quantity");
			int prodQuant = sc.nextInt();
			
			
			OrderItem orderItem = new OrderItem(prodQuant,prodPrice,product);
			
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);

		sc.close();

	}

}
