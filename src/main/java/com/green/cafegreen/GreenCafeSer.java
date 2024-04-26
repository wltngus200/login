package com.green.cafegreen;

import com.green.cafegreen.menuadmin.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GreenCafeSer {
    private final GreenCafe mapper;
    int newMenu(PostMenu p){
        return mapper.newMenu(p);
    }
    int outMenu(long num){
        return mapper.outMenu(num);
    }
    int fixMenu(PutMenu p){
        return mapper.fixMenu(p);
    }//int는 영향받은 행!!!
    List<GetAllMenu> seeAllMenu(){
        return mapper.seeAllMenu();
    }
    GetOneMenu seeOneMenu(long num){
        return mapper.seeOneMenu(num);
    }//잡다한 일을 다 한다
}
