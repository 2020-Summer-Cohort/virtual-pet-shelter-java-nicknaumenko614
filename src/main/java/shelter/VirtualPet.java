package shelter;


public class VirtualPet {

    private String petName;
    private String petType;
    private Integer hungerLevel;
    private Integer thirstLevel;
    private Integer boredomLevel;
    private Integer bathroomBreak;

    public VirtualPet(String petName, String petType, Integer hungerLevel, Integer thirstLevel, Integer boredomLevel, Integer bathroomBreak) {

        this.petName = petName;
        this.petType = petType;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.bathroomBreak = bathroomBreak;

    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }


    public Integer getThirstLevel() {
        return thirstLevel;
    }


    public Integer getBoredomLevel() {
        return boredomLevel;
    }


    public Integer getBathroomBreak() {
        return bathroomBreak;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }


    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
        bathroomBreak++;

    }

    public void feedPet() {
        hungerLevel = hungerLevel - 3;
        boredomLevel++;
        bathroomBreak++;

    }

    public void givePetWater() {
        thirstLevel = thirstLevel - 3;
        bathroomBreak++;


    }

    public void playWithPet() {
        boredomLevel = boredomLevel - 5;
        hungerLevel++;
        thirstLevel++;


    }

    public void givePetBathroomBreak() {
        bathroomBreak = bathroomBreak - 5;
        boredomLevel++;


    }

    protected boolean areNeedsTooHigh() {
        return getHungerLevel() < 20 && getThirstLevel() < 20 && getBoredomLevel() < 20 && getBathroomBreak() < 20;


    }
}

