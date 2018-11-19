package daniel.annotation;

@CPUSocket(name = "Intel Socket1151")
public class INTEL {

	private String chipset;
	
	public INTEL(){}
	public INTEL(String chipset) {
		this.chipset = chipset;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	
	
}
