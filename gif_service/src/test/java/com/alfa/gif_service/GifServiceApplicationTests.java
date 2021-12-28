package com.alfa.gif_service;

import com.alfa.gif_service.service.MainService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static ch.qos.logback.core.encoder.ByteArrayUtil.hexStringToByteArray;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GifServiceApplicationTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    MainService mainService;

    @Test
    void mainControllerTest() throws Exception {
        byte[] testByteArray = hexStringToByteArray("");

        mvc.perform(get("/info/AED")
                .accept(MediaType.IMAGE_GIF_VALUE))
                .andExpect(status().is(404))
                .andExpect(content().bytes(testByteArray));
    }

    @Test
    void formatDateTest() {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        Assertions.assertTrue(today.toString().matches("(20)\\d\\d\\S([1-9]|1[012])\\S([1-9]|[12][0-9]|3[01])"));
        Assertions.assertTrue(yesterday.toString().matches("(20)\\d\\d\\S([1-9]|1[012])\\S([1-9]|[12][0-9]|3[01])"));
    }
}
