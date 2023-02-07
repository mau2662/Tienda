package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public String inicio(Model model) {
        //var cliente = new Cliente();

        model.addAttribute("nombre", "Bryan");
//        model.addAttribute("apellido", "Villalobos");
//        model.addAttribute("edad", "20");

        return "index";
    }

}
