package repos;

import enums.PetType;
import model.Pet;
import model.User;

import java.util.Set;

public interface PetRepo extends AbstractRepo<Pet> {
    Pet findByOwner(User owner, String name);

    Set<Pet> findAllByOwner(User owner);

    Set<Pet> findAllByType(PetType type);
}
