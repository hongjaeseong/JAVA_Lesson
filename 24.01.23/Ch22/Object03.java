package Ch22;

public class Object03 {
	public static void main(String[] args) {
		// Object에서의 hashCode()와 System.identityHashCode();
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		
		// 문자열에서의 hashCode()와 System.identityHashCode();
		String name = "Java";
		String name1 = "Java";
		
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		
		
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name1));
		
		
	}

}
