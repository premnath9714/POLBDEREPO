package Training;

public class TopicConstructorOverloading {
	
	public TopicConstructorOverloading() {
		System.out.println("This is Method One");
	}

	public TopicConstructorOverloading(int a) {
		System.out.println("This is Method Two");
	}
	
	public TopicConstructorOverloading(int a,int b) {
		System.out.println("This is Method Three");
	}
	
	
	public TopicConstructorOverloading(String a) {
		System.out.println("This is Method Four");
	}
	public static void main(String[] args) {
		
		new TopicConstructorOverloading();
		new TopicConstructorOverloading(10);
		new TopicConstructorOverloading(10,20);
		new TopicConstructorOverloading("USA");

	}

}
