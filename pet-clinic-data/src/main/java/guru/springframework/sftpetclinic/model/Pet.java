package guru.springframework.sftpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
	private PetType petType;
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDAte() {
		return birthDAte;
	}
	public void setBirthDAte(LocalDate birthDAte) {
		this.birthDAte = birthDAte;
	}
	private Owner owner;
	private LocalDate birthDAte;
}
