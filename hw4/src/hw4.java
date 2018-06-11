import java.util.Scanner;
public class hw4{
public static void main(String [] args){
System.out.println("歡迎使用霍格華茲巫師鬥法大賽遊戲~");
int second=0;
Scanner keyboard=new Scanner(System.in);
System.out.print("請玩家一輸入巫師名稱及所屬學院(example: Harry Griffendor):");
boolean w=false;
String a;
do{//玩家一輸入巫師資料
a=keyboard.nextLine();
if(a.matches("[a-zA-Z0-9]+ [a-zA-Z]+"))
{if((a.endsWith("Griffendor"))||(a.endsWith("Hufflepuff"))||(a.endsWith("Ravenclaw"))||(a.endsWith("Slytherin")))
w=true;
else
System.out.print("請重新輸入: ");}	
else
System.out.print("請重新輸入: ");
}while(w==false);

wizard playerone=new wizard();//建立玩家一巫師物件 

Serpensortia pl1Ser=new Serpensortia();
Spectumsempra pl1Spec=new Spectumsempra();
Stupefy pl1Stup=new Stupefy();
Impedimenta pl1Imped=new Impedimenta();
Protego pl1Prot=new Protego();
ExpectoPatronum pl1Expec=new ExpectoPatronum();
Expelliarmus pl1Expel=new Expelliarmus();
PertrificusTotalus pl1Pert=new PertrificusTotalus();

if(a.endsWith("Griffendor"))
playerone.Griffendorwizard(playerone);
else if(a.endsWith("Hufflepuff"))
playerone.Hufflepuffwizard(playerone);
else if(a.endsWith("Ravenclaw"))	
playerone.Ravenclawwizard(playerone);
else if(a.endsWith("Slytherin"))
playerone.Slytherinwizard(playerone);

playerone.name=a.substring(0,a.indexOf(" "));	

System.out.print("請玩家二輸入巫師名稱及所屬學院(example: Harry Griffendor):");
w=false;
do{//玩家二輸入巫師資料
a=keyboard.nextLine();
if(a.matches("[a-zA-Z0-9]+ [a-zA-Z]+"))
{if((a.endsWith("Griffendor"))||(a.endsWith("Hufflepuff"))||(a.endsWith("Ravenclaw"))||(a.endsWith("Slytherin")))
w=true;
else
System.out.print("請重新輸入: ");}	
else
System.out.print("請重新輸入: ");
}while(w==false);

wizard playertwo=new wizard(); 

Serpensortia pl2Ser=new Serpensortia();//建立玩家一咒語資料
Spectumsempra pl2Spec=new Spectumsempra();
Stupefy pl2Stup=new Stupefy();
Impedimenta pl2Imped=new Impedimenta();
Protego pl2Prot=new Protego();
ExpectoPatronum pl2Expec=new ExpectoPatronum();
Expelliarmus pl2Expel=new Expelliarmus();
PertrificusTotalus pl2Pert=new PertrificusTotalus();


if(a.endsWith("Griffendor"))//選擇學校與能力值
playertwo.Griffendorwizard(playertwo);
else if(a.endsWith("Hufflepuff"))
playertwo.Hufflepuffwizard(playertwo);
else if(a.endsWith("Ravenclaw"))	
playertwo.Ravenclawwizard(playertwo);
else if(a.endsWith("Slytherin"))
playertwo.Slytherinwizard(playertwo);	

playertwo.name=a.substring(0,a.indexOf(" "));//紀錄名字

String In1="";
String In2="";
showstatus(playerone, playertwo,In1,In2,second);
int f=0;
int ggg=0;
switch(f)
{case 0:

do
{
System.out.print("玩家一請輸入指令:");//玩家一輸入正確指令

w=false;
do{
In1=keyboard.nextLine();
if((In1.equals("attack Serpensortia"))||(In1.equals("attack Spectumsempra"))||(In1.equals("attack Stupefy"))||(In1.equals("attack Expelliarmus"))||(In1.equals("attack PertrificusTotalus"))||(In1.equals("recover"))||(In1.equals("learn Serpensortia"))||(In1.equals("learn Spectumsempra"))||(In1.equals("learn Stupefy"))||(In1.equals("learn Expelliarmus"))||(In1.equals("learn PertrificusTotalus"))||(In1.equals("gameover"))||(In1.equals("do nothing")))
if(checkperform(playerone,In1,pl1Ser,pl1Spec,pl1Stup,pl1Expel,pl1Pert,pl2Imped,pl2Prot,pl2Expec)==true)
w=true;
else
System.out.print("請重新輸入指令: "); 	
else
System.out.print("請重新輸入指令: ");	
}while(w==false);

perform(playerone,playertwo,In1,pl1Ser,pl1Spec,pl1Stup,pl1Expel,pl1Pert,pl1Imped,pl1Prot,pl1Expec,pl2Imped,pl2Prot);
if(In1.equals("gameover"))
break;
if(playertwo.energy<=0)
break;
	
System.out.print("玩家二請輸入指令:");//玩家二輸入正確指令
w=false;
do{
In2=keyboard.nextLine();
if((In2.equals("attack Serpensortia"))||(In2.equals("attack Spectumsempra"))||(In2.equals("attack Stupefy"))||(In2.equals("attack Expelliarmus"))||(In2.equals("attack PertrificusTotalus"))||(In2.equals("recover"))||(In2.equals("learn Serpensortia"))||(In2.equals("learn Spectumsempra"))||(In2.equals("learn Stupefy"))||(In2.equals("learn Expelliarmus"))||(In2.equals("learn PertrificusTotalus"))||(In2.equals("gameover"))||(In2.equals("do nothing")))
if(checkperform(playertwo,In2,pl2Ser,pl2Spec,pl2Stup,pl2Expel,pl2Pert,pl1Imped,pl1Prot,pl1Expec)==true)
w=true;
else
System.out.print("請重新輸入指令: "); 	
else
System.out.print("請重新輸入指令: ");	
}while(w==false);

perform(playertwo,playerone,In2,pl2Ser,pl2Spec,pl2Stup,pl2Expel,pl2Pert,pl2Imped,pl2Prot,pl2Expec,pl1Imped,pl1Prot);
if(In2.equals("gameover"))
break;
if(playerone.energy<=0)
break;
change(playerone,playertwo);

second=second+1;
switch(second)
{case 2:	
hippogrif(playerone,playertwo);break;
case 5:	
feast(playerone,playertwo);break;
case 10:
dementor(pl1Expec,pl2Expec,playerone,playertwo);break;		
case 15:
bertiebeans(playerone,playertwo);
}
if(playerone.energy>playerone.energy0)
playerone.energy=playerone.energy0;

if(playertwo.energy>playertwo.energy0)
playertwo.energy=playertwo.energy0;
showstatus(playerone, playertwo,In1,In2,second);
In1="";
In2="";



}while(f==0);
}
if(playerone.energy<0)
playerone.energy=0;

if(playertwo.energy<0)
playertwo.energy=0;

showstatus(playerone, playertwo,In1,In2,second);
if(playerone.energy>playertwo.energy)
System.out.println("玩家一獲勝!!!");
else if(playerone.energy<playertwo.energy)
System.out.println("玩家二獲勝!!!");
else if(playerone.energy==playertwo.energy)
System.out.println("平手");


}


static void showstatus(wizard x, wizard y, String a, String b,int sec){
System.out.println("      第"+sec+"回合");
switch(sec)
{case 2:
System.out.println("本回合發生隨機事件: hippogrif");
System.out.println("從鷹馬馬背上摔下來，雙方玩家體力 -15");
break;
case 5:
System.out.println("本回合發生隨機事件: feast");
System.out.println("開學宴會，雙方玩家體力 +30");
break;
case 10:
System.out.println("本回合發生隨機事件: dementor");
System.out.println("催狂魔來襲，沒有習得 Expecto Patronum 咒語的玩家會被奪走靈魂，直接死亡");	
break;
case 15:
System.out.println("本回合發生隨機事件: bertiebeans");
System.out.println("吃到鼻涕口味的柏蒂全口味豆，雙方玩家智力 -5");
break;
}

if(a.equals("")&&b.equals(""))
System.out.print("");
else
{
System.out.println("玩家一本回合採取的行動為: "+a);
System.out.println("玩家一本回合採取的行動為: "+b);}
System.out.println("玩家一巫師名稱: "+x.name);
System.out.println("智力: "+x.IQ);
System.out.println("體力: "+x.energy);
System.out.println("狀態: ");
if(x.statusS+x.statusExpel+x.statusPert==0)
System.out.println("平常狀態");
if(x.statusS!=0)
System.out.println("*受到Spectumsempra特殊效果影響，每回合體力下降5");
if(x.statusExpel!=0)	
System.out.println("*魔杖遭敵方奪走，下回合無法使用任何咒語(防禦型咒語亦無法自動觸發)");	
if(x.statusPert!=0)
System.out.println("*遭對手石化，下回合無法採取任何行動");	

System.out.println("玩家二巫師名稱: "+y.name);
System.out.println("智力: "+y.IQ);
System.out.println("體力: "+y.energy);
System.out.println("狀態: ");
if(y.statusS+y.statusExpel+y.statusPert==0)
System.out.println("平常狀態");
if(y.statusS!=0)
System.out.println("*受到Spectumsempra特殊效果影響，每回合體力下降5");
if(y.statusExpel!=0)	
System.out.println("*魔杖遭敵方奪走，下回合無法使用任何咒語(防禦型咒語亦無法自動觸發)");	
if(y.statusPert!=0)
System.out.println("*遭對手石化，下回合無法採取任何行動");	
}


//判斷該動作是否可被執行
static boolean checkperform(wizard k, String H, Serpensortia gSer, Spectumsempra gSpe, Stupefy gStup, Expelliarmus gExpel, PertrificusTotalus gPert, Impedimenta gImpe, Protego gPro, ExpectoPatronum gExpec){
int ww=0;
if(k.statusPert!=0)
System.out.println("遭到對手石化攻擊，無法採取任何行動。可輸入do nothing繼續遊戲，或gameover結束遊戲");	
else 
{switch(H){
case "learn Serpensortia":
    if(k.statusExpel!=0)
	System.out.println("魔杖遭敵方奪走，無法使用任何咒語"); 	
	else
    {if(gSer.checklearn(k)==false)
    System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
  else
    ww=1;}	
	break;
case "attack Serpensortia":	
if(k.statusExpel!=0)
 System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");
 else
 {if(gSer.checkattack(k)==false)	
	System.out.println("尚未習得此技能或是體力不足");
  else
 ww=1;}	  
	break;
case "learn Spectumsempra":
    if(k.statusExpel!=0)
	System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");	
	else
	{if(gSpe.checklearn(k)==false)
    System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
    else
    ww=1;}
    break;
case "attack Spectumsempra":	
    if(k.statusExpel!=0)
	System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");	
	else
	{if(gSpe.checkattack(k)==false)
	System.out.println("尚未習得此技能或是體力不足");	
    else
	ww=1;}
	break;
case "learn Stupefy":
  if(k.statusExpel!=0)
  System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");	  
  else
  {if(gStup.checklearn(k)==false)
    System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
  else
  ww=1;}
    break;	
case "attack Stupefy":
   if(k.statusExpel!=0)
   System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");
   else
   {if(gStup.checkattack(k)==false)
    System.out.println("尚未習得此技能或是體力不足");
    else
    ww=1;}
	break;
case "learn Expelliarmus":
  if(k.statusExpel!=0)
  System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");
  else	  
  {if(gExpel.checklearn(k)==false)
    System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
  else
  ww=1;}
    break;	
case "attack Expelliarmus":
    if(k.statusExpel!=0)
	System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");	
	else
	{if(gExpel.checkattack(k)==false)
    System.out.println("尚未習得此技能或體力不足");
    else 
	ww=1;}
	break;
case "learn PertrificusTotalus":
  if(k.statusExpel!=0)
  System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");
  else
  {if(gPert.checklearn(k)==false)
  System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
  else
  ww=1;}
    break;	
case "attack PertrificusTotalus":
    if(k.statusExpel!=0)
	System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");	
	else
	{if(gPert.checkattack(k)==false)    
    System.out.println("尚未習得此技能或是體力不足");
	else
	ww=1;}	
	break;
case "recover":
    if(k.potion==0)
    System.out.println("魔藥數量不足");
    else
    ww=1;
    break;
case "gameover":
    ww=1;
    break;	
case "do nothing":
	ww=1;
	break;
case "learn Impedimenta":	
	if(k.statusExpel!=0)
  System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");
  else
  {if(gImpe.checklearn(k)==false)
  System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
  else
  ww=1;}
    break;	
case "learn Protego":	
	if(k.statusExpel!=0)
  System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");
  else
  {if(gPro.checklearn(k)==false)
  System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
  else
  ww=1;}
    break;		
case "learn ExpectoPatronum":	
	if(k.statusExpel!=0)
  System.out.println("魔杖遭敵方奪走，下回合無法使用任何咒語");
  else
  {if(gExpec.checklearn(k)==false)
  System.out.println("體力不足或智力未達最低標準或是該咒語熟練度已達100%，無法執行");
  else
  ww=1;}
    break;	
	}}
if(ww==1)
return true;
else 
return false;
}


static void perform(wizard k, wizard o, String H, Serpensortia gSer, Spectumsempra gSpe, Stupefy gStup, Expelliarmus gExpel, PertrificusTotalus gPert, Impedimenta gImpe, Protego gPro, ExpectoPatronum gExpec, Impedimenta od1, Protego od2)
{switch(H){
	case "learn Serpensortia":
    gSer.learn(k);
    break;
	case "attack Serpensortia":	
    gSer.attack(k,o,od1,od2);
    break;
	case "learn Spectumsempra":
    gSpe.learn(k);
    break;
	case "attack Spectumsempra":	
    gSpe.attack(k,o,od1,od2);
    break;
	case "learn Stupefy":
    gStup.learn(k);	  
    break;
	case "attack Stupefy":
    gStup.attack(k,o,od1,od2);
    break;
	case "learn Impedimenta":
	gImpe.learn(k);
    break;
	case "learn Protego":
	gPro.learn(k);
	break;
	case "learn ExpectoPatronum":
	gExpec.learn(k);
	break;
	case "learn Expelliarmus":
    gExpel.learn(k);
    break;
	case "attack Expelliarmus":
    gExpel.attack(k,o);
    break;
	case "learn PertrificusTotalus":
    gPert.learn(k);
    break;
	case "attack PertrificusTotalus":
    gPert.attack(k,o);
    break;
	case "recover":
    k.potion=k.potion-1;
	k.energy=k.energy+50;
    break;
	case "gameover":
	break;
    case "do nothing":
	System.out.println("什麼也不做~");
    break;
	}
}	
	
static void change(wizard a, wizard b)	
{
 if(a.statusS!=0)	
 a.energy=a.energy-5;	
 if(a.energy<0)
 a.energy=0;
 a.statusS=a.statusS-1;
 a.statusExpel=a.statusExpel-1;
 a.statusPert=a.statusPert-1; 
 b.statusS=a.statusS-1;
 b.statusExpel=a.statusExpel-1;
 b.statusPert=a.statusPert-1; 
 if(a.statusS<0)
 a.statusS=0;
 if(b.statusS<0)
 b.statusS=0;	 
 if(a.statusExpel<0)
 a.statusExpel=0;
 if(b.statusExpel<0)
 b.statusExpel=0;
 if(a.statusPert<0)
 a.statusPert=0;
 if(b.statusPert<0)
 b.statusPert=0;
 

}
	
static void hippogrif(wizard a,wizard b)
{a.energy=a.energy-15;
if(a.energy<=0)
a.energy=0;	
b.energy=b.energy-15;	
if(b.energy<=0)	
b.energy=0;	
}
	
static void bertiebeans(wizard a,wizard b)	
{a.IQ=a.IQ-5;
b.IQ=b.IQ-5;}		

static void feast(wizard a, wizard b) 
{a.energy=a.energy+30;
if(a.energy>a.energy0)
	a.energy=a.energy0;
b.energy=b.energy+30;

if(b.energy>b.energy0)
	b.energy=b.energy0;	
}
static void dementor(ExpectoPatronum a, ExpectoPatronum b, wizard c, wizard d) 
{if(a.getornot==false)
c.energy=0;
if(b.getornot==false)	
d.energy=0;	
}

}




