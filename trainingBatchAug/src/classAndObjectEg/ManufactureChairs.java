package classAndObjectEg;
 class ManufactureChairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chair myChair = new Chair();
		myChair.companyName = "Neelkamal ";
		myChair.colour="Brown ";
		myChair.height=2;
		myChair.materialType="Plastic ";
		//myChair.type="with handle ";
		
		myChair.dispChairInfo();
		Chair yourChair = new Chair();
		yourChair.companyName = "National ";
		yourChair.colour="Red ";
		yourChair.height=3;
		yourChair.materialType="Plastic ";
		yourChair.type="without handle ";
		yourChair.dispChairInfo();
		System.out.println("Constructor eg");
		
		
		ChairWithConstructor myNewChair = new ChairWithConstructor("NeelkamalS125 ", "Dark Brown ", 2, "with handle ", "Plastic ");
		ChairWithConstructor mynewChair1 = new ChairWithConstructor("National ", "Dark Grey ", 2, "without handle ", "Plastic ");
		//myNewChair.companyName="hacked your code";
		myNewChair.dispChairInfo();
		mynewChair1.dispChairInfo();
		
		ChairWithGetterSetter chair1 = new ChairWithGetterSetter();
		chair1.setCompanyName("ABCD");
		chair1.setColour("Green");
		//chair1.dispChairInfo();
		System.out.println(chair1.getCompanyName());
		System.out.println(chair1.getColour());
		
		
		

	}

}
