package com.smile.azxx.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by Smile on 2018/6/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DbControllerTest {

    @Autowired
    private MockMvc mvc;


    @Test
    public void getDbType() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/mydb/getUsers"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void getUser() throws Exception {

    }

}