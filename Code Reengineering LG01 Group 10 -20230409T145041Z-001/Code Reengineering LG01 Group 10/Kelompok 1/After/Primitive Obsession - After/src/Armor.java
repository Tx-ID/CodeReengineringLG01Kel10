
public class Armor {
	private String armorName;
	private String armorType;
	
	public Armor(String armorName, String armorType) {
		this.armorName = armorName;
		this.armorType = armorType;
	}

	public String getArmorType() {
		return armorType;
	}

	public void setArmorType(String armorType) {
		this.armorType = armorType;
	}

	public String getArmorName() {
		return armorName;
	}

	public void setArmorName(String armor) {
		this.armorName = armor;
	}
}
