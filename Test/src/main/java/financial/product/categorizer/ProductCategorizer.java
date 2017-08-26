package financial.product.categorizer;

import java.util.List;

import financial.product.Bond;
import financial.product.Product;
import financial.product.Stock;

public class ProductCategorizer {
	
	public void categorizeProdcut(List<Product> products, List<Stock> stocks, List<Bond> bonds) {
		
		products.forEach( product -> {
			
			if (product instanceof Stock) {
				stocks.add( (Stock) product);
				
			}else {
				bonds.add( (Bond) product);
			}
		});
		
	}
}
