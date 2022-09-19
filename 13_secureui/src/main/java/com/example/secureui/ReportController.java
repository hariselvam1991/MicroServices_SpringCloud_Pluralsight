package com.example.secureui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Controller
public class ReportController {

    @Autowired
    private WebClient webClient;

    @RequestMapping("/")
    public String loadHome(){
        return "home";
    }

    @RequestMapping("/report")
    public String loadReport(Model m){

        Flux<TollData> response = this.webClient.get()
        .uri("http://localhost:8081/api/tolldata")
        .retrieve()
        .bodyToFlux(TollData.class);

        List<TollData> tolldata = response.collectList().block();

        m.addAttribute("tolldata", tolldata);
        return "report";
    }

    
}
