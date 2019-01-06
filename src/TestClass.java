
public class TestClass {

	public static void main(String[] args) {
		WithoutThread wt = new WithoutThread();
		WithThread t = new WithThread();
		System.out.println("Processing without threading");
		wt.count();
		System.out.println("\n\nProcessing with threading");
		t.count();
	}
}
