public class magic{
public boolean getornot=false;//是否學習
public int degree=0;//熟練程度
}
//攻擊魔法

class Serpensortia extends magic{
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=10)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
if(this.getornot==false)//判斷是否學過(第一次學)
{this.degree=50;
 k.IQ=k.IQ+2;
 k.energy=k.energy-10;
this.getornot=true;}//將狀態改為已學過	
else	
{k.IQ=k.IQ+2;
this.degree=this.degree+10;
k.energy=k.energy-10;}	
}	
public boolean checkattack(wizard k){	
if(this.getornot==true)	
if(k.energy>10)
return true;
else
return false;
else	
return false;	
}
public void attack(wizard k, wizard o, Impedimenta od1, Protego od2)
{k.energy=k.energy-10;
double kattack=60*this.degree/100*(1+k.talent/100);
double od1d;
double od2d;
if(o.statusExpel!=0)
o.energy=o.energy-kattack;
else
{if(od1.getornot==false)
od1d=0;
else
od1d=0.2*(1+od1.degree/100);


if(od2.getornot==false)
od2d=0;
else	
od2d=0.3*(1+od2.degree/100);

if(od1d>=od2d)
o.energy=o.energy-kattack*(1-od1d);
else if(od1d<=od2d)
o.energy=o.energy-kattack*(1-od2d);}
int c=(int)o.energy;
o.energy=c;
if(o.energy<0)
o.energy=0;	
}
}

class Spectumsempra extends magic{
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=35)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
if(this.getornot==false)//判斷是否學過(第一次學)
{this.degree=30;
 k.IQ=k.IQ+4;
 k.energy=k.energy-10;
this.getornot=true;}//將狀態改為已學過	
else	
{k.IQ=k.IQ+4;
this.degree=this.degree+5;
k.energy=k.energy-10;}	
}	
public boolean checkattack(wizard k){	
if(this.getornot==true)	
if(k.energy>10)
return true;
else
return false;
else	
return false;	
}
public void attack(wizard k, wizard o, Impedimenta od1, Protego od2)
{k.energy=k.energy-10;
double kattack=80*this.degree/100*(1+k.talent/100);
double od1d;
double od2d;
if(o.statusExpel!=0)
o.energy=o.energy-kattack;
else
{if(od1.getornot==false)
od1d=0;
else
od1d=0.2*(1+od1.degree/100);


if(od2.getornot==false)
od2d=0;
else	
od2d=0.3*(1+od2.degree/100);

if(od1d>=od2d)
o.energy=o.energy-kattack*(1-od1d);
else if(od1d<=od2d)
o.energy=o.energy-kattack*(1-od2d);}
int c=(int)o.energy;
o.energy=c;
if(o.energy<0)
o.energy=0;

o.statusS=3;
}
}


class Stupefy extends magic{
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=20)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
if(this.getornot==false)//判斷是否學過(第一次學)
{this.degree=40;
 k.IQ=k.IQ+2;
 k.energy=k.energy-10;
this.getornot=true;}//將狀態改為已學過	
else	
{k.IQ=k.IQ+3;
this.degree=this.degree+10;
k.energy=k.energy-10;}	
}	
public boolean checkattack(wizard k){	
if(this.getornot==true)	
if(k.energy>10)
return true;
else
return false;
else	
return false;	
}
public void attack(wizard k, wizard o, Impedimenta od1, Protego od2)
{k.energy=k.energy-10;
double kattack=70*this.degree/100*(1+k.talent/100);
double od1d;
double od2d;
if(o.statusExpel!=0)
o.energy=o.energy-kattack;
else
{if(od1.getornot==false)
od1d=0;
else
od1d=0.2*(1+od1.degree/100);


if(od2.getornot==false)
od2d=0;
else	
od2d=0.3*(1+od2.degree/100);

if(od1d>=od2d)
o.energy=o.energy-kattack*(1-od1d);
else if(od1d<=od2d)
o.energy=o.energy-kattack*(1-od2d);}
int c=(int)o.energy;
o.energy=c;
if(o.energy<0)
o.energy=0;
}
}






//防禦魔法
class Impedimenta extends magic{
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=15)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
if(this.getornot==false)//判斷是否學過(第一次學)
{this.degree=40;
 k.IQ=k.IQ+2;
 k.energy=k.energy-10;
this.getornot=true;}//將狀態改為已學過	
else	
{k.IQ=k.IQ+2;
this.degree=this.degree+20;
k.energy=k.energy-10;}	
}		
}


class Protego extends magic{//Protego魔法
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=25)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
if(this.getornot==false)//判斷是否學過(第一次學)
{this.degree=30;
 k.IQ=k.IQ+3;
 k.energy=k.energy-10;
this.getornot=true;}//將狀態改為已學過	
else	
{k.IQ=k.IQ+3;
this.degree=this.degree+8;
k.energy=k.energy-10;}	
}		
}


class ExpectoPatronum  extends magic{
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=35)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
 this.degree=100;
 k.IQ=k.IQ+8;
 k.energy=k.energy-10;
this.getornot=true;//將狀態改為已學過		
}		
}

//限制行動型魔法
class Expelliarmus extends magic{
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=25)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
if(this.getornot==false)//判斷是否學過(第一次學)
{this.degree=100;
 k.IQ=k.IQ+3;
 k.energy=k.energy-10;
this.getornot=true;}//將狀態改為已學過		
}	

public boolean checkattack(wizard k){	
if(this.getornot==true)	
if(k.energy>20)
return true;
else
return false;
else	
return false;	
}
public void attack(wizard k, wizard o)
{k.energy=k.energy-20;
o.statusExpel=2;
}
}


class PertrificusTotalus extends magic{
public boolean checklearn(wizard k){//判斷能否學習該魔法
if(this.degree<100)//判斷熟練度是否以達到上限
if(k.energy>10)
if(k.IQ>=35)//判斷智力標準	
return true; 
else 
return false;	
else 
return false;	
else
return false;	
}	
public void learn(wizard k){//學習魔法
if(this.getornot==false)//判斷是否學過(第一次學)
{this.degree=100;
 k.IQ=k.IQ+4;
 k.energy=k.energy-10;
this.getornot=true;}//將狀態改為已學過		
}	

public boolean checkattack(wizard k){	
if(this.getornot==true)	
if(k.energy>30)
return true;
else
return false;
else	
return false;	
}
public void attack(wizard k, wizard o)
{k.energy=k.energy-30;
o.statusPert=2;
}
}