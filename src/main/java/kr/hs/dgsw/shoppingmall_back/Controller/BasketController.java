package kr.hs.dgsw.shoppingmall_back.Controller;

import kr.hs.dgsw.shoppingmall_back.Domain.Basket;
import kr.hs.dgsw.shoppingmall_back.Domain.Product;
import kr.hs.dgsw.shoppingmall_back.Service.BasketService;
import kr.hs.dgsw.shoppingmall_back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {
    @Autowired
    BasketService basketService;

    @GetMapping("/basket/list")
    public List<Basket> select(){
        return this.basketService.findAll();
    }

    @GetMapping("/basket/{id}")
    public Basket select(@PathVariable Long id){
        return this.basketService.findById(id);
    }

    @DeleteMapping("/basket/delete/{id}")
    public int delete(@PathVariable Long id){
        return this.basketService.deleteById(id);
    }

    @PostMapping("/basket/add")
    public Long insert(@RequestBody Basket product){
        return this.basketService.add(product);
    }

    @PostMapping("/basket/addHash")
    public int insertHash(@RequestBody Basket product){
        return this.basketService.addWithHashmap(product);
    }

    @PutMapping("basket/update")
    public int update(@RequestBody Basket product){
        return this.basketService.modify(product);
    }
}
