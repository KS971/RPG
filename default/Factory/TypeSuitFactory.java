package Factory;

public class TypeSuitFactory extends Factory{

    @Override
    public Suit createSuit(String type){
        Suit suit = null;

        switch(type){
            case("space"):
                suit = new SpaceSuit();
                break;
            case("hydro"):
                suit = new HydroSuit();
                break;
            case("steal"):
                suit = new StealSuit();
                break;
            default:
                suit = new CombatSuit();
        }
        return suit;
    }
}
