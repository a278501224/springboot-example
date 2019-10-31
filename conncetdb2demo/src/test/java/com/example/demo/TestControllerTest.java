package com.example.demo;

import com.example.demo.controller.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Description:
 * Auther:cherry
 * CreateTime:2019-10-30 10:36
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
    private MockMvc mvc;

    @Before
    public void  setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
    }

    @Test
    public void  getTest() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/test").accept(MediaType.APPLICATION_JSON));
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalsTo("test")));

    }

}
