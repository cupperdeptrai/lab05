package doanhhoang.dao;


import java.util.List;
import doanhhoang.entity.Product;

public interface productDao {
	public List<Product> getAllProduct();
	public Product getProductById(String Id);
	public boolean insertProduct(Product Product);
	public boolean updateProduct(Product Product);
	public boolean deleteProduct(String id);
}
