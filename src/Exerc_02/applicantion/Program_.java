package Exerc_02.applicantion;

import Exerc_02.entities.ImportedProduct;
import Exerc_02.entities.Product;
import Exerc_02.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program_ {


	public static void main(String[] args) {
	/*Fazer um programa para ler os dados de N
	produtos (N fornecido pelo usuário). Ao final,
	mostrar a etiqueta de preço de cada produto na
	mesma ordem em que foram digitados.
	Todo produto possui nome e preço. Produtos
	importados possuem uma taxa de alfândega, e
	produtos usados possuem data de fabricação.
	Estes dados específicos devem ser
	acrescentados na etiqueta de preço conforme
	exemplo (próxima página). Para produtos
	importados, a taxa e alfândega deve ser
	acrescentada ao preço final do produto.*/

	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	List<Product> proct= new ArrayList<>();
	
	System.out.print("Enter the number of products: ");
	int n=sc.nextInt();
	for (int i = 1; i <=n; i++) {
		System.out.println("Product #"+i+" data: ");
		System.out.print("Common, used or imported (c/u/i)? ");
		char op=sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Name:  ");
		String name=sc.nextLine();
		System.out.print("Price: ");
		Double price=sc.nextDouble();
		if (op=='i') {
			System.out.print("Customs fee: ");// taxa de importacao
			Double cusmoFree=sc.nextDouble();
			Product prod= new ImportedProduct(name, price, cusmoFree);
			proct.add(prod);
		}else if(op=='u') {
			System.out.print("Manufacture date (DD/MM/YYYY): ");
			String date=sc.next();
			Product prod= new UsedProduct(name, price, LocalDate.parse(date,fmt1));
			proct.add(prod);
		}else {
			Product prod= new Product(name, price);
			proct.add(prod);
		}
	}
	System.out.println("");
	System.out.println("PRICE TAGS:");
	for (Product product : proct) {
		System.out.println(product.priceTag());
	}
	sc.close();
	}

}
