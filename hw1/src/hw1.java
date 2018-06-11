public class hw1
{public static void main(String args[])
{System.out.println("歡迎使用寶可夢能力值計算系統");
System.out.println("==============================");
System.out.println();
System.out.println("可使用功能 : ");
System.out.println("1. 計算寶可夢 IV 值");
System.out.println("2. 計算寶可夢 CP 值");
System.out.println("3. 計算達到預期CP值的最低等級");
System.out.println();
System.out.println("==============================");
System.out.println();
int apple;//用以儲存a的整數值
int ball;//用以儲存b的整數值
int cat;//用以儲存c的整數值
double a;//寶可夢攻擊數值
double b;//寶可夢防禦數值
double c;//寶可夢體力數值
int button=0;//使程式結束時回到輸入選單所需的變數
System.out.print("請輸入寶可夢個體攻擊數值ATK(0~15的整數) : ");
do
{a=ConsoleIn.readLineDouble();//輸入寶可夢攻擊數值
int a0=(int)a;//儲存a整數值
if(a0==a)//判斷是否為整數
{if(a>15||a<0)//判斷c是否在範圍內
{System.out.print("請重新輸入數值(0~15的整數) : ");
apple=0;}//數值錯誤
else 
{apple=1;}}//數值正確
else
{apple=0;//數值錯誤
System.out.print("請重新輸入數值(0~15的整數) : ");}	
}while(apple==0);//數值錯誤時再次執行do
System.out.print("請輸入寶可夢個體防禦數值DEF(0~15的整數) : ");
do
{b=ConsoleIn.readLineDouble();//輸入寶可夢防禦數值
int b0=(int)b;//儲存b整數值
if(b0==b)//判斷是否為整數
{if(b>15||b<0)//判斷b是否在範圍內
{System.out.print("請重新輸入數值(0~15的整數) : ");
ball=0;}//數值錯誤
else 
{ball=1;}}//數值正確
else
{ball=0;//數值錯誤
System.out.print("請重新輸入數值(0~15的整數) : ");}	
}while(ball==0);//數值錯誤時再次執行do
System.out.print("請輸入寶可夢個體體力數值STA(0~15的整數) : ");
do
{c=ConsoleIn.readLineDouble();//輸入寶可夢體力數值
int c0=(int)c;//儲存c整數值
if(c0==c)
{if(c>15||c<0)//判斷c是否在範圍內
{System.out.print("請重新輸入數值(0~15的整數) : ");
cat=0;}//數值錯誤
else 
{cat=1;}}//數值正確
else
{cat=0;//數值錯誤
System.out.print("請重新輸入數值(0~15的整數) : ");}	
}while(cat==0);//數值錯誤時再次執行do
double ginger;//IV值
double egg;//選項數值
double ham;//等級數值
int hambergar=0;//控制case2中的do-while數值判斷所需的變數
double ham0;//等級整數值
double CP;//欲達到的CP值，最後將儲存所需最低等級數
int CP0;//所需等級數的整數值
int jason=0;//控制case3中的do-while數值判斷所需的變數
int frog=0;//選項值錯誤時，重新輸入所需的變數

do
{
System.out.println();
System.out.println();
System.out.println("      輸入選單");
System.out.println("=====================");
System.out.println();
System.out.println("[0] 結束系統");
System.out.println();
System.out.println("[1] 計算 IV 值");
System.out.println();
System.out.println("[2] 輸入等級計算 CP 值");
System.out.println();
System.out.println("[3] 輸入 CP 值計算最低等級");
System.out.println();
System.out.println("=====================");
System.out.println();
System.out.print("請輸入選項 : ");

do
{egg=ConsoleIn.readLineDouble();//輸入選單
int egg0=(int)egg;//儲存選項整數值
if(egg==egg0)//判斷是否為整數
{
if(egg<=3&&egg>=0)//判斷選項數值是否在範圍內
{frog=0;
	switch(egg0) 
	
	{case 0://選項為0時
		System.out.println();
		System.out.println("-------------------");
		System.out.println("| [0] 結束系統    |");
		System.out.println("-------------------");
		System.out.println();
		System.out.println("感謝您的使用");
		System.exit(0);
		break;
	case 1://選項為1時
	    System.out.println();
		System.out.println("-------------------");
		System.out.println("| [1] 計算 IV 值  |");
		System.out.println("-------------------");
		ginger=(a+b+c)/45*100;//計算IV值
		ginger=(int)ginger;//取整數位
		System.out.println();
		System.out.println("個體攻擊數值ATK = " + a);
		System.out.println();
		System.out.println("個體防禦數值DEF = " + b);
		System.out.println();
		System.out.println("個體體力數值STA = " + c);
		System.out.println();
		System.out.println("寶可夢IV值 = (" + a + "+" + b + "+" + c + ")/45*100% = " + ginger + "%");
		System.out.println();
		{if(ginger<25)//判斷IV值，給出評價
		System.out.println("寶可夢評價: 極差");
		else if(25<=ginger&&ginger<50)
		System.out.println("寶可夢評價: 稍差");
	    else if(50<=ginger&&ginger<75)
		System.out.println("寶可夢評價: 優良");
	    else
		System.out.println("寶可夢評價: 極佳");}
		break;
	case 2://選項為2時
	{System.out.println();
	System.out.println("-----------------------------");
	System.out.println("| [2] 輸入等級計算 CP 值    |");
	System.out.println("-----------------------------");
	System.out.println();
	System.out.print("請輸入等級(1~40的整數) : ");
	do
	{ham=ConsoleIn.readLineDouble();//輸入等級
	ham0=(int)ham;//儲存等級整數值
	if(ham==ham0)//判斷等級數值是否為整數
	{if(ham<=40&&ham>=0)//判斷等級數值是否範圍內	
	hambergar=0;//數值正確
    else
	{hambergar=1;//數值錯誤
    System.out.print("請重新輸入等級數值(1~40的整數) : ");}}
    else
	{hambergar=1;//數值錯誤
    System.out.print("請重新輸入等級數值(1~40的整數) : ");}
	}while(hambergar==1);//數值錯誤時再次執行do
	}
	ham=0.0175*ham+0.09;//計算CP值
	double ikea=(a+100)*(b+100)*(c+100)*(ham)*(ham)/1000;//計算CP值
	System.out.println();
	System.out.print("寶可夢CP值 : " + (int)ikea);
	break;
	case 3:
	System.out.println();
	System.out.println("---------------------------------");
	System.out.println("|  [3] 輸入 CP 值計算最低等級   |");
	System.out.println("---------------------------------");
	System.out.println();
	System.out.print("請輸入欲達到的CP值 : ");
	do
	{CP=ConsoleIn.readLineDouble();//輸入欲達到的CP值
	if(CP<=0)
	{jason=1;//數值錯誤，CP值小於0
    System.out.print("請輸入大於0的數值 : ");}
    else
	jason=0;//數值正確	
	}while(jason==1);//數值錯誤時重新輸入
	CP=Math.sqrt(CP*1000/(a+100)/(b+100)/(c+100));//計算最低等級
	CP=(CP-0.09)/0.0175;//計算最低等級
	CP0=(int)CP;//儲存最低等級的整數值，用以判斷是否要進位
	if(CP<=40&&CP>0)//判斷CP值範圍
	{if(CP0==CP)//判斷是否為整數
	{System.out.print("寶可夢欲達預計CP值的最低等級 : " + CP + "等");}
    else//判斷是否為小數
	{CP=(int)CP+1;//小數進位
	System.out.print("寶可夢欲達預計CP值的最低等級 : " + CP + "等");}
	}
	else if(CP<=0)//判斷最低等級是否低於1等
    System.out.print("寶可夢欲達預計CP值的最低等級 : 1.0 等" );
	else
	System.out.print("無法達到預計CP值");	
	break;}

}
else
{System.out.print("請重新輸入數值 : ");
frog=1;}//選項值錯誤		
}
else
{System.out.print("請重新輸入數值 : ");
frog=1;}//選項值錯誤	
}while(frog==1);//選項值錯誤時重新輸入
}while(button==0);//回到輸入選單
}
}

