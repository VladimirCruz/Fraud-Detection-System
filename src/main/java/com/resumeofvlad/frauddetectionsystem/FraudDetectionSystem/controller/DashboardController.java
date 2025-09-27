package com.resumeofvlad.frauddetectionsystem.FraudDetectionSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class DashboardController {
    @GetMapping("/")
    public String showDashboard(Model model) {
        model.addAttribute("username", "Vladi");
        return "dashboard";
    }

//    String getAlert() {
//        //return alert; //returns level of danger of transaction (Mild, Sus, Crit.)
//    }
//    String getData() {
//        //return
//    }

}
