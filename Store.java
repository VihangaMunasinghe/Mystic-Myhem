import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Store {
    private static Store instance; //instance variable
    public static Store getInstance(){
        //checking is the instance is null abd creating if needed
        if(instance == null){
            instance = new Store();
        }
        return instance;
    }//



    List<Character> archers = new ArrayList<>();
    List<Character> knights = new ArrayList<>();
    List<Character> mages = new ArrayList<>();
    List<Character> healers = new ArrayList<>();
    List<Character> mythicalCreatures = new ArrayList<>();

    List<Equipment> armour = new ArrayList<>();
    List<Equipment> artefacts = new ArrayList<>();

    //constructor to set the valuess
    public Store(){
        setArchers();
        setArmour();
        setHealers();
        setArtefacts();
        setKnights();
        setMages();
        setMythicalCreatures();

    }

    public void setArchers() {
        Character shooter = new Character("Shooter","Archer",null,80,11,4,6,9,null,null);
        Character ranger = new Character("Ranger","Archer",null,115,14,5,8,10,null,null);
        Character sunfire = new Character("Sunfire","Archer",null,160,15,5,7,14,null,null);
        Character zing = new Character("Zing","Archer",null,200,16,9,11,14,null,null);
        Character saggitarius = new Character("Saggitarius","Archer",null,230,18,7,12,17,null,null);
        archers.add(shooter);
        archers.add(ranger);
        archers.add(sunfire);
        archers.add(zing);
        archers.add(saggitarius);
    }
    public void setKnights(){
        Character squire = new Character("Squire","Knight",null,85,8,9,7,8,null,null);
        Character cavalier = new Character("Cavalier","Knight",null,110,10,12,7,10,null,null);
        Character templar = new Character("Templar","Knight",null,155,14,16,12,12,null,null);
        Character zoro = new Character("Zoro","Knight",null,180,17,16,13,14,null,null);
        Character swiftblade = new Character("Swiftblade","Knight",null,250,18,20,17,13,null,null);
        knights.add(squire);
        knights.add(cavalier);
        knights.add(templar);
        knights.add(zoro);
        knights.add(swiftblade);
    }

    public void setMages(){
        Character warlock = new Character("Warlock","Mage",null,100,12,7,10,12,null,null);
        Character illusionist = new Character("Illusionist","Mage",null,120,13,8,12,14,null,null);
        Character enchanter = new Character("Enchanter","Mage",null,160,16,10,13,16,null,null);
        Character conjurer = new Character("Conjurer","Mage",null,195,18,15,14,12,null,null);
        Character elderitch = new Character("Elderitch","Mage",null,270,19,17,18,14,null,null);
        mages.add(warlock);
        mages.add(illusionist);
        mages.add(enchanter);
        mages.add(conjurer);
        mages.add(elderitch);
    }

    public void setHealers(){
        Character soother = new Character("Soother","Healer",null,95,10,8,9,6,null,null);
        Character medic = new Character("Medic","Healer",null,125,12,9,10,7,null,null);
        Character alchemist = new Character("Alchemist","Healer",null,150,13,13,13,13,null,null);
        Character saint = new Character("Saint","Healer",null,200,16,14,17,9,null,null);
        Character lightbringer = new Character("Lightbringer","Healer",null,260,17,15,19,12,null,null);
        healers.add(soother);
        healers.add(medic);
        healers.add(alchemist);
        healers.add(saint);
        healers.add(lightbringer);
    }

    public void setMythicalCreatures(){
        Character dragon = new Character("Dragon","Mythical Creature",null,120,12,14,15,8,null,null);
        Character basilisk = new Character("Basilisk","Mythical Creature",null,165,15,11,10,12,null,null);
        Character hydra = new Character("Hydra","Mythical Creature",null,205,12,16,15,11,null,null);
        Character phoenix = new Character("Phoenix","Mythical Creature",null,275,17,13,17,19,null,null);
        Character pegasus = new Character("Pegasus","Mythical Creature",null,340,14,18,20,20,null,null);
        mythicalCreatures.add(dragon);
        mythicalCreatures.add(basilisk);
        mythicalCreatures.add(hydra);
        mythicalCreatures.add(phoenix);
        mythicalCreatures.add(pegasus);
    }

    public void setArmour(){
        Equipment chainmail = new Equipment("Chainmail","Armour", 70,0,1,0,-1);
        Equipment regalia = new Equipment("Regalia","Armour" ,105,0,1,0,0);
        Equipment fleece = new Equipment("Fleece","Armour" ,150,0,2,1,-1);
        armour.add(chainmail);
        armour.add(regalia);
        armour.add(fleece);
    }

    public void setArtefacts(){
        Equipment excalibur = new Equipment("Excalibur","Artefact" ,150,2,0,0,0);
        Equipment amulet = new Equipment("Amulet","Artefact" ,200,1,-1,1,1);
        Equipment crystal = new Equipment("Crystal","Artefact" ,210,2,1,-1,-1);
        artefacts.add(excalibur);
        artefacts.add(amulet);
        artefacts.add(crystal);
    }

    public Character showArchers() {
        System.out.println("Select an Archer");
        for(int i = 0; i < archers.size(); i++){
            System.out.println(i+1);
            archers.get(i).showDetails();
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        
        return archers.get(Integer.parseInt(userInput)-1);
    }

    public Character showKnights() {
        System.out.println("Select a Knight");
        for(int i = 0; i < knights.size(); i++){
            System.out.println(i+1);
            knights.get(i).showDetails();
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        
        return knights.get(Integer.parseInt(userInput)-1);
    }

    public Character showMages() {
        System.out.println("Select a Mage");
        for(int i = 0; i < mages.size(); i++){
            System.out.println(i+1);
            mages.get(i).showDetails();
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        
        return mages.get(Integer.parseInt(userInput)-1);
    }

    public Character showHealers() {
        System.out.println("Select a Healer");
        for(int i = 0; i < healers.size(); i++){
            System.out.println(i+1);
            healers.get(i).showDetails();
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        
        return healers.get(Integer.parseInt(userInput)-1);
    }

    public Character showMythicalCreatures() {
        System.out.println("Select a Mythical Creature");
        for(int i = 0; i < mythicalCreatures.size(); i++){
            System.out.println(i+1);
            mythicalCreatures.get(i).showDetails();
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        
        return mythicalCreatures.get(Integer.parseInt(userInput)-1);
    }

    public Equipment showArmour() {
        System.out.println("Select an Armor");
        for(int i = 0; i < armour.size(); i++){
            System.out.println(i+1);
            armour.get(i).showDetails();
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice: ");
        String userInput = scanner.nextLine();
        
        try {
            return armour.get(Integer.parseInt(userInput)-1).clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Err: Armour cloning failed!");
        }
        return null;
    }

    public Equipment showArtefacts() {
        System.out.println("Select an Artefact");
        for(int i = 0; i < artefacts.size(); i++){
            System.out.println(i+1);
            artefacts.get(i).showDetails();
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice: ");
        String userInput = scanner.nextLine();
        
        try {
            return artefacts.get(Integer.parseInt(userInput)-1).clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Err: Artefact cloning failed!");
        }
        return null;
    }

    public Character showCharacters(){
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while(true) {
            System.out.println("Enter 1 to view Archers");
            System.out.println("Enter 2 to see Knights");
            System.out.println("Enter 3 to see Mages");
            System.out.println("Enter 4 to see Healers");
            System.out.println("Enter 5 to see Mythical Creatures");
            System.out.print("Choice: ");
            userInput = scanner.nextLine();
            if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4") || userInput.equals("5")) {
                break;
            } else {
                System.out.println("Please enter a valid input");
            }
        }
        try{
            switch (userInput){
                case "1":
                    return showArchers().clone();
                case "2":
                    return showKnights().clone();
                case "3":
                    return showMages().clone();
                case "4":
                    return showHealers().clone();
                case "5":
                    return showMythicalCreatures().clone();
            }
        }
        catch (Exception ex){
            System.out.println("Err: Character cloning failed!");
        }
        return null;
    }
}