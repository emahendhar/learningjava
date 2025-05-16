package org.learning.designpattern.creataional.factory;

public class FactoryClient {

    public static void main(String[] args) {

        ShapeFactory circlef = new CircleFactory();
        Shape sc= circlef.createShape();
        sc.draw();


        ShapeFactory squaref = new SqureFactory();
        Shape sq = squaref.createShape();
        sq.draw();
    }
}
