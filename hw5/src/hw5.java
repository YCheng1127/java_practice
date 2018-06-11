import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class hw5{
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

Serpensortia pl1Ser=new Serpensortia();//建立玩家一咒語
Spectumsempra pl1Spec=new Spectumsempra();
Stupefy pl1Stup=new Stupefy();
Impedimenta pl1Imped=new Impedimenta();
Protego pl1Prot=new Protego();
ExpectoPatronum pl1Expec=new ExpectoPatronum();
Expelliarmus pl1Expel=new Expelliarmus();
PertrificusTotalus pl1Pert=new PertrificusTotalus();

FelixFelicis pl1Fel=new FelixFelicis();//建立玩家一道具
ElderWand pl1Eld=new ElderWand();
InvisibilityCloak pl1In=new InvisibilityCloak(); 
ForgetfulnessPotion pl1For=new ForgetfulnessPotion();

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

wizard playertwo=new wizard(); //建立玩家二巫師物件

Serpensortia pl2Ser=new Serpensortia();//建立玩家二咒語資料
Spectumsempra pl2Spec=new Spectumsempra();
Stupefy pl2Stup=new Stupefy();
Impedimenta pl2Imped=new Impedimenta();
Protego pl2Prot=new Protego();
ExpectoPatronum pl2Expec=new ExpectoPatronum();
Expelliarmus pl2Expel=new Expelliarmus();
PertrificusTotalus pl2Pert=new PertrificusTotalus();

FelixFelicis pl2Fel=new FelixFelicis();//建立玩家二道具物件
ElderWand pl2Eld=new ElderWand();
InvisibilityCloak pl2In=new InvisibilityCloak(); 
ForgetfulnessPotion pl2For=new ForgetfulnessPotion();

if(a.endsWith("Griffendor"))//選擇學校與能力值
playertwo.Griffendorwizard(playertwo);
else if(a.endsWith("Hufflepuff"))
playertwo.Hufflepuffwizard(playertwo);
else if(a.endsWith("Ravenclaw"))	
playertwo.Ravenclawwizard(playertwo);
else if(a.endsWith("Slytherin"))
playertwo.Slytherinwizard(playertwo);	

playertwo.name=a.substring(0,a.indexOf(" "));//紀錄名字
String eve="";
String In1="";
String In2="";
showstatus(playerone, playertwo,In1,In2,"",second);//顯示結果
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
if((In1.equals("attack Serpensortia"))||(In1.equals("attack Spectumsempra"))||(In1.equals("attack Stupefy"))||(In1.equals("attack Expelliarmus"))||(In1.equals("attack PertrificusTotalus"))||(In1.equals("recover"))||(In1.equals("learn Serpensortia"))||(In1.equals("learn Spectumsempra"))||(In1.equals("learn Stupefy"))||(In1.equals("learn Expelliarmus"))||(In1.equals("learn PertrificusTotalus"))||(In1.equals("learn Impedimenta"))||(In1.equals("learn Protego"))||(In1.equals("learn Expecto"))||(In1.equals("game over"))||(In1.equals("do nothing"))||(In1.equals("use Felix Felicis"))||(In1.equals("use Elder Wand"))||(In1.equals("use Invisibility Cloak"))||(In1.equals("use Forgetfulness Potion")))
if(checkperform(playerone,In1,pl1Ser,pl1Spec,pl1Stup,pl1Expel,pl1Pert,pl2Imped,pl2Prot,pl2Expec,pl1Fel,pl1Eld,pl1In,pl1For)==true)
w=true;
else
System.out.print("請重新輸入指令: "); 	
else
System.out.print("請重新輸入指令: ");	
}while(w==false);


if(In1.equals("game over"))
break;//跳出
	
System.out.print("玩家二請輸入指令:");//玩家二輸入正確指令
w=false;
do{
In2=keyboard.nextLine();
if((In2.equals("attack Serpensortia"))||(In2.equals("attack Spectumsempra"))||(In2.equals("attack Stupefy"))||(In2.equals("attack Expelliarmus"))||(In2.equals("attack PertrificusTotalus"))||(In2.equals("recover"))||(In2.equals("learn Serpensortia"))||(In2.equals("learn Spectumsempra"))||(In2.equals("learn Stupefy"))||(In2.equals("learn Expelliarmus"))||(In2.equals("learn PertrificusTotalus"))||(In2.equals("learn Impedimenta"))||(In2.equals("learn Protego"))||(In2.equals("learn Expecto"))||(In2.equals("game over"))||(In2.equals("do nothing"))||(In2.equals("use Felix Felicis"))||(In2.equals("use Elder Wand"))||(In2.equals("use Invisibility Cloak"))||(In2.equals("use Forgetfulness Potion")))
if(checkperform(playertwo,In2,pl2Ser,pl2Spec,pl2Stup,pl2Expel,pl2Pert,pl1Imped,pl1Prot,pl1Expec,pl2Fel,pl2Eld,pl2In,pl2For)==true)
w=true;
else
System.out.print("請重新輸入指令: "); 	
else
System.out.print("請重新輸入指令: ");	
}while(w==false);

