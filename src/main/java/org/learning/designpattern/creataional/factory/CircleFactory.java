package org.learning.designpattern.creataional.factory;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
