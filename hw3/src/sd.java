public class sd{
public int name;
public int energy=100;	
public int recovery=30;	
public int status=1;//1閒置，2手術，3看診，4透支
public int time=0;
public int gg=0;
public sd(int x)
{
name=x;	
	
}

public int surgery()//執行手術
{
if(status==1)
	if(energy>=50)
{this.energy=this.energy-50;	
this.status=2;
this.time=0;
return 1;
}
  else
  return 0;
else
  return 0;
}

	
public int diagnoze()//看診
{
if(status==1)
if(energy>=10)
{	
this.energy=this.energy-10;
this.status=3;
this.time=0;
return 1;
}
  else
  return 0;
else 
	return 0;

}
public void checkstatus()//回合結束前更新資料
{
this.time=this.time+1;	

if(this.status==1)
this.energy=this.energy+30;
else if(this.status==2&this.time==3)
{this.status=1;
this.time=0;}
else if(this.status==3&this.time==1)	
{this.status=1;
this.time=0;}
else if(this.status==21&this.time==3)	
{this.status=4;
this.time=0;}
else if(this.status==4&this.time==5)	
{this.status=1;
this.energy=100;
this.time=0;}	
if(this.energy>100)	
this.energy=100;	
}
	
public int die()//透支體力並進行手術
{
if(status==1)
{if(gg==0)
{gg=1;
status=21;//術後透支
this.energy=this.energy-50;	
this.time=0;
return 1;
}
else
return 0;}
else 
return 0;

}	
	
}