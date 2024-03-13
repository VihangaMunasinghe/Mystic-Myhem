import java.util.List;

public class Marshland extends HomeGround{
    private static Marshland instance = null;
    private Marshland(){
        super("Marshland", "In Marshland, the defence of marshlanders increases by 2 \n" +
                                            "while the attack of sunchildren decreases by 1.\n" +
                                            "The speed of mystics also decreases by 1.");
    }

    public static Marshland getInstance() {
        if(instance == null){
            instance = new Marshland();
        }
        return instance;
    }

    @Override
    public void updateArmy(List<Character> army) {
        for(Character character : army){
            switch (character.getCategory()) {
                case "Marshlander" :
                    character.changeDefence(2);
                    break;
                case "Sunchildren" :
                    character.changeAttack(-1);
                    break;
                case "Mystics" :
                    character.changeSpeed(-1);
                    break;
            }
        }
    }
}
