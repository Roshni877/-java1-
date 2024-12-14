package pkg2;
interface Resizable{
	void resizeWidth(int width);
	void resizeHeight(int height);
}
class Rectangle implements Resizable{
	private int width;
	private int height;
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public void resizeWidth(int width) {
		this.width=width;
	}
	public void resizeHeight(int height) {
		this.height=height;
	}
	public void display() {
		System.out.println(width + "," + height);
	}
}
public class ResizableInterface{

	public static void main(String[] args) {
		System.out.println("Resizable");
		Rectangle r1=new Rectangle(5,10);
		r1.display();
		r1.resizeWidth(8);
		r1.resizeHeight(12);
		r1.display();

	}

}