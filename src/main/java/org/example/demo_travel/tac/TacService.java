package org.example.demo_travel.tac;


import java.util.List;

public interface TacService {

    public List<TacVO> searchList(String searchWord);
    public String formatRelationTitle(String relationTitle);


}
