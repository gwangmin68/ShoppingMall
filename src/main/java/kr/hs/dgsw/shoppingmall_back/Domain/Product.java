package kr.hs.dgsw.shoppingmall_back.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private String explain;
    private int price;
    private LocalDateTime created;
    private LocalDateTime updated;
}
