package daniel.annotation;
@CPUSocket(name = "AMD AM4")
public class AMD {

	private String chipset;

	public AMD(){}
	public AMD(String chipset) {
		this.chipset = chipset;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	
}
