class NamedCow extends Cow {
	private String cowName;
	public NamedCow(String type, String sound, String name)
     {         
         myType = type;         

         mySound = sound; 

         cowName = name;   
     }     
	public NamedCow()
	{
		myType = "unknown";
		mySound = "unknown";
		cowName = "unknown";
	}

	public String getName(){return cowName;}
}