package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y estoy atacando con arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y estoy atacando con mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y estoy atacando con hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y estoy atacando con latigo cepa");
    }

    public Bulbasaur() {
    }
}
