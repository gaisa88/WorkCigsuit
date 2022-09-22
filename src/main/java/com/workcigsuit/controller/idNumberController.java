package com.workcigsuit.controller;

import com.workcigsuit.service.IdnumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class idNumberController {

        private final IdnumberService idnumberService;

        public idNumberController(IdnumberService idnumberService) {
            this.idnumberService = idnumberService;
        }

        @GetMapping("/")
        public String viewHomePage(Model model) {
            model.addAttribute("Idnumberlist", idnumberService.findAll());
            return "index";
        }

        @GetMapping("/search")
        public String indexWithQuery(@RequestParam("Number") String Number, Model model) {
            model.addAttribute("Idnumberlist", idnumberService.findAllByName(Number));
            return "index";
        }

    }

