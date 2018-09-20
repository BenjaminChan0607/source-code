package com.cs.stru.test;

/**
 * @author benjaminChan
 * @date 2018/9/14 0014 下午 3:41
 */
public class TestA {
    private TestB testB;

    public TestA(TestB testB) {
        this.testB = testB;
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }
}
