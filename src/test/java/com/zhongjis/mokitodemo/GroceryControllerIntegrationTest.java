package com.zhongjis.mokitodemo;

import com.zhongjis.mokitodemo.service.impl.GroceryServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.Assert.assertEquals;

@WebMvcTest
public class GroceryControllerIntegrationTest {


  @Autowired
  MockMvc mockMvc;

  @MockBean
  GroceryServiceImpl groceryService;

  @Test
  public void testGetAllProducts() throws Exception {
    MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/product")).andReturn();

    assertEquals(HttpStatus.OK.value(), mvcResult.getResponse().getStatus());

  }
}
