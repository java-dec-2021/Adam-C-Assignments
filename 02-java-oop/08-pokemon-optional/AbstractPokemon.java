public abstract class AbstractPokemon implements PokemonInterface {
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name, health, type);
        return pokemon;
    }
    public String pokemonInfo(Pokemon pokemon) {
        String pokeInfo = new String(
                "Name: " + pokemon.getName() + "\nHealth: " + pokemon.getHealth() + "\nType: " + pokemon.getType());
        return pokeInfo;
    }
}