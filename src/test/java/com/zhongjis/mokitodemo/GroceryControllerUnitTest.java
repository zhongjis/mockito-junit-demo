package com.zhongjis.mokitodemo;

import static org.junit.Assert.assertEquals;

import com.zhongjis.mokitodemo.restcontroller.DemoRestController;
import com.zhongjis.mokitodemo.service.GroceryService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class GroceryControllerUnitTest {

  @InjectMocks
  DemoRestController demoRestController;

  @Mock
  GroceryService groceryService;

  @Test
  public void testGetAllProductsApi() {

    ResponseEntity<List<String>> response = demoRestController.getGreeting();


//    Mockito.when(groceryService.getProductList()).thenReturn(new ArrayList<>());

    assertEquals(HttpStatus.OK.value(), response.getStatusCodeValue());

  }

}
