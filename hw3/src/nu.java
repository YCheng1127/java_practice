public class nu{
public int name;
public int energy=90;	
public int recovery=20;	
public int status=1;//1閒置，2手術照護，3一般照護，4透支
public int time=0;
public int gg=0;

public nu(int x)
{
name=x;	
	
}

public int surgery()//手術照護
{
if(status==1)	
  if(energy>=30)
  {this.energy=this.energy-30;	
  this.status=2;
  this.time=0;
  return 1;}//執行成功
  else
  return 0;//體力不足
else
return 0;//沒空	
}	
public int generalcare()//一般照護
{
if(status==1)	
{if(energy>=10)
{this.energy=this.energy-10;
this.status=3;
this.time=0;
return 1;}//成功
else
return 0;}//體力不足
else
return 0;//沒空
	
	}

public int dieandop()//透支體力並進行手術照護
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

public int dieandge()//透支體力並進行一般照護
{
if(status==1)	
{if(gg==0)	
{gg=1;
status=22;//術後透支
this.energy=this.energy-10;	
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
else if(this.status==2&this.time==3)
{this.status=1;
this.time=0;}
else if(this.status==3&this.time==1)	
{this.status=1;
this.time=0;}	
else if(this.status==21&this.time==3)//透支執行手術照護，轉成忙碌狀態	
{this.status=4;
this.time=0;}
else if(this.status==22&this.time==1)
{this.status=4;
this.time=0;	
}	
else if(this.status==4&this.time==5)//透支狀態完成，轉成閒置
{this.status=1;
this.time=0;
this.energy=90;}
	
if(this.energy>90)	
this.energy=90;	
}
	
	
	
}