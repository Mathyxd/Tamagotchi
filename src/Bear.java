public class Bear extends Tamagotchi {

    public Bear(String name, int energy, Food feed, Mood mood){
        super(name, energy, feed, mood);
    }

    @Override
    public int calculateEnergy() {
        return getEnergy() - 30;
    }
    public void play() {
        setEnergy(getEnergy() - 50);
        System.out.println(getName()+ "Is rolling around on the stomach. Energy left: " + getEnergy());
    }
    public void feed(Food food) {
        if (food == Food.SEAL) {
            setEnergy(getEnergy() + 20);
            setMood(Mood.HAPPY);
            System.out.println(getName() + "Loves the seal!! Energy: " + getEnergy());
        } else if (food == Food.MEAT) {
            setEnergy(getEnergy() + 10);
            setMood(Mood.HAPPY);
            System.out.println(getName() + "Enjoys the Milk!! Energy: " + getEnergy());
        } else if (food == Food.FISH) {
            setEnergy(getEnergy() + 15);
            setMood(Mood.HAPPY);
            System.out.println(getName() + "Enjoys the fish!! Energy: " + getEnergy());
        } else {
            setEnergy(getEnergy() - 10);
            setMood(Mood.TIRED);
            System.out.println(getName() + "Doesnt like that very much" + getEnergy());
        }

    }
    }
