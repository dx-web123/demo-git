package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testGitHub() {
        System.out.println("测试远程提交代码到github");
        System.out.println("测试第二次提交");
    }

    @Test
    void testHotFix() {
        System.out.println("这是hot-fix分支");
    }
}
