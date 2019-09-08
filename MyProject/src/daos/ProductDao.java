package daos;

import java.util.List;

import dto.Product;

public interface ProductDao 
{
	public boolean add(Product product);
	public boolean update(Product product, String productId);
	public boolean delete(String productId);
	public List<Product> getAllProducts();

}
