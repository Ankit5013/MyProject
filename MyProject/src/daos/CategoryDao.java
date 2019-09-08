package daos;

import java.util.List;

import dto.Category;

public interface CategoryDao 
{
	public boolean add(Category category);
	public boolean delete(String categoryId);
	public List<Category> getAllCategories();
}
