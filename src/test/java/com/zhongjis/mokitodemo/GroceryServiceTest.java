package com.zhongjis.mokitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.zhongjis.mokitodemo.repository.GroceryRepository;
import com.zhongjis.mokitodemo.service.GroceryService;
import com.zhongjis.mokitodemo.service.impl.GroceryServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GroceryServiceTest {

  @InjectMocks
  GroceryServiceImpl groceryService;

  @Mock
  GroceryRepository groceryRepository;

  @Test
  public void testGetAllProducts() {

    List<String> products = new ArrayList<>();
    products.add("apple");
    products.add("orange");
    products.add("banana");
    products.add("something");

    Mockito.when(groceryRepository.getAllProductsCopy()).thenReturn(products);

    List<String> testProducts = groceryService.getProductList();
    assertEquals(4, testProducts.size());

  }
}
