package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
		Square s = new Square(5.0);
		Circle c = new Circle(10);
		System.out.println("Площадь прямоугольника со стороной " + s.x + " см равна "+ s.area());
System.out.println("Hellow, world!");
		System.out.println("Площадь круга с радиусом " + c.r + " см равна "+ c.area()+ " квадратных сантиметров");
		System.out.println("Длина окружности круга с радиусом " + c.r + " см равна "+ c.dlOkr()+ " сантиметров");

		Point p = new Point(3,6,6,10);
		System.out.println("Расстояние между двумя точками с координатами х1="+p.x1+" y1="+p.y1+" и x2="+p.x2+" y2="+p.y2+" равно "+p.distance());

		Rectangle r = new Rectangle(10,20);
		System.out.println("Площадь прямоугольника со сторонами "+r.a+" см и "+r.b+" см равна "+ r.area()+" см");




	}
}