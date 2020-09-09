package com.zhongjis.mokitodemo.service.impl;

import com.zhongjis.mokitodemo.repository.GroceryRepository;
import com.zhongjis.mokitodemo.service.GroceryService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryServiceImpl implements GroceryService {

  @Autowired
  GroceryRepository groceryRepository;

  @Override
  public List<String> getProductList() {
//    return Collections.EMPTY_LIST;
    return groceryRepository.getAllProductsCopy();
  }
}
