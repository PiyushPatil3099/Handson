package AnimalHierarcy;

public class Cat extends feline implements Behaviour{
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println("Cat make meows");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("Cat leaks milk");
	}
	@Override
	public void canPet() {
		// TODO Auto-generated method stub
		System.out.println("Cat is pet animal");
	}

}
