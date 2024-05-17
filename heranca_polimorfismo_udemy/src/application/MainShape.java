package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.ShapeCircle;
import entities.ShapeRectangle;
import entities.enums.ColorShape;

public class MainShape {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			ColorShape color = ColorShape.valueOf(sc.next());
			if (answer == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapeList.add(new ShapeRectangle(color, width, height));
			} else{
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapeList.add(new ShapeCircle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape s: shapeList) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc.close();
	}

}
