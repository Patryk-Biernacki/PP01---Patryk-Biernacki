import java.util.Random;

class Point {

    public float x;
    public float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
        System.out.println("Point [" + x + ", " + y + "] has been created.");
    }

    public void movePoint(float xAxisShift, float yAxisShift) {
        this.x += xAxisShift;
        this.y += yAxisShift;
    }
}

class Square {
	
	public Point punkt1;
	public Point punkt2;
	public Point punkt3;
	public Point punkt4;
	
	public Square(Point punkt, int dlugosc)
	{
		this.punkt1 = punkt;
		this.punkt2 = new Point (punkt.x+dlugosc, punkt.y+dlugosc);
		this.punkt3 = new Point (punkt.x+dlugosc, punkt.y);
		this.punkt4 = new Point (punkt.x, punkt.y+dlugosc);
	}
	
	public void wyswietl()
	{
		System.out.println("["+punkt1.x+"; "+punkt1.y+"]"+"\n"+"["+punkt2.x+"; "+punkt2.y+"]"+"\n"+"["+punkt3.x+"; "+punkt3.y+"]"+"\n"+"["+punkt4.x+"; "+punkt4.y+"]");
	}
}

public class Main {

    public static void main(String[] args) {
	
		float x=5;
		float y=5;
	 
        Point punkt1 = new Point(x, y);
		Point punkt2 = new Point(3.0, 4.0);
		Point punkt3 = new Point(2.0, 6.0);
		
		Square kwadrat1 = new Square(punkt1, 4);
		Square kwadrat2 = new Square(punkt2, 6);
		Square kwadrat3 = new Square(punkt3, 8);
		
		kwadrat1.wyswietl();
		kwadrat2.wyswietl();
		kwadrat3.wyswietl();
	   
    }
	
	public static float getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }


}