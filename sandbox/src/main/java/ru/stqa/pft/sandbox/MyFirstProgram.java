package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
	Square s = new Square(5.0);
		Circle c = new Circle(10);
		System.out.println("Площадь прямоугольника со стороной " + s.x + " см равна "+ s.area());
System.out.println("Hellow, world!");
		System.out.println("Площадь круга с радиусом " + c.r + " см равна "+ c.area()+ " квадратных сантиметров");
		System.out.println("Длина окружности круга с радиусом " + c.r + " см равна "+ c.dlOkr()+ " сантиметров");

	}
}