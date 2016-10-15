package ru.stqa.pft.sandbox;

/**
 * Created by Doroh on 08.10.2016.
 */
public class Circle {
    double r;
    public Circle(double r){
        this.r=r;
    }

    public double area (){
        return  3.14*this.r*this.r;
    }

    public double dlOkr (){
        return  2*3.14*this.r;
    }
}
