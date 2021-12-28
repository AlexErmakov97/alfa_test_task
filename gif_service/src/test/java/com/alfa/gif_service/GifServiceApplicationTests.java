package com.alfa.gif_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Pattern;

@SpringBootTest
class GifServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void formatDate() {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        Assertions.assertTrue(today.toString().matches("(20)\\d\\d\\S([1-9]|1[012])\\S([1-9]|[12][0-9]|3[01])"));
        Assertions.assertTrue(yesterday.toString().matches("(20)\\d\\d\\S([1-9]|1[012])\\S([1-9]|[12][0-9]|3[01])"));
    }
}
