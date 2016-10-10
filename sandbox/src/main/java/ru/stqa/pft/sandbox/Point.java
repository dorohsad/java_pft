package ru.stqa.pft.sandbox;

/**
 * Created by Doroh on 10.10.2016.
 */
public class Point {
    public double x1,y1,x2,y2;
public Point (double x1, double y1,double x2, double y2){
    this.x1=x1;
    this.x2=x2;
    this.y1=y1;
    this.y2=y2;
}

public double distance () {
    return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
}

}
