package com.audreysperry.asperryportfolio.controllers;

import com.audreysperry.asperryportfolio.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {

    @Autowired
    private ProjectRepository projectRepo;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("myProjects", projectRepo.findAll());
        return "index";
    }


}
