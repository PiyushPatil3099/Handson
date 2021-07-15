package AnimalHierarcy;

public class Wolf extends Canine implements Hunt{
	
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		
		System.out.println("Wolf makes growl-bark noise");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		;
		System.out.println("Wolf eats meat");
	}
	@Override
	public void posesHuntingAbility() {
		// TODO Auto-generated method stub
		System.out.println("Wolf poses Hunting Ability");
	}
}
