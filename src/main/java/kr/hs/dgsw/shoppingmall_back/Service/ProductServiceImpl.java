package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.Product;
import kr.hs.dgsw.shoppingmall_back.Domain.ProductMapper;
import kr.hs.dgsw.shoppingmall_back.Domain.User;
import kr.hs.dgsw.shoppingmall_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return this.productMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return this.productMapper.deleteById(id);
    }

    @Override
    public Long add(Product product) {
        return this.productMapper.add(product);
    }

    @Override
    public int modify(Product product) {
        return this.productMapper.modify(product);
    }

    @Override
    public Product findById(Long id) {
        return this.productMapper.findById(id);
    }

    @Override
    public int addWithHashmap(Product product) {
        HashMap map = new HashMap<String, Object>();
        map.put("name", product.getName());
        map.put("content", product.getContent());
        map.put("price", product.getPrice());
        return this.productMapper.addWithHashmap(map);
    }
}
