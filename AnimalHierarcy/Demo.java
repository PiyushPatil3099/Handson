package AnimalHierarcy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		l.eat();
		l.makeNoise();
		l.posesHuntingAbility();
		Tiger t=new Tiger();
		t.eat();
		t.makeNoise();
		t.posesHuntingAbility();
		Cat c=new Cat();
		c.eat();
		c.makeNoise();
		c.canPet();
		Hippo h=new Hippo();
		h.eat();
		h.makeNoise();
		h.swimmingAbility();
		Dog d=new Dog();
		d.eat();
		d.makeNoise();
		d.canPet();
		Wolf w=new Wolf();
		w.eat();
		w.makeNoise();
		w.posesHuntingAbility();
	}

}