if(In2.equals("game over"))
break;

if(In1.equals("use Felix Felicis")||(In1.equals("use Forgetfulness Potion"))||(In1.equals("learn Serpensortia"))||(In1.equals("learn Spectumsempra"))||(In1.equals("learn Stupefy"))||(In1.equals("learn Expelliarmus"))||(In1.equals("learn PertrificusTotalus"))||(In1.equals("learn Impedimenta"))||(In1.equals("learn Protego"))||(In1.equals("learn Expecto")))
In1=In1;
else
perform(playerone,playertwo,In1,pl1Ser,pl1Spec,pl1Stup,pl1Expel,pl1Pert,pl1Imped,pl1Prot,pl1Expec,pl2Imped,pl2Prot,pl1Fel,pl1Eld,pl1In);

if((In2.equals("use Felix Felicis"))||(In2.equals("use Forgetfulness Potion"))||(In2.equals("learn Serpensortia"))||(In2.equals("learn Spectumsempra"))||(In2.equals("learn Stupefy"))||(In2.equals("learn Expelliarmus"))||(In2.equals("learn PertrificusTotalus"))||(In2.equals("learn Impedimenta"))||(In2.equals("learn Protego"))||(In2.equals("learn Expecto")))
In2=In2;
else
perform(playertwo,playerone,In2,pl2Ser,pl2Spec,pl2Stup,pl2Expel,pl2Pert,pl2Imped,pl2Prot,pl2Expec,pl1Imped,pl1Prot,pl2Fel,pl2Eld,pl2In);//執行結果


change(playerone,playertwo);

second=second+1;//回合數加一

int k=0;
eve="";
try
{Scanner scan = new Scanner(new FileInputStream("event.txt"));
			while(scan.hasNextLine()){
				Scanner parse = new Scanner(scan.nextLine());
				parse.useDelimiter("	");
				k=parse.nextInt();
				eve=parse.next();
				
				if((second)==k);
				break;				
            }}
			catch(FileNotFoundException e){
			System.out.println("File not found exception handling.");
		}
			
if((second)==k)
{switch(eve)
{case "hippogrif":	
hippogrif(playerone,playertwo);break;
case "feast":	
feast(playerone,playertwo);break;
case "dementor":
dementor(pl1Expec,pl2Expec,playerone,playertwo);break;		
case "bertiebeans":
bertiebeans(playerone,playertwo);break;
}
}
else
eve="";

if((In1.equals("use Felix Felicis"))||(In1.equals("learn Serpensortia"))||(In1.equals("learn Spectumsempra"))||(In1.equals("learn Stupefy"))||(In1.equals("learn Expelliarmus"))||(In1.equals("learn PertrificusTotalus"))||(In1.equals("learn Impedimenta"))||(In1.equals("learn Protego"))||(In1.equals("learn Expecto")))
perform(playerone,playertwo,In1,pl1Ser,pl1Spec,pl1Stup,pl1Expel,pl1Pert,pl1Imped,pl1Prot,pl1Expec,pl2Imped,pl2Prot,pl1Fel,pl1Eld,pl1In);

if((In2.equals("use Felix Felicis"))||(In2.equals("learn Serpensortia"))||(In2.equals("learn Spectumsempra"))||(In2.equals("learn Stupefy"))||(In2.equals("learn Expelliarmus"))||(In2.equals("learn PertrificusTotalus"))||(In2.equals("learn Impedimenta"))||(In2.equals("learn Protego"))||(In2.equals("learn Expecto")))
perform(playertwo,playerone,In2,pl2Ser,pl2Spec,pl2Stup,pl2Expel,pl2Pert,pl2Imped,pl2Prot,pl2Expec,pl1Imped,pl1Prot,pl2Fel,pl2Eld,pl2In);

if(In1.equals("use Forgetfulness Potion"))
pl1For.use(playertwo,In2,pl2Ser,pl2Spec,pl2Stup,pl2Imped,pl2Prot,pl2Expec,pl2Expel,pl2Pert);

