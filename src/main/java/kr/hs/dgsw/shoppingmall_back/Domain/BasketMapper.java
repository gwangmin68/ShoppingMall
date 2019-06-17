package kr.hs.dgsw.shoppingmall_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BasketMapper {
    List<Basket> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Basket basket);
    int modify(Basket basket);
    Basket findById(@Param("id") Long id);
    int addWithHashmap(HashMap<String, Object> map);
}
