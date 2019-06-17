package kr.hs.dgsw.shoppingmall_back.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Basket {
    private Long id;
    private Long user_id;
    private Long product_id;
}
