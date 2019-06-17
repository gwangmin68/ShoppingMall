package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.Attach;

import java.util.HashMap;

public interface AttachService {
    HashMap User_findById(Long id);
    Long User_add(Attach attach);
    int User_modify(Attach attach);
    int User_deleteById(Long id);
    HashMap Product_findById(Long id);
    Long Product_add(Attach attach);
    int Product_modify(Attach attach);
    int Product_deleteById(Long id);
}
