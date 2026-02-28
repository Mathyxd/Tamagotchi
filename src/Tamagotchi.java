public abstract class Tamagotchi {

    private String name;
    private int energy;
    private Food feed;
    private Mood mood;

    public Tamagotchi(String name, int energy, Food feed, Mood mood) {
        this.name = name;
        this.energy = energy;
        this.feed = feed;
        this.mood = mood;
    }
    public String getName() {
        return name;
    }
    public int getEnergy() {
        return energy;
    }
    public Food getFood() {
        return feed;
    }
    public Mood getMood() {
        return mood;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void setFood(Food feed) {
        this.feed = feed;
    }
    public void setMood(Mood mood) {

    }

    public abstract int calculateEnergy();
}
