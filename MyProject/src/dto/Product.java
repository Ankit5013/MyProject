package dto;

public class Product 
{
	private String categoryId;
	private String productId;
	private String name;
	private String description;
	private int price;
	private int quantity;
	private String url;
	
	public Product() {
		
	}

	public Product(String categoryId, String productId, String name, String description, int price, int quantity,
			String url) {
		super();
		this.categoryId = categoryId;
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.url = url;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

			
}