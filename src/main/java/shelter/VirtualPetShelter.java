package shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private static VirtualPet cat = new VirtualPet("Salem", "Cat", 5, 5, 5, 5);
    private static VirtualPet dog = new VirtualPet("Angel", "Dog", 5, 5, 5, 5);

    private static Map<String, VirtualPet> allPetsInShelter = new HashMap<>();

    protected void addInitialPetsToShelter() {
        allPetsInShelter.put( cat.getPetName().toLowerCase(), cat);
        allPetsInShelter.put(dog.getPetName().toLowerCase(), dog);

    }

    protected void listAllPetsInShelter() {

        System.out.println(" NAME\t\t|\tTYPE\t|\tHUNGER\t|\tTHIRST\t|\tBOREDOM\t|\tBATHROOM\t|");
        System.out.println("______________________________________________________________________________");
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            System.out.println(pet.getPetName() + "\t\t|\t" + pet.getPetType() + "\t\t|\t\t" + pet.getHungerLevel() + "\t|\t\t" + pet.getThirstLevel() + "\t|\t\t" + pet.getBoredomLevel() + "\t|\t\t" + pet.getBathroomBreak() + "\t\t|");

        }

    }

    protected void listAllPetNamesInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            System.out.println(pet.getPetName());
        }

    }

    protected VirtualPet retrievePetByName(String requestedPetName) {
        VirtualPet pet = null;
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            String petName = mapEntry.getKey();
            if (requestedPetName.equalsIgnoreCase(petName)) {
                pet = mapEntry.getValue();
            }

        }
        return pet;
    }

    protected void addHomelessPetToShelter(VirtualPet homelessPet) {
        allPetsInShelter.put(homelessPet.getPetName().toLowerCase(), homelessPet);

    }

    protected void giveUpPetForAdoption(String petNameToBeAdopted) {

        allPetsInShelter.remove(petNameToBeAdopted.toLowerCase());
        if (allPetsInShelter.isEmpty()) {
            System.out.println("Mission accomplished! All pets have been adopted");
            System.exit(0);
        }
    }

    protected void feedAllPetsInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.feedPet();
        }
    }

    protected void waterAllPetsInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.givePetWater();
        }
    }

    protected void bathroomBreakAllPetsInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.givePetBathroomBreak();
        }
    }

    protected void playWithPet(String requestedPetName) {
        VirtualPet pet = retrievePetByName(requestedPetName);
        pet.playWithPet();
    }

    protected void tickAllPetsInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.tick();
        }
    }

    protected boolean areNeedsTooHighForAnyPet() {
        boolean areNeedsTooHighForAnyPet = true;
        for (Map.Entry<String, VirtualPet> mapEntry : allPetsInShelter.entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            if (pet.areNeedsTooHigh()) {
                areNeedsTooHighForAnyPet = false;
                break;

            }
        }
        return areNeedsTooHighForAnyPet;
    }


}
