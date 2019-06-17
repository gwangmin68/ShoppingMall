package kr.hs.dgsw.shoppingmall_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ProductAttachMapper {
    HashMap findById(Long id);
    Long add(Attach attach);
    int modify(Attach attach);
    int deleteById(Long id);
}
