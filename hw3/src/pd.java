public class pd{
public int name;
public int energy=100;	
public int recovery=25;	
public int status=1;//1閒置，2內科治療，3看診 ，4透支，5急救治療
public int time=0;
public int gg=0;
public pd(int x)
{
name=x;	
	
}



public int pcure()//內科治療
{
if(status==1)
{if(energy>=20)	
{this.energy=this.energy-20;	
this.status=2;
this.time=0;
return 1;
}
else
return 0;}
else 
return 0;	
}	

public int diagnoze()//看診
{if(status==1)
	{if(energy>=10)	
{this.energy=this.energy-10;
this.status=3;
this.time=0;
return 1;}
else
return 0;}
else
return 0;


}

public int emergency()//緊急治療
{
if(status==1)
if(energy>=30)
{this.energy=this.energy-30;
this.status=5;
this.time=0;
return 1;}
else
return 0;
else
return 0;	
}

public int dieandem()//透支體力並進行緊急治療
{
if(status==1)	
{if(gg==0)	
{gg=1;
status=21;//術後透支
this.energy=this.energy-30;	
this.time=0;
return 1;
}
else
return 0;}
else
return 0;
	
}	


public void checkstatus()//回合結算，狀態更動
{
this.time=this.time+1;	

if(this.status==1)
this.energy=this.energy+25;
else if(this.status==2&this.time==1)
{this.status=1;
time=0;}
else if(this.status==3&this.time==1)	
{this.status=1;
time=0;}	
else if(this.status==5&this.time==1)
{this.status=1;
time=0;}
else if(this.status==21&this.time==1)	
{this.status=4;
time=0;}
else if(this.status==4&this.time==5)	
{this.status=1;
energy=100;
time=0;}	
	
	
	
	
	
if(this.energy>100)	
this.energy=100;	
}
	
	
	
}