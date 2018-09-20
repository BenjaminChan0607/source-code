package com.cs.stru.test;

/**
 * @author benjaminChan
 * @date 2018/9/14 0014 下午 3:41
 */
public class TestC {
    private TestA testA;

    public TestC(TestA testA) {
        this.testA = testA;
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }
}
