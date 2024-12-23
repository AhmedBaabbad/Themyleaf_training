package com.example.Thymeleaf.controller;

import com.example.Thymeleaf.domain.Product;
import com.example.Thymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"/", "index"})
    public String getIndex(Model model){

        List<Product> products = productService.listProducts();
        model.addAttribute("products", products); // Add products to the model
        return "index";
    }
    @RequestMapping("/dashboard")
    public String secured(){
        return "dashboard";
    }

}
