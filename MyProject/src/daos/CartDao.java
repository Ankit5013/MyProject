package daos;

import dto.Cart;

public interface CartDao 
{
	public boolean addToCart(Cart cart);
	public boolean removeFromCart(Cart cart);
	public boolean buyNow(Cart cart);
	
}
