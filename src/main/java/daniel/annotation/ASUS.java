package daniel.annotation;
@Socket(name = "Socket1151")
@ChipSet(type = "X470")
public class ASUS {
	private String mark;
	private String model; 
	
	public ASUS(){}
	
	public ASUS(String mark, String model) {
		this.mark = mark;
		this.model = model;
	}

	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
