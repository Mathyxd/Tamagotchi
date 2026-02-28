public class Bear extends Tamagotchi {

    public Bear(String name, int energy, Food feed, Mood mood){
        super(name, energy, feed, mood);
    }
    public void playHunt() {
        System.out.println(getName()+ "Is hunting the seals");
    }

    @Override
    public int calculateEnergy() {
        return getEnergy() - 5;
    }
}