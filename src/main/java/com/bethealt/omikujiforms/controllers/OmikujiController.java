package com.bethealt.omikujiforms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;

@Controller

public class OmikujiController {

    @GetMapping("/")
    public String index() {
        return "redirect:/omikuji";
    }

    @GetMapping("/omikuji")
    public String omikuji() {
        return "form.jsp";
    }

    @PostMapping("omikuji/send")
    public String omikuji(
        @RequestParam(value="random") int random,
        @RequestParam(value="city") String city,
        @RequestParam(value="name") String name,
        @RequestParam(value="hobby") String hobby,
        @RequestParam(value="living") String living,
        @RequestParam(value="nice") String nice,
        HttpSession session, Model model) {
            //saves data to session
            session.setAttribute("random", random);
            session.setAttribute("city", city);
            session.setAttribute("name", name);
            session.setAttribute("hobby", hobby);
            session.setAttribute("living", living);
            session.setAttribute("nice", nice);

            return "redirect:/omikuji/show";
        }

    @GetMapping("omikuji/show")
    public String show(HttpSession session, Model model) {
        //retrieves data from session
        int random = (int) session.getAttribute("random");
        String city = (String) session.getAttribute("city");
        String name = (String) session.getAttribute("name");
        String hobby = (String) session.getAttribute("hobby");
        String living = (String) session.getAttribute("living");
        String nice = (String) session.getAttribute("nice");

        //sends data to the jsp
        model.addAttribute("random", random);
        model.addAttribute("city", city);
        model.addAttribute("name", name);
        model.addAttribute("hobby", hobby);
        model.addAttribute("living", living);
        model.addAttribute("nice", nice);
        
        return "display.jsp";
    }
    
}



