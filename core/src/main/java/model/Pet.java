package model;

import enums.PetType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
public class Pet extends AbstractEntity{

    User owner;
    PetType petType;
    String name;
    Integer age;
    String details;

    /**
     * The pet has a RFID microchip implant.
     */
    private String rfid;

    //required by JPA
    public Pet() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pet pet = (Pet) o;
        if (owner != null ? !owner.equals(pet.owner) : pet.owner != null) return false;
        if (petType != pet.petType) return false;
        if (name != null ? !name.equals(pet.name) : pet.name != null) return false;
        if (age != null ? !age.equals(pet.age) : pet.age != null) return false;
        if (details != null ? !details.equals(pet.details) : pet.details != null) return false;
        return rfid != null ? rfid.equals(pet.rfid) : pet.rfid == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (petType != null ? petType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (rfid != null ? rfid.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("id=").append(id);
        sb.append(", owner=").append(owner);
        sb.append(", petType=").append(petType);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", details='").append(details).append('\'');
        sb.append(", rfid='").append(rfid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
