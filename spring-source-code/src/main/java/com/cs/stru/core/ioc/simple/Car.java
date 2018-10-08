package com.cs.stru.core.ioc.simple;

import lombok.Data;

/**
 * @author benjaminChan
 * @date 2018/10/8 0008 下午 2:30
 */
@Data
public class Car {
    private String name;
    private String length;
    private String width;
    private String height;
    private Wheel wheel;
}
