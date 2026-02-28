public class Dog extends Tamagotchi {

    public Dog(String name, int energy, Food feed, Mood mood){
        super(name, energy, feed, mood);
    }
    public void playFetch(){
        System.out.println(getName() + " Is fetching the ball");
    }
    @Override
    public int calculateEnergy() {
        return getEnergy() - 5;
    }
}