if(In2.equals("use Forgetfulness Potion"))
pl1For.use(playerone,In2,pl1Ser,pl1Spec,pl1Stup,pl1Imped,pl1Prot,pl1Expec,pl1Expel,pl1Pert);
	
if(playerone.energy>playerone.energy0)//當體力值大於體力上限，等於體力上限
playerone.energy=playerone.energy0;

if(playertwo.energy>playertwo.energy0)
playertwo.energy=playertwo.energy0;

if(playerone.energy<0)//當體力低於0，體力等於0
playerone.energy=0;

if(playertwo.energy<0)
playertwo.energy=0;

if(playerone.talent>100)
playerone.talent=100;
if(playertwo.talent>100)
playertwo.talent=100;
	
showstatus(playerone, playertwo,In1,In2,eve,second);//顯示結果
In1="";//指令內容清零
In2="";
if(playerone.energy<=0||playertwo.energy<=0)
break;

}while(f==0);
}

//勝者判斷
showstatus(playerone, playertwo,In1,In2,eve,second);
if(playerone.energy>playertwo.energy)
System.out.println("玩家一獲勝!!!");
else if(playerone.energy<playertwo.energy)
System.out.println("玩家二獲勝!!!");
else if(playerone.energy==playertwo.energy)
System.out.println("平手");


}

//顯示結果
static void showstatus(wizard x, wizard y, String a, String b,String e,int sec){
System.out.println("");
System.out.println("      第"+sec+"回合");
System.out.println("");
switch(e)
{case "hippogrif":
System.out.println("本回合發生隨機事件: hippogrif");
System.out.println("從鷹馬馬背上摔下來，雙方玩家體力 -15");
System.out.println("");
break;
case "feast":
System.out.println("本回合發生隨機事件: feast");
System.out.println("開學宴會，雙方玩家體力 +30");
System.out.println("");
break;
case "dementor":
System.out.println("本回合發生隨機事件: dementor");
System.out.println("催狂魔來襲，沒有習得 Expecto Patronum 咒語的玩家會被奪走靈魂，直接死亡");	
System.out.println("");
break;
case "bertiebeans":
System.out.println("本回合發生隨機事件: bertiebeans");
System.out.println("吃到鼻涕口味的柏蒂全口味豆，雙方玩家智力 -5");
System.out.println("");
break;
}

if(a.equals("")&&b.equals(""))
System.out.print("");
else
{
System.out.println("玩家一本回合採取的行動為: "+a);
System.out.println("玩家二本回合採取的行動為: "+b);}

System.out.println("玩家一巫師名稱: "+x.name);
System.out.println("智力: "+x.IQ);
System.out.println("體力: "+x.energy);
System.out.println("狀態: ");
if(x.statusS+x.statusExpel+x.statusPert+x.statusFe+x.statusEl+x.statusIn==0)
System.out.println("平常狀態");
else if((x.statusS+x.statusExpel+x.statusPert+x.statusFe+x.statusEl+x.statusIn==1)&&(x.statusFe==1))
System.out.println("平常狀態");
if(x.statusS!=0)
{System.out.println("*受到Spectumsempra特殊效果影響，每回合體力下降5");System.out.print("    還有"+x.statusS+"回合");}
if(x.statusExpel!=0)	
{System.out.println("*魔杖遭敵方奪走，下回合無法使用任何咒語(防禦型咒語亦無法自動觸發)");System.out.print("    還有"+x.statusExpel+"回合");}	
if(x.statusPert!=0)
{System.out.println("*遭對手石化，下回合無法採取任何行動");System.out.print("    還有"+x.statusPert+"回合");}	
if((x.statusFe!=0)&&(x.statusFe!=1))
{System.out.println("進入福來福喜狀態，學習效果加倍!");System.out.print("    還有"+(x.statusFe-1)+"回合");}
if(x.statusEl!=0)
{System.out.println("使用接骨木魔杖，下回合使用攻擊咒語熟練度+20%!");System.out.print("    還有"+(x.statusEl)+"回合");}
if(x.statusIn!=0)
{System.out.println("使用隱形斗篷，下回合使用防禦咒語熟練度+20%!");System.out.print("    還有"+(x.statusIn)+"回合");}
System.out.println("");
System.out.println("玩家二巫師名稱: "+y.name);
System.out.println("智力: "+y.IQ);
System.out.println("體力: "+y.energy);
System.out.println("狀態: ");
if(y.statusS+y.statusExpel+y.statusPert+y.statusFe+y.statusEl+y.statusIn==0)
System.out.println("平常狀態");
if((y.statusS+y.statusExpel+y.statusPert+y.statusFe+y.statusEl+y.statusIn==1)&&(y.statusFe==1))
System.out.println("平常狀態");
if(y.statusS!=0)
{System.out.println("*受到Spectumsempra特殊效果影響，每回合體力下降5");System.out.print("    還有"+y.statusS+"回合");}
if(y.statusExpel!=0)	
{System.out.println("*魔杖遭敵方奪走，下回合無法使用任何咒語(防禦型咒語亦無法自動觸發)");System.out.print("    還有"+y.statusExpel+"回合");}		
if(y.statusPert!=0)
{System.out.println("*遭對手石化，下回合無法採取任何行動");System.out.print("    還有"+y.statusPert+"回合");}		
if((y.statusFe!=0)&&(y.statusFe!=1))
{System.out.println("進入福來福喜狀態，學習效果加倍!");System.out.print("    還有"+(y.statusFe-1)+"回合");}
if(y.statusEl!=0)
{System.out.println("使用接骨木魔杖，下回合使用攻擊咒語熟練度+20%!");System.out.print("    還有"+(y.statusEl)+"回合");}
if(y.statusIn!=0)
{System.out.println("使用隱形斗篷，下回合使用防禦咒語熟練度+20%!");System.out.print("    還有"+(y.statusIn)+"回合");}
System.out.println("");
}


