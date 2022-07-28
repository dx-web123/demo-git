package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testGit() {
        System.out.println("这是master分支的第三次提交");
    }

    @Test
    void testHotFix() {
        System.out.println("这是hot-fix分支");
    }
}
