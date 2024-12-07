package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class ProductService 
{
    private final RestTemplate restTemplate = new RestTemplate();

    public List<Map<String, Object>> fetchAllProducts() {
        String url = "https://fakestoreapi.com/products";
        Map<String, Object>[] products = restTemplate.getForObject(url, Map[].class);
        return Arrays.asList(products);
    }
}