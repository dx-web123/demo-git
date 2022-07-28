package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("测试pull");
        System.out.println("测试pull");
    }

    @Test
    void testGitHub() {
        System.out.println("测试ssh");
    }

    @Test
    void testHotFix() {
        System.out.println("这是hot-fix分支");
    }
}
