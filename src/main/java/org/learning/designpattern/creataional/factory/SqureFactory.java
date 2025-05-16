package org.learning.designpattern.creataional.factory;

public class SqureFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Squre();
    }
}
