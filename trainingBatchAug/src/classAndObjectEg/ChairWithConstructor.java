package classAndObjectEg;

 class ChairWithConstructor {
	
	  private String companyName; private String colour; private int height;
	  private String type; private String materialType;
	 
	
	public ChairWithConstructor(String companyName , String colour , int height , String type , String materialType) {
		
		  this.companyName = companyName; this.colour= colour; this.height=height;
		  this.type= type; this.materialType=materialType;
		 
		
		System.out.println(companyName +colour+materialType+type +" Height of the chair is "+height+" feet");
		
	}
	
	
	  public void dispChairInfo() { System.out.println(companyName
	  +colour+materialType+type +" Height of the chair is "+height+" feet");
	  
	  }
	 

}
