package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.Attach;
import kr.hs.dgsw.shoppingmall_back.Domain.ProductAttachMapper;
import kr.hs.dgsw.shoppingmall_back.Domain.UserAttachMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AttachServiceImpl implements AttachService {

    @Autowired
    UserAttachMapper userAttachMapper;

    @Autowired
    ProductAttachMapper productAttachMapper;

    @Override
    public HashMap User_findById(Long id) {
        return this.userAttachMapper.findById(id);
    }

    @Override
    public Long User_add(Attach post) {
        return this.userAttachMapper.add(post);
    }

    @Override
    public int User_modify(Attach post) {
        return this.userAttachMapper.modify(post);
    }

    @Override
    public int User_deleteById(Long id) {
        return this.userAttachMapper.deleteById(id);
    }

    @Override
    public HashMap Product_findById(Long id) {
        return this.productAttachMapper.findById(id);
    }

    @Override
    public Long Product_add(Attach post) {
        return this.productAttachMapper.add(post);
    }

    @Override
    public int Product_modify(Attach post) {
        return this.productAttachMapper.modify(post);
    }

    @Override
    public int Product_deleteById(Long id) {
        return this.productAttachMapper.deleteById(id);
    }
}
