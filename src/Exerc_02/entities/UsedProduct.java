package Exerc_02.entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class UsedProduct extends Product{
private static DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
private LocalDate manufactureDate;

public UsedProduct() {
	super();
}
public UsedProduct(String name, Double price, LocalDate manufactureDate) {
	super(name, price);
	this.manufactureDate = manufactureDate;
}


public LocalDate getManufactureDate() {
	return manufactureDate;
}
public void setManufactureDate(LocalDate manufactureDate) {
	this.manufactureDate = manufactureDate;
}

@Override
public String priceTag() {
	return name
			+" (used) $ "
			+String.format("%.2f", price)
			+" (Manufacture date: "
			+manufactureDate.format(fmt1)
			+")";
	
}

}
