package com.example.Thymeleaf.controller;

import com.example.Thymeleaf.domain.Product;
import com.example.Thymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    //@RequestMapping("/product")
    public String getProduct(){
        return "redirect:/index";
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable String id, Model model){

        model.addAttribute("product", productService.getProduct(id));

        return "product";
    }
}
