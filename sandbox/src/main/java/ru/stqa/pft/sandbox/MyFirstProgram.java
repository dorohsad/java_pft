package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
	Square s = new Square(5.0);
		System.out.println("Площадь прямоугольника со стороной " + s.x + " см равна "+ s.area());
System.out.println("Hellow, world!");
	}
}