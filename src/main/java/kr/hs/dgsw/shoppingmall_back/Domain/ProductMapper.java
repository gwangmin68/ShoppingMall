package kr.hs.dgsw.shoppingmall_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(@Param("id") Long id);
    int addWithHashmap(HashMap<String, Object> map);
}
