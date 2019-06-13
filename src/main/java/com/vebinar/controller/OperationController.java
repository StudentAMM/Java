package com.vebinar.controller;

import com.vebinar.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OperationController {

    @Autowired
    public OperationService operationService;

    @GetMapping("/card/history/{id}")
    public String history(@PathVariable("id") int id, Model model) {
        model.addAttribute("operations", operationService.findAll(id));
        return "operations";
    }
}