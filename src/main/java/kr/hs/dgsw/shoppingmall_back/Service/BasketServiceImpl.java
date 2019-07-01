package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.Basket;
import kr.hs.dgsw.shoppingmall_back.Domain.BasketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BasketServiceImpl  implements  BasketService{
    @Autowired
    BasketMapper basketMapper;

    @Override
    public List<Basket> findAll() {
        return this.basketMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return this.basketMapper.deleteById(id);
    }

    @Override
    public Long add(Basket basket) {
        return this.basketMapper.add(basket);
    }

    @Override
    public int modify(Basket basket) {
        return this.basketMapper.modify(basket);
    }

    @Override
    public Basket findById(Long id) {
        return this.basketMapper.findById(id);
    }

    @Override
    public int addWithHashmap(Basket basket) {
        HashMap map = new HashMap<String, Object>();
        map.put("user_id", basket.getUser_id());
        map.put("product_id", basket.getProduct_id());
        map.put("product_cnt", basket.getProduct_cnt());
        return this.basketMapper.addWithHashmap(map);
    }
}
