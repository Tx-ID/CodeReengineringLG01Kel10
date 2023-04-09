
public class Weapon {
	private String weaponName;
	private String weaponType;
	
	public Weapon(String weaponName, String weaponType) {
		super();
		this.weaponName = weaponName;
		this.weaponType = weaponType;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weapon) {
		this.weaponName = weapon;
	}
}
