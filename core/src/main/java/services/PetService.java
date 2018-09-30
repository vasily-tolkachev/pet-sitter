package services;

import enums.PetType;
import model.Pet;
import model.User;

public interface PetService {
    Pet createPet(User user, String name, int age, PetType petType, String rfid);
}
