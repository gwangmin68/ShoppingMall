package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.Basket;

import java.util.List;

public interface BasketService {
    List<Basket> findAll();
    int deleteById(Long id);
    Long add(Basket basket);
    int modify(Basket basket);
    Basket findById(Long id);
    int addWithHashmap(Basket basket);
}
