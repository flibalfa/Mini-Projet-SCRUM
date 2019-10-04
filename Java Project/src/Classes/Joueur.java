package Classes;

import Enums.RabbitColor;

public class Joueur {

    private final RabbitColor color;

    public Joueur(RabbitColor color) 
    {
        this.color = color;
    }

    public RabbitColor getColor() {
        return color;
    }
}
