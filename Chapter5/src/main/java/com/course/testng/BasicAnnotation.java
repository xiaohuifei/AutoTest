package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass在测试类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass在测试类之后运行的");
    }

    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuite测试套件");
    }

    @AfterSuite
    public  void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
