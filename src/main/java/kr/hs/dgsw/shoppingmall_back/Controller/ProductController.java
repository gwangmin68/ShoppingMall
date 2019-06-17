package kr.hs.dgsw.shoppingmall_back.Controller;

import kr.hs.dgsw.shoppingmall_back.Domain.Product;
import kr.hs.dgsw.shoppingmall_back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/list")
    public List<Product> select(){
        return this.productService.findAll();
    }

    @GetMapping("/product/{id}")
    public Product select(@PathVariable Long id){
        return this.productService.findById(id);
    }

    @DeleteMapping("/product/delete/{id}")
    public int delete(@PathVariable Long id){
        return this.productService.deleteById(id);
    }

    @PostMapping("/product/add")
    public Long insert(@RequestBody Product product){
        return this.productService.add(product);
    }

    @PostMapping("/product/addHash")
    public int insertHash(@RequestBody Product product){
        return this.productService.addWithHashmap(product);
    }

    @PutMapping("product/update")
    public int update(@RequestBody Product product){
        return this.productService.modify(product);
    }
}
