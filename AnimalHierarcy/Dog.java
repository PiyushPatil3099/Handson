package AnimalHierarcy;

public class Dog extends Canine implements Behaviour{
	
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println("Dog makes bark noise");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("Dog eat meat as well as milk");
	}
	@Override
	public void canPet() {
		// TODO Auto-generated method stub
		System.out.println("Dog is pet animal");
		
	}
}
