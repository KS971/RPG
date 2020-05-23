package Monster;

public class SpawnMonster {
    public static Monster spawn(String name) {
        switch (name) {
            case "Rabbit":
                return new Rabbit();
            case "Pig":
                return new Pig();
        }
        return null;
    }
}
