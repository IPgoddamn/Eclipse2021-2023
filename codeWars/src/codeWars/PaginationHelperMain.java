package codeWars;
import java.util.Arrays;
import java.util.List;
public class PaginationHelperMain{
	public static void main(String[] args) {
		 PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList(), 4);
//		 System.out.println(helper.pageIndex(5));
		 System.out.println(helper.pageItemCount2(0));
	}
}
class PaginationHelper <I>{
	List<I> collection;
	int itemsPerPage;
public PaginationHelper(List<I> collection, int itemsPerPage) {
	this.itemsPerPage = itemsPerPage;
	this.collection = collection;
}
public int itemCount() {
	return collection.size();
}
public int pageCount() {
	int count = 0;
	for (int n = itemCount(); n > 0; n -= itemsPerPage)count++;
	return count;
}
public int pageItemCount(int pageIndex) {
	if (pageCount() == 0 && pageCount() == pageIndex) return 0;
	if (pageIndex == pageCount() - 1 && pageCount() != 0) return itemCount() % itemsPerPage;
	if (pageIndex >= 0 && pageIndex < pageCount()) return itemsPerPage;
	return -1;
}
public int pageItemCount2(int pageIndex) {
    if (pageIndex >= pageCount() || pageIndex < 0) 
      return -1;
    else if (pageIndex < pageCount()-1)
      return itemsPerPage;
    else
      return itemCount() % itemsPerPage;
  }

public int pageIndex(int itemIndex) {
	if (itemIndex < itemCount() + 1) {
		int count = 0;
		for (int n = itemIndex; n > 0; n -= itemsPerPage)count++;
		return count - 1;
	}
	return -1;
}
}