//判斷該動作是否可被執行
static boolean checkperform(wizard k, String H, Serpensortia gSer, Spectumsempra gSpe, Stupefy gStup, Expelliarmus gExpel, PertrificusTotalus gPert, Impedimenta gImpe, Protego gPro, ExpectoPatronum gExpec, FelixFelicis gFel, ElderWand gEld, InvisibilityCloak gIn, ForgetfulnessPotion gFor){
int ww=0;
if(k.statusPert!=0)
System.out.println("遭到對手石化攻擊，無法採取任何行動。可輸入do nothing繼續遊戲，或game over結束遊戲");	
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
case "game over":
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
case "use Felix Felicis":
     if(gFel.checkuse(k)==false)
      System.out.println("已使用過此道具，不可再次使用");
	 else
      ww=1;
     break;
case "use Elder Wand":
     if(gEld.checkuse(k)==false)
      System.out.println("已使用過此道具，不可再次使用");
	 else
      ww=1;
     break;
case "use Invisibility Cloak":
     if(gIn.checkuse(k)==false)
	 System.out.println("已使用過此道具，不可再次使用");
     else
	 ww=1;
     break;

case "use Forgetfulness Potion":
     if(gFor.checkuse(k)==false)
	 System.out.println("已使用過此道具，不可再次使用");
     else
	 ww=1;
     break;	 
	 
	}}
if(ww==1)
return true;
else 
return false;
}

//執行動作
static void perform(wizard k, wizard o, String H, Serpensortia gSer, Spectumsempra gSpe, Stupefy gStup, Expelliarmus gExpel, PertrificusTotalus gPert, Impedimenta gImpe, Protego gPro, ExpectoPatronum gExpec, Impedimenta od1, Protego od2, FelixFelicis gFel, ElderWand gEld, InvisibilityCloak gIn)
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
	case "game over":
	break;
    case "do nothing":
	System.out.println("什麼也不做~");
    break;
	case "use Felix Felicis":
	gFel.use(k);
	break;
	case "use Elder Wand":
	gEld.use(k);
	break;
	case "use Invisibility Cloak":
	gIn.use(k);
	break;
	}
}	
//改變回合狀態	
static void change(wizard a, wizard b)	
{
 if(a.statusS!=0)	
 a.energy=a.energy-5;	
 if(a.energy<0)
 a.energy=0;
 a.statusS=a.statusS-1;
 a.statusExpel=a.statusExpel-1;
 a.statusPert=a.statusPert-1; 
 a.statusFe=a.statusFe-1;
 a.statusEl=a.statusEl-1;
 a.statusIn=a.statusIn-1;
 b.statusS=a.statusS-1;
 b.statusExpel=a.statusExpel-1;
 b.statusPert=a.statusPert-1;
 b.statusFe=b.statusFe-1; 
 b.statusEl=b.statusEl-1;
 b.statusIn=b.statusIn-1;
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
 if(a.statusFe<0)
 a.statusFe=0;
 if(b.statusFe<0)
 b.statusFe=0;
 if(a.statusEl<0)
 a.statusEl=0;
 if(b.statusEl<0)
 b.statusEl=0;
 if(a.statusIn<0)
 a.statusIn=0;
 if(b.statusIn<0)
 b.statusIn=0;
}
//隨機事件	
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




