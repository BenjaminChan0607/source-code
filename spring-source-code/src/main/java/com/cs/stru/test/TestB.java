package com.cs.stru.test;

/**
 * @author benjaminChan
 * @date 2018/9/14 0014 下午 3:41
 */
public class TestB {
    private TestC testC;

    public TestB(TestC testC) {
        this.testC = testC;
    }

    public TestC getTestC() {
        return testC;
    }

    public void setTestC(TestC testC) {
        this.testC = testC;
    }
}
