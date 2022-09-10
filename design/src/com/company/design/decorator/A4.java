package com.company.design.decorator;

public class A4 extends AudiDecorator{
    public A4(ICar audi, String modelName, int modelPrice) {
        super(audi, modelName, 2000);
    }
}
