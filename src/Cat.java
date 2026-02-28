public class Cat extends Tamagotchi {

    public Cat(String name, int energy, Food feed, Mood mood){
        super(name, energy, feed, mood);
    }
    public void playString() {
        System.out.println(getName() + "Is playing with the string");
    }
    @Override
    public int calculateEnergy() {
        return getEnergy() - 5;
    }
}