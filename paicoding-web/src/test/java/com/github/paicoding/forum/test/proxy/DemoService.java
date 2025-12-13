package com.github.paicoding.forum.test.proxy;

/**
 * @author Vio
 *
 * @date 2025-11-10
 */
public class DemoService {

    public String showHello(String arg) {
        System.out.println("in function!");
        System.out.println("before return:" + arg);
        return "prefix_" + arg;
    }
}
