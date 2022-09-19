package com.techbruiser.resourceserver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollController {

    private List<TollData> tolldata;

    public TollController() {
        tolldata = new ArrayList<>();
        tolldata.add(new TollData("100", "1AFGB400", "2022-06-02T11:45:06"));
        tolldata.add(new TollData("100", "1AFGB400", "2022-06-02T11:45:06"));
        tolldata.add(new TollData("100", "1AFGB400", "2022-06-02T11:45:06"));
    }

    @RequestMapping("/api/tolldata")
    public List<TollData> getData(){
        return tolldata;
    }   


    
    
}
