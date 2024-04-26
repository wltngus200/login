package com.green.cafegreen;

import com.green.cafegreen.menuadmin.GetAllMenu;
import com.green.cafegreen.menuadmin.GetOneMenu;
import com.green.cafegreen.menuadmin.PutMenu;
import com.green.cafegreen.menuadmin.PostMenu;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("cafeGreen")
public class GreenCafeCon {
    private final GreenCafeSer service;

    @PostMapping
    int newMenu(@RequestBody PostMenu p){
        System.out.println(p);
        return service.newMenu(p);
    }
    @DeleteMapping
    int outMenu(@RequestParam long num){
        return service.outMenu(num);
    }

    @PutMapping
    int fixMenu(@RequestBody PutMenu p){
        return service.fixMenu(p);
    }

    @GetMapping
    List<GetAllMenu> seeAllMenu(){
        return service.seeAllMenu();
    }
    @GetMapping("/{num}")
    GetOneMenu seeOneMenu(@PathVariable long num){
        return service.seeOneMenu(num);
    }

}
