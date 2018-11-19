package daniel.annotation;
@Socket(name = "Socket1151")
@ChipSet(type = "z170")
public class MSI {

	private String mark;
	private String model; 
	
	public MSI(){}
	
	public MSI(String mark, String model) {
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
