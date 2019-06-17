package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    int deleteById(Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(Long id);
    int addWithHashmap(Product product);
}
