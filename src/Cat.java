public class Cat extends Tamagotchi {

    public Cat(String name, int energy, Food feed, Mood mood){
        super(name, energy, feed, mood);
    }

    @Override
    public int calculateEnergy() {
        return getEnergy() - 5;
    }
    public void play() {
        System.out.println(getName() + "Is playing with the string");
    }
    public void feed(Food food) {
        if (food == Food.FISH) {
            setEnergy(getEnergy() + 20);
            setMood(Mood.HAPPY);
            System.out.println(getName() + "Loves the fish!! Energy: " + getEnergy());
        } else if (food == Food.MILK) {
            setEnergy(getEnergy() + 10);
            setMood(Mood.HAPPY);
            System.out.println(getName() + "Enjoys the Milk!! Energy: " + getEnergy());
        }else {
            setEnergy(getEnergy() - 10);
            setMood(Mood.TIRED);
            System.out.println(getName() + "Doesnt like that very much" + getEnergy());
        }
        }
    }