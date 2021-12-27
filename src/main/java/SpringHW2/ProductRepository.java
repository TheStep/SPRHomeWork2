package SpringHW2;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface ProductRepository {
    Product findProductById(Long id);
    List<Product> getProductList();
}