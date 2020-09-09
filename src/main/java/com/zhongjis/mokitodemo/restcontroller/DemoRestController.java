package com.zhongjis.mokitodemo.restcontroller;

import com.zhongjis.mokitodemo.service.GroceryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

  @Autowired
  GroceryService groceryService;

//  @RequestMapping("/api/v1/product")
  public ResponseEntity<List<String>> getGreeting() {
    return new ResponseEntity<>(groceryService.getProductList(), HttpStatus.OK);
  }

}
