package db.DBConnection;

import java.util.List;
import java.util.Set;

import entity.Item;

public interface DBConnection {
	
	public void setFavoriteItems(String userId, List<String> itemIds);
	
	public void unsetFavoriteItems(String userId, List<String> itemIds);
	
	public Set<String> getFavoriteItemIds(String userId);

	public Set<Item> getFavoriteItems(String userId);

	public Set<String> getCategories(String itemId);
	
	public void saveItem(Item item);
	
	public List<Item> searchItems(String userId, double lat, double lon, String term);
}