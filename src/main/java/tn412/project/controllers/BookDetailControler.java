package tn412.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import tn412.project.models.Book;
import tn412.project.repositories.BookRepository;

@Controller
@RequestMapping("/")
public class BookDetailControler {

    @Autowired
    private BookRepository bookDetailRepository;

    @GetMapping("bookDetails")
    public String showBookDetails(@PathVariable Long id){
        Book bookdetail =  bookDetailRepository.findById(id).orElseThrow();
        bookDetailRepository.save(bookdetail);
        
        return "redirect:/bookDetails";
    }

}