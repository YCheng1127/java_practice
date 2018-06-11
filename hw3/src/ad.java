public class ad{
public int name;
public int energy=80;	
public int recovery=20;	
public int status=1;//1閒置，2麻醉
public int time=0;
public int gg=0;
public ad(int x)
{
name=x;	
	
}
	
public int anesthesia()//麻醉
{
if(status==1)
{if(energy>=30)	
{this.energy=this.energy-30;
this.status=2;
this.time=0;
return 1;}
else
return 0;}
else 
return 0;
}

public int dieandan()//透支體力並進行緊急照護
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
this.energy=this.energy+20;

else if(this.status==2&this.time==2)
{this.status=1;
time=0;}
else if(this.status==21&this.time==2)
{this.status=4;
time=0;}
else if(this.status==4&this.time==5)
{this.status=1;
energy=80;
time=0;}
	
if(this.energy>80)	
this.energy=80;	
}
	
	
	
}