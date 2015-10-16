package modeldao;

import model.ProductBean;

public interface ProductDAO {
	public abstract ProductBean selectALL();

	public abstract ProductBean selectById(String id);

}
