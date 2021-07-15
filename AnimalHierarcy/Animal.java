package AnimalHierarcy;
abstract public class Animal {
	String food;
	String hunger;
	int boundries;
	String location;
	String image;
	abstract void makeNoise();
	abstract void eat();
	void sleep() {
		System.out.println("Animal can sleep");
	}
	abstract void roam();
}
