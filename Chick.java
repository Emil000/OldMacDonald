class Chick implements Animal
{
	private String myType;     
    private String mySound;  
    public Chick (String type, String sound1, String sound2)
    {
    	myType = type;
    	mySound1 = sound1;
        mySound2 = sound2;     
     }     
     public Chick()
     {         
         myType = "unknown";         
         mySound = "unknown";     
     }
     public String getSound(){
        int i = (int)(Math.random()*2)+1;
        if (i==1)
        return mySound1;
        else
        return mySound2;
     public String getType(){return myType;}
 }
