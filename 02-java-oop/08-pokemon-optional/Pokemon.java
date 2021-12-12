public class Pokemon {
    // MEMBER VARIABLES
    private String name;
    private int health;
    private String type;
    private static int count;

    // GETTERS/SETTERS
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setType(String type) {
        this.type = type;
    }

    // CONSTRUCTOR
    public Pokemon(String name,int health,String type) {
        this.name=name;
        this.health=health;
        this.type=type;
        count++;
    }

    // METHODS
    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth()-10);
    }
}