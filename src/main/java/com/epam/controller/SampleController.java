package com.epam.controller;

import com.epam.dto.OrderDto;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class SampleController {
    @PostMapping("/addToCart")
    public String addToBasket(@RequestBody OrderDto basketDTO) {
        //TODO здесь будет метод, который отдает корзину после добавления в нее товара
        return "added";
    }

    @GetMapping("/findBuyer")
    public String getBuyerById(@RequestParam(value = "id") UUID id) {
        //TODO здесь мы должныы опиать логику поиска покупателя по его уникального идентифкатору в БД
        return "I'm ok";
    }
}
