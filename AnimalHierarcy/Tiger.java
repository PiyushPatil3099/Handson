package AnimalHierarcy;

public class Tiger extends feline implements Hunt {
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println("Tiger makes snarl noise");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("Tiger eats meat");
	}
	@Override
	public void posesHuntingAbility() {
		// TODO Auto-generated method stub
		System.out.println("Tiger poses Hunting Ability");
	}

}
