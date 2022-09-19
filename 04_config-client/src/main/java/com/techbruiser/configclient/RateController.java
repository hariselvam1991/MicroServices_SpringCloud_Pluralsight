package com.techbruiser.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class RateController {
    
    @Value("${rate}")
    private String rate;

    @Value("${lanecount}")
    private String lanecount;

    @Value("${tollstart}")
    private String tollstart;

    @Value("${connstring}")
    private String connstring;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateamount", rate);
        m.addAttribute("lanes", lanecount);
        m.addAttribute("tollstart", tollstart);
        m.addAttribute("connstring", connstring);
        return "rateview";
    }




}
