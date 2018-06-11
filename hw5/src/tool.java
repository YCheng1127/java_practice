public class tool{
int number=1;
public void use()
{};
}
class FelixFelicis extends tool{
public boolean checkuse(wizard k)
{
	
if(k.statusPert==0)	
{if(this.number==0)
return false;
else
return true;}	

else
return false;
}

public void use(wizard k)
{this.number=0;
k.statusFe=4;
}
	
	
}


class ElderWand extends tool{
public boolean checkuse(wizard k)	
{
if(k.statusPert==0)	
{if(this.number==0)
return false;
else
return true;	
}
else
return false;		
}

public void use(wizard k)	
{this.number=0;
k.statusEl=2;	
}
}

class InvisibilityCloak extends tool{
public boolean checkuse(wizard k)
{
if(k.statusPert==0)
{if(this.number==0)
return false;
else
return true;	
}
else
return false;	
}
public void use(wizard k)
{this.number=0;
k.statusIn=2;	
}	
}


class ForgetfulnessPotion extends tool{
public boolean checkuse(wizard k)
{
if(k.statusPert==0)
{if(this.number==0)
return false;
else
return true;	
}
else
return false;	
}
public void use(wizard o,String Ino,Serpensortia poSer,Spectumsempra poSpec,Stupefy poStup,Impedimenta poImped,Protego poProt,ExpectoPatronum poExpec,Expelliarmus poExpel,PertrificusTotalus poPert)
{if((Ino.equals("learn Serpensortia"))||(Ino.equals("learn Spectumsepra"))||(Ino.equals("learn Stupefy"))||(Ino.equals("learn Impedimenta"))||(Ino.equals("learn Protego"))||(Ino.equals("learn ExpectoPatronum"))||(Ino.equals("learn Expelliarmus"))||(Ino.equals("learn PertrificusTotalus")))
 {int x=0;
  if(poSer.getornot==true)
   x=x+1;	 
  if(poSpec.getornot==true)
   x=x+1; 
  if(poStup.getornot==true)
   x=x+1;	
  if(poImped.getornot==true)
   x=x+1; 
  if(poProt.getornot==true)
   x=x+1;
  if(poExpec.getornot==true)
   x=x+1;
  if(poExpel.getornot==true)
   x=x+1;
  if(poPert.getornot==true)
   x=x+1;
  if(x>=2)
  switch(Ino){
   case "learn Serpensortia":	  
	poSer.died=true;
    break;
   case "learn Spectumsempra":
    poSpec.died=true;
    break;
   case "learn Stupefy":
    poStup.died=true;
   	break;
   case "learn Impedimenta":
    poImped.died=true;
    break;
   case "learn Protego":
    poProt.died=true;
	break;
   case "learn ExpectoPatronum":
    poExpec.died=true;
	break;
   case "learn Expelliarmus":
    poExpel.died=true;
	break;
   case "learn PertrificusTotalus":
    poPert.died=true;
	break;
  };  
 }
 	
}	
}
