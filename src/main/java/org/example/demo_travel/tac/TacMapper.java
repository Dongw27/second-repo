package org.example.demo_travel.tac;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TacMapper {

    public List<TacVO> searchList(String searchWord1, String searchWord2);



}
