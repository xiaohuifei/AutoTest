package com.course.testng.multThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id 1: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread Id 2: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread Id 3: %s%n",Thread.currentThread().getId());
    }
}
