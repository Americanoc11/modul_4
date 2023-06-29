package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.model.Loan;
import com.example.book.service.IBookService;
import com.example.book.service.ILoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("books")
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private ILoanService iLoanService;

    @GetMapping("")
    public String showListBook(Model model) {
        List<Book> bookList = iBookService.findAll();
        model.addAttribute("bookList", bookList);
        return "/list";
    }

    @GetMapping("/loan-manager")
    public String showListLoan(Model model) {
        List<Loan> loanList = iLoanService.findAll();
        model.addAttribute("loanList", loanList);
        return "/borrow";
    }

    @GetMapping("/create")
    public String showNewForm(Model model) {
        model.addAttribute("book", new Book());
        return "/create";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute("book") Book book, Model model) {
        iBookService.create(book);
        model.addAttribute("msg", "Add success");
        return "redirect:/books";
    }

    @GetMapping("/update/{id}")
    public String showEditForm(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes, Model model) {
        boolean check = iBookService.existsById(id);
        if (check) {
            model.addAttribute("book", iBookService.findById(id));
            return "/edit";
        } else {
            redirectAttributes.addFlashAttribute("msg", "Invalid Id");
            return "redirect:/books";
        }
    }

    @PostMapping("/update")
    public String updateBook(@ModelAttribute("book") Book book, RedirectAttributes redirectAttributes) {
        boolean check = iBookService.existsById(book.getId());
        if (check) {
            iBookService.update(book);
        } else {
            redirectAttributes.addFlashAttribute("msg", "Invalid Id");
        }
        return "redirect:/books";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
        boolean check = iBookService.existsById(id);
        if (check) {
            model.addAttribute("book", iBookService.findById(id));
            return "details";
        } else {
            redirectAttributes.addFlashAttribute("msg", "Invalid Id");
            return "redirect:/books";
        }
    }

    @GetMapping("/borrow/{id}")
    public String borrowBook(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) throws Exception {
        Book book = iBookService.findById(id);
        if (book.getQuantity() == 0) {
            throw new Exception();
        } else {
            Loan loan = new Loan();
            loan.setBook(book);
            iLoanService.create(loan);
            iBookService.borrow(id);
        }
        return "redirect:/books";
    }

    @GetMapping("/pay-return/{id}")
    public String payReturn(@PathVariable("id") Integer id, Model model) {
        Loan loan = iLoanService.findById(id);
        boolean check = iLoanService.existsById(id);
        if (check) {
            Book book = iBookService.findById(loan.getBook().getId());
            book.setQuantity(book.getQuantity() + 1);
            iBookService.create(book);
            iLoanService.delete(id);
        }
        return "redirect:/books";
    }

    @PostMapping("/form-return-book")
    public String formReturnBook(@RequestParam("code") Integer code, RedirectAttributes redirectAttributes) throws Exception {
        List<Loan> loanList = iLoanService.findAll();
        boolean check = false;
        for (Loan l : loanList) {
            if (l.getCode() ==(int) code) {
                check = true;
                break;
            }
        }
        if (check) {
            Loan loan = iLoanService.findByCode(code);
            Book book = iBookService.findById(loan.getBook().getId());
            book.setQuantity(book.getQuantity() + 1);
            iBookService.create(book);
            iLoanService.delete(loan.getId());
        } else {
            redirectAttributes.addFlashAttribute("msg", "Invalid code: " + code);
        }
        return "redirect:/books";
    }
}
