package Exerc_02.entities;

public class ImportedProduct extends Product {
private Double custmsFree;


public ImportedProduct() {
	super();
}

public ImportedProduct(String name, Double price, Double custmsFree) {
	super(name, price);
	this.custmsFree = custmsFree;
}

public Double getCustmsFree() {
	return custmsFree;
}

public void setCustmsFree(Double custmsFree) {
	this.custmsFree = custmsFree;
}

public Double totalPrice() {
	return price+ custmsFree;
}

@Override
public String priceTag() {
	return getName()
			+" $ "+String.format("%.2f",totalPrice())
			+" (Customs fee: $ "
			+String.format("%.2f", custmsFree)+")";
}
}
