package com.zhongjis.mokitodemo.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GroceryRepository  {

  public List<String> getAllProducts() {
    List<String> products = new ArrayList<>();
    products.add("Apple");
    products.add("Orange");

    return products;
  }

  public List<String> getAllProductsCopy() {
    List<String> products = new ArrayList<>();
    products.add("Apple");
    products.add("Orange");

    return products;
  }
}
