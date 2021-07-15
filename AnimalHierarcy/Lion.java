package AnimalHierarcy;

public class Lion extends feline implements Hunt{
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println("Lion makes roars noise");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("Lion eats meat");
	}
	@Override
	public void posesHuntingAbility() {
		// TODO Auto-generated method stub
		System.out.println("Lion poses Hunting Ability");
	}

}
