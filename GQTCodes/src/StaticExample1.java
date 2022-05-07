class Dog{
	String name;
	int cost;
	String color;
	static int no_of_legs;//static variable
	
	//static block
	static {
		no_of_legs=4;
	}
	
}
public class StaticExample1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name="nakv";
		d1.cost=3000;
		d1.color="black";
		
		System.out.println(d1.name);
		System.out.println(d1.cost);
		System.out.println(d1.color);
		System.out.println(d1.no_of_legs);
		System.out.println("------------");
		
		Dog d2 = new Dog();
		d2.name="fvdssd";
		d2.cost=2000;
		d2.color="blue";
		System.out.println(d2.name);
		System.out.println(d2.cost);
		System.out.println(d2.color);
		System.out.println(d2.no_of_legs);
		System.out.println("------------");
		
		
		Dog d3 = new Dog();
		d3.name="qweq";
		d3.cost=3000;
		d3.color="white";
		System.out.println(d3.name);
		System.out.println(d3.cost);
		System.out.println(d3.color);
		System.out.println(d3.no_of_legs);
		System.out.println("------------");
		
		
		Dog d4 = new Dog();
		d4.name="uyoyo";
		d4.cost=3000;
		d4.color="brown";
		System.out.println(d4.name);
		System.out.println(d4.cost);
		System.out.println(d4.color);
		System.out.println(d4.no_of_legs);
		System.out.println("------------");
		
		Dog d5 = new Dog();
		d5.name="asdfg";
		d5.cost=6000;
		d5.color="red";
		d5.no_of_legs=3;
		System.out.println(d5.name);
		System.out.println(d5.cost);
		System.out.println(d5.color);
		System.out.println(d5.no_of_legs);
	}
}
