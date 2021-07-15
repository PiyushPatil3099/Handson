package AnimalHierarcy;

public class Hippo extends Animal implements Swimming{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hippo can eat fruits and dead animals ");
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println("Hippo makes growl sound");
	}
	@Override
	public void swimmingAbility() {
		// TODO Auto-generated method stub
		System.out.println("Hippo poses swimming ability");
		
	}

}
