package com.test.webdriver;

public class FirefoxDriver implements Webdriver{
    @Override
    public void get() {
        System.out.println("I'm getting FirefoxDriver");
    }

    @Override
    public void findElementBy() {
        System.out.println("I'm finding element by FirefoxDriver's element");
    }
}
