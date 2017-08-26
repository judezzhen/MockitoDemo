package financial.product.categorizer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import financial.product.Bond;
import financial.product.Product;
import financial.product.Stock;

@RunWith(MockitoJUnitRunner.class)
public class ProductCategorizerTest {
	
	@InjectMocks
	ProductCategorizer productCategorizer;
	
	private List<Product> products;
	
	@Before
	public void setup() {
		products = new ArrayList<>();

		products.add(new Stock());
		products.add(new Bond());
	}
	
	@Test
	public void categorizeProdcutTest() {
		List<Stock> stocks = new ArrayList<>();
		List<Bond> bonds= new ArrayList<>();
		productCategorizer.categorizeProdcut(products, stocks, bonds);
		
		assertEquals(stocks.size(), 1);
		assertEquals(bonds.size(), 1);
	}
}
