public class Main {
	public static void main(String[] args) {

		System.out.println(Tester.test(SomeClass.class, OtherClass.class));
        // Output
        //		SomeClass: true
        //		OtherClass: true
        //		true // - printed by main function
	}	
}
