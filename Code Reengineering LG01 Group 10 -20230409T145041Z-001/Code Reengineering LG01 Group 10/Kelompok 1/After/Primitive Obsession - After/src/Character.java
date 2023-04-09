
public class Character {
	private String name;
	private String charClass;
	private Weapon weaponList;
	private Armor armorList;
	
	public Character(String name, String charClass, String weaponName, String weaponType, String armorName, String armorType) {
		super();
		this.name = name;
		this.charClass = charClass;
		this.setWeaponList(new Weapon(weaponName, weaponType));
		this.setArmorList(new Armor(armorName, armorType));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public Weapon getWeaponList() {
		return weaponList;
	}

	public void setWeaponList(Weapon weaponList) {
		this.weaponList = weaponList;
	}

	public Armor getArmorList() {
		return armorList;
	}

	public void setArmorList(Armor armorList) {
		this.armorList = armorList;
	}

	
	
	
}
