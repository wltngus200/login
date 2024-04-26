package com.green.cafegreen;

import com.green.cafegreen.menuadmin.GetAllMenu;
import com.green.cafegreen.menuadmin.GetOneMenu;
import com.green.cafegreen.menuadmin.PutMenu;
import com.green.cafegreen.menuadmin.PostMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface GreenCafe {
    int newMenu(PostMenu p);
    int outMenu(long num);
    int fixMenu(PutMenu p);
    List<GetAllMenu> seeAllMenu();
    GetOneMenu seeOneMenu(long num);
}
