package classAndObjectEg;

public class ChairWithGetterSetter {
	private String companyName;
	private String colour;
	private int height;
	private String type;
	private String materialType;
	
	/*
	 * public void setCompanyName(String companyName) { this.companyName =
	 * companyName; } public String getCompanyName() { return companyName; }
	 */
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	void dispChairInfo() {
		System.out.println(companyName +colour+materialType+type +" Height of the chair is "+height+" feet");
	}


}
