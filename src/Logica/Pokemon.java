package Logica;

public abstract class Pokemon {
    int num_pokedex;
    String nombrePokemon;
    double pesoPokemon;
    String sexo;
    int temporadaQueAparece;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void  atacarMordisco();
}
