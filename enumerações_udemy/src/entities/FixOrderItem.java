package entities;

public class FixOrderItem {
	
	private Integer quantity;
	private Double price;
	
	private FixProduct product;
	
	public FixOrderItem() {
	}

	public FixOrderItem(Integer quantity, Double price, FixProduct product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public FixProduct getProduct() {
		return product;
	}

	public void setProduct(FixProduct product) {
		this.product = product;
	}

	public Double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", ");
		sb.append(String.format("%.2f", price) + ", ");
		sb.append("Quantity: ");
		sb.append(quantity + ", ");
		sb.append("Subtotal: $");
		sb.append(subTotal());
		return sb.toString();
	}
}
