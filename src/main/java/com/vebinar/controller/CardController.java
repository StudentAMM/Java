package com.vebinar.controller;

import com.vebinar.entity.Card;
import com.vebinar.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class CardController {

    @Autowired
    public CardService cardService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/cards")
    public String getAllcards(Model model) {
        model.addAttribute("cards", cardService.findAll());
        return "cardsList";
    }

    @GetMapping("/card/{id}")
    public String findCardById(@PathVariable("id") int id, Model model) {
        model.addAttribute("card", cardService.getById(id));

        return "showCard";
    }

    @GetMapping("/card2/{id}")
    public @ResponseBody
    Card getById2(@PathVariable("id") int id, Model model) {
        model.addAttribute("card", cardService.getById(id));
        return cardService.getById(id);
    }

    @GetMapping("/addcard")
    public String createcardPage() {
        return "createCard";
    }


    @PostMapping("/addcard")
    public String addcard(@ModelAttribute("card") Card card) throws Exception {
        cardService.save(card);
        return "redirect:/cards";
    }

    @PostMapping("/updatecard")
    public String updatecard(@ModelAttribute("card") Card card) {
        cardService.update(card);
        return "redirect:/card/" + card.getId();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("card", cardService.getById(id));
        return "editCard";
    }

    @GetMapping("/delete/{id}")
    public String deletecard(@PathVariable("id") int id) {
        cardService.delete(id);
        return "redirect:/cards";
    }

    @GetMapping("/put/{id}")
    public String putMoney(@PathVariable("id") int id, Model model) {
        model.addAttribute("card", cardService.getById(id));
        return "putMoney";
    }
    @PostMapping("/put")
    public String put(@ModelAttribute("card") Card card) {
        card.setBalance(card.getBalance()+cardService.getById(card.getId()).getBalance());
        cardService.update(card);
        return "redirect:/card/" + card.getId();
    }
    @GetMapping("/out/{id}")
    public String getMoney(@PathVariable("id") int id, Model model) {
        model.addAttribute("card", cardService.getById(id));
        return "getMoney";
    }
    @PostMapping("/out")
    public String out(@ModelAttribute("card") Card card) {
        card.setBalance(cardService.getById(card.getId()).getBalance()-card.getBalance());
        cardService.update(card);
        return "redirect:/card/" + card.getId();
    }
}
