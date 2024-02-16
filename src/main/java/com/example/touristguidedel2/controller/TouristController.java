package com.example.touristguidedel2.controller;

import com.example.touristguidedel2.model.TouristAttraction;
import com.example.touristguidedel2.service.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TouristController {
    TouristService service;
    TouristAttraction attraction;

    public TouristController(){
        service = new TouristService();
    }

    @GetMapping(path="/Tivoli")
    public String showAttractions(Model model){
        model.addAttribute("attraction", service.getAll());
        return "Startpage";
    }

//    @PostMapping(path="")
//    public String showAllAttractions(@ModelAttribute TouristAttraction attraction){
//        this.attraction = attraction;
//        return "redirect:/"
//    }
}
