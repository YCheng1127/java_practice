import java.util.Scanner;
public class hw2{
public static void main (String [] args){
Scanner keyboard = new Scanner(System.in);

int[][] plate = new int[2][6];//宣告十二個棋洞
int spin=0;//switch所需的變數		
int sum=0, sumB=0;//儲存玩家一與玩家二的棋盤上棋子總數
int scoreA, scoreB;//紀錄玩家一與玩家二的分數
scoreA=0;//歸零
scoreB=0;//歸零
System.out.println("Oware西非播棋遊戲");
System.out.println("     歡迎使用");
System.out.println();
System.out.println("1-1~1-6為玩家一的棋盤");
System.out.println("2-1~2-6為玩家二的棋盤");
switch(spin){//使用switch以隨時結算分數，break，結束遊戲	
	case 0:{
	
	
	for(int i=0;i<=1;i=i+1){//將十二個棋洞輸入數值4
	  for(int j=0;j<=5;j=j+1){
        plate[i][j]=4;		
	  }
	}	
	
	
	for(int j=0;j<=5;j=j+1)//顯示結果
	System.out.print("  ┌───┐");
    System.out.println();
	for(int j=0;j<=5;j=j+1){
		if(plate[0][j]<10)  
		System.out.print("  │   "+plate[0][j]+"顆│");		
	    else
	    System.out.print("  │  "+plate[0][j]+"顆│");
	  }
	System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ├───┤");
    System.out.println();
	for(int j=1;j<=6;j=j+1)
	System.out.print("  │  1-"+j+" │");
    System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  └───┘");
	System.out.println();
	
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ┌───┐");
    System.out.println();
	for(int j=0;j<=5;j=j+1){
		if(plate[1][j]<10)  
		System.out.print("  │   "+plate[1][j]+"顆│");		
	    else
	    System.out.print("  │  "+plate[1][j]+"顆│");
	  }
	System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ├───┤");
    System.out.println();
	for(int j=1;j<=6;j=j+1)
	System.out.print("  │  2-"+j+" │");
    System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  └───┘");
	System.out.println();
    
	//顯示分數
	System.out.println("玩家一的分數: "+scoreA);
	System.out.println("玩家二的分數: "+scoreB);
	System.out.println();
    
	
	do{
	
	
	
	//嘗試玩家一所有下法，檢查是否一定會造成玩家二無棋可下	
	int check=0; //宣告變數，之後可判斷是否所有下法皆會造成玩家一無棋可下
	int[][] plateshadow = new int[2][6];//宣告模擬用棋洞12個	
	for(int i=0;i<=1;i=i+1)
	    for(int j=0;j<=5;j=j+1)
        	plateshadow[i][j]=plate[i][j];//將棋盤資料填入模擬用棋盤	
    for(int j=0;j<=5;j=j+1)//用for迴圈嘗試玩家一的下法	
	{for(int ig=0;ig<=1;ig=ig+1)
	    for(int jg=0;jg<=5;jg=jg+1)
        	plateshadow[ig][jg]=plate[ig][jg];//將棋盤資料填入模擬用棋盤
		
	 int f1=0;//要嘗試的棋洞為玩家一的棋洞
     int x=plateshadow[0][j]%11;//將預測試的棋洞內棋子除以11的餘數截取下來
	 int q=plateshadow[0][j]/11;//將預測試的棋洞內棋子除以11的整數商截取下來
	 int p=j;//變數p儲存棋洞號碼，以帶入逆時針公式
	 int k=0;//紀錄預測試棋洞的棋數分配變化
	 int[] number=new int[2];//宣告變數，之後可記錄最後一個棋洞
     if(plateshadow[0][j]==0)//如果預測試棋洞為0，則跳過
     continue;		 
		do{ //逆時針旋轉的公式
	switch(f1){
	         case 1://當分配到玩家二的棋盤時
			 for(p=p+1;p<=5;p=p+1)
			 {
				 if(k==x){//當棋子分配完後記錄最後停下的棋洞數，並停止				     
				     
					 number[0]=1;
					 number[1]=p-1;
				     break;}
				     			 
			     try{plateshadow[f1][p]+=1;//使例外被容許，讓程式可被執行
				 k=k+1;}//紀錄棋子數
				 catch(ArrayIndexOutOfBoundsException e)
				{f1=0;
				 break;}
				 
				if(p==5){//更改變數，已切換到玩家一的棋盤
				f1=0;
				p=p+1;
				break;	
				}
	         }
			 if(p==6)//當一開始輸入的號碼在切換點時，更改變數以切換
			 f1=0;	 
			 break;	 
			 
			 case 0://當分配到玩家一的棋盤時
			 for(p=p-1;p>=0;p=p-1)
		     {
				 if(k==x){//當棋子分配完後記錄最後停下的棋洞數，並停止
				     
			         number[0]=0;
					 number[1]=p+1;
				     break;}
				 	 
				 try{plateshadow[f1][p]+=1;//使例外被容許，讓程式可被執行
				 k=k+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				 {f1=1;
				  break;}
				 
				 if(p==0){//當分配到切換點時，更改變數以切換
				 f1=1;
				 p=p-1;
				 break;
				 }
			 }
			 if(p==-1)//當一開始輸入的號碼在切換點時，更改變數以切換
			 f1=1;	 
			 break;
	        
	        }
			if(k==x){//當最後被分配到的棋洞為切換點時，紀錄棋洞
			if(f1==1&p==-1){
					 number[0]=0;
					 number[1]=0;
				    }
			else if(f1==0&p==6){
					 number[0]=1;
					 number[1]=5;
				     }
			}					 
	  }while(k<x);
    
	
	for(int i0=0;i0<=1;i0=i0+1){//將十一個棋洞填入數值 棋數/11
	  for(int j0=0;j0<=5;j0=j0+1){
        plateshadow[i0][j0]=plateshadow[i0][j0]+q;		
	  }
	}
	plateshadow[0][j]=0;//將原棋洞填為0
	
    
	//玩家一獲取分數計算
	int h;
	if(number[0]==1){//如果最後的棋洞在敵人的棋洞時，計算分數
	  for(h=number[1];h>=0;h=h-1){
		if((2<=plateshadow[1][h])&(plateshadow[1][h]<=3)){//若數字為2or3則加分，並歸零
  	    plateshadow[1][h]=0;
		}
		else//遇到不符合的棋洞時什麼也不做，並跳出迴圈
		break; 
		 }  
 	 }
			  
			    //發現預測試下法會使敵方無棋可下時，紀錄check
                if(plateshadow[1][0]+plateshadow[1][1]+plateshadow[1][2]+plateshadow[1][3]+plateshadow[1][4]+plateshadow[1][5]==0)	 
	            check=check+0;
	            else//發現不會使敵方無棋可下時，紀錄在變數check
	            check=check+1;
	
	
	}	
		
		
		
		
		
		
		//玩家一輸入數值
	System.out.print("請玩家一輸入欲移動的棋洞編號(1-1~1-6) (example:move 1-1): ");
    String a="";//宣告String a，以儲存玩家一所輸入的資料
	int a0=0;//宣告變數a0以控制是否重新輸入
	do{//玩家一輸入欲移動的棋洞數值
    a=keyboard.nextLine();
    if(a.length()==8){//玩家一輸入的數值判斷
	   if(a.indexOf("move ")==0&a.indexOf("-")==6&Character.isDigit(a.charAt(5))&Character.isDigit(a.charAt(7))){//判斷是否符合(move 數字-數字)的格式
		int d1=Integer.parseInt(a.substring(5,6)), d2=Integer.parseInt(a.substring(7,8));
		if((1<=d1)&(d1<=1)&(1<=d2)&(d2<=6)){//判斷是否在移動自己棋洞內的棋子
	       d1=d1-1;
		   d2=d2-1;
		   if(plate[d1][d2]>0){//判斷棋洞內是否有棋子
	         int totalA=plate[0][0]+plate[0][1]+plate[0][2]+plate[0][3]+plate[0][4]+plate[0][5];//將自己所有棋洞內的棋子加總
			 if(plate[d1][d2]==totalA)//判斷是否為唯一有棋子的棋洞
			 a0=1;//通過
             else if(check==0)//當發現不論怎下都會使敵方無棋可下時，通過
             a0=1;				 
			 else {//測試此下法是否會使敵方無棋可下，會則不通過，不會則通過
              
			    int[][] plateghost = new int[2][6];
                for(int i=0;i<=1;i=i+1)
			      for(int j=0;j<=5;j=j+1)
                  plateghost[i][j]=plate[i][j];					
			  int f1,f2,k,p,x,q;
	f1=Integer.parseInt(a.substring(5,6));
	f2=Integer.parseInt(a.substring(7,8));
	f1=f1-1;
	f2=f2-1;
	k=0;
	p=f2;
	x=plateghost[f1][f2]%11;
	q=plateghost[f1][f2]/11;
	int[] number=new int[2];//紀錄棋數分配最後停下的棋洞數
	do{ 
	switch(f1){
	         case 1://當預測試的棋洞在玩家二的棋盤時
			 for(p=p+1;p<=5;p=p+1)
			 {
				 if(k==x){//當棋子分配完後記錄最後停下的棋洞數，並停止				     
				     
					 number[0]=1;
					 number[1]=p-1;
				     break;}
				     			 
			     try{plateghost[f1][p]+=1;//容許例外，並更正
				 k=k+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				{f1=0;
				 break;}
				 
				if(p==5){//當分配到切換點時，更改變數以切換
				f1=0;
				p=p+1;
				break;	
				}
	         }
			 if(p==6)//當一開始輸入的號碼在切換點時，更改變數以切換
			 f1=0;	 
			 break;	 
			 
			 case 0:
			 for(p=p-1;p>=0;p=p-1)
		     {
				 if(k==x){//當棋子分配完後記錄最後停下的棋洞數，並停止
				     
			         number[0]=0;
					 number[1]=p+1;
				     break;}
				 	 
				 try{plateghost[f1][p]+=1;//容許例外，並更正
				 k=k+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				 {f1=1;
				  break;}
				 
				 if(p==0){//當分配到切換點時，更改變數以切換
				 f1=1;
				 p=p-1;
				 break;
				 }
			 }
			 if(p==-1)//當一開始輸入的號碼在切換點時，更改變數以切換
			 f1=1;	 
			 break;
	        
	        }
			if(k==x){//當最後被分配到的棋洞為切換點時，另外紀錄棋洞
			if(f1==1&p==-1){
					 number[0]=0;
					 number[1]=0;
				    }
			else if(f1==0&p==6){
					 number[0]=1;
					 number[1]=5;
				     }
			}					 
	  }while(k<x);
    
	
	for(int i=0;i<=1;i=i+1){//將十一個棋洞填入數值 棋數/11
	  for(int j=0;j<=5;j=j+1){
        plateghost[i][j]=plateghost[i][j]+q;		
	  }
	}
	plateghost[Integer.parseInt(a.substring(5,6))-1][Integer.parseInt(a.substring(7,8))-1]=0;//將原棋洞填為0
	
    
	//玩家A獲取分數計算
	int h;
	if(number[0]==1){//當預測試的棋洞在玩家二的棋盤時
	  for(h=number[1];h>=0;h=h-1){//依序測試
		if((2<=plateghost[1][h])&(plateghost[1][h]<=3)){//若數字為2or3則加分，並歸零
  	    plateghost[1][h]=0;
		}
		else//什麼也不做，並跳出迴圈
		break; 
		 }  
 	 }
			  
			  
                if(plateghost[1][0]+plateghost[1][1]+plateghost[1][2]+plateghost[1][3]+plateghost[1][4]+plateghost[1][5]==0)//如果此下法會使對手無棋可下，且不是唯一下法
	           {a0=0; System.out.print("不可使對手無棋可下，除非為唯一下法，否則請嘗試移動別的棋洞，請重新輸入: ");}
                else
	            a0=1;//若不會使對手無棋可下，通過	 
			 }  
		
		    }
          		   
		   
		   else{
           a0=0;//不通過
           System.out.print("請重新輸入(此處無棋可下): ");}//當此處無棋可下時
	       }		   
		else{//當輸入不是自己的棋洞時
		a0=0;//不通過
		System.out.print("請重新輸入(玩家一可移動的棋洞為1-1~1-6): ");}
		 }  
      else{//不符規格
		a0=0;//不通過  
	    System.out.print("請重新輸入(example:move 1-1): ");
	      }
	}  
    
	else if(a.equals("game over"))//當輸入game over時
    a0=3;//更改變數，特別通過	

	else{//不符規格，長度超過或太短
	a0=0;//不通過
    System.out.print("請重新輸入(example:move 1-1): ");
	}	
	}while(a0==0);//當不通過時，重複執行	
    
	if(a0==3)//當數入game over時，結算分數，並用break退出遊戲(switch)。
	{scoreA=scoreA+plate[0][0]+plate[0][1]+plate[0][2]+plate[0][3]+plate[0][4]+plate[0][5];//結算分數
     scoreB=scoreB+plate[1][0]+plate[1][1]+plate[1][2]+plate[1][3]+plate[1][4]+plate[1][5];//結算分數
	 System.out.println("結算分數");
	 System.out.println("玩家一的分數為"+scoreA);
     System.out.println("玩家二的分數為"+scoreB);
     if(scoreA>scoreB)//判斷勝負
     System.out.println("恭喜玩家一獲勝!!!");		 
	 else if(scoreA<scoreB)//判斷勝負
     System.out.println("恭喜玩家二獲勝!!!");		 
	 else if(scoreA==scoreB)//平手時
     System.out.print("平手!!!");		
	break;
	}

//截取玩家1輸入數值並進行逆時針分配，變更棋盤
	int f1,f2,k,p,x,q;
	f1=Integer.parseInt(a.substring(5,6));//截取棋洞數
	f2=Integer.parseInt(a.substring(7,8));//截取棋洞數
	f1=f1-1;//轉成Arrayindex形式
	f2=f2-1;//轉成Arrayindex形式
	k=0;//紀錄棋子已分配數量
	p=f2;//儲存玩家一棋洞數
	x=plate[f1][f2]%11;//將玩家一輸入棋洞內棋子數除以11的餘數儲存
	q=plate[f1][f2]/11;//將玩家一輸入棋洞內棋子數除以11的商儲存
	int[] number=new int[2];//紀錄棋數分配最後停下的棋洞數
	do{ //逆時針分配工式
	switch(f1){
	         case 1:
			 for(p=p+1;p<=5;p=p+1)
			 {
				 if(k==x){//當棋子分配完後記錄最後停下的棋洞數，並停止				     
				     
					 number[0]=1;
					 number[1]=p-1;
				     break;}
				     			 
			     try{plate[f1][p]+=1;
				 k=k+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				{f1=0;
				 break;}
				 
				if(p==5){
				f1=0;
				p=p+1;
				break;	
				}
	         }
			 if(p==6)
			 f1=0;	 
			 break;	 
			 
			 case 0:
			 for(p=p-1;p>=0;p=p-1)
		     {
				 if(k==x){//當棋子分配完後記錄最後停下的棋洞數，並停止
				     
			         number[0]=0;
					 number[1]=p+1;
				     break;}
				 	 
				 try{plate[f1][p]+=1;
				 k=k+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				 {f1=1;
				  break;}
				 
				 if(p==0){
				 f1=1;
				 p=p-1;
				 break;
				 }
			 }
			 if(p==-1)
			 f1=1;	 
			 break;
	        
	        }
			if(k==x){
			if(f1==1&p==-1){
					 number[0]=0;
					 number[1]=0;
				    }
			else if(f1==0&p==6){
					 number[0]=1;
					 number[1]=5;
				     }
			}					 
	  }while(k<x);
    
	
	for(int i=0;i<=1;i=i+1){//將十一個棋洞填入數值 棋數/11
	  for(int j=0;j<=5;j=j+1){
        plate[i][j]=plate[i][j]+q;		
	  }
	}
	plate[Integer.parseInt(a.substring(5,6))-1][Integer.parseInt(a.substring(7,8))-1]=0;//將原棋洞填為0
	
    
	//玩家A獲取分數計算
	int h;
	if(number[0]==1){
	  for(h=number[1];h>=0;h=h-1){//順時針從最後的棋洞開始測試
		if((2<=plate[1][h])&(plate[1][h]<=3)){
		scoreA=scoreA+plate[1][h];//加分
  	    plate[1][h]=0;//歸零
		}
		else
		break; 
		 }  
 	 }
	
	
	for(int j=0;j<=5;j=j+1)//顯示結果
	System.out.print("  ┌───┐");
    System.out.println();
	for(int j=0;j<=5;j=j+1){
		if(plate[0][j]<10)  
		System.out.print("  │   "+plate[0][j]+"顆│");		
	    else
	    System.out.print("  │  "+plate[0][j]+"顆│");
	  }
	System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ├───┤");
    System.out.println();
	for(int j=1;j<=6;j=j+1)
	System.out.print("  │  1-"+j+" │");
    System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  └───┘");
	System.out.println();
	
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ┌───┐");
    System.out.println();
	for(int j=0;j<=5;j=j+1){
		if(plate[1][j]<10)  
		System.out.print("  │   "+plate[1][j]+"顆│");		
	    else
	    System.out.print("  │  "+plate[1][j]+"顆│");
	  }
	System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ├───┤");
    System.out.println();
	for(int j=1;j<=6;j=j+1)
	System.out.print("  │  2-"+j+" │");
    System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  └───┘");
	System.out.println();
	
	//顯示分數
	System.out.println("玩家一的分數: "+scoreA);
	System.out.println("玩家二的分數: "+scoreB);
	System.out.println();
	
	sum=plate[1][0]+plate[1][1]+plate[1][2]+plate[1][3]+plate[1][4]+plate[1][5];//紀錄對手棋盤上棋子總數
	
	if(scoreA>25)//判斷玩家一勝利條件，分數是否大於25
	{System.out.print("恭喜玩家一得分超過25，獲得勝利!!!");
    break;}
    if(sum==0)//判斷對手是否還有棋可下
	{System.out.print("玩家二無棋可下，恭喜玩家一獲得勝利!!!");
    break;}	
	
	//輪到玩家二輸入數值
	
	
	//檢查是否一定會造成玩家一無棋可下
	int checkB=0;//  	
	for(int i=0;i<=1;i=i+1)
	    for(int j=0;j<=5;j=j+1)
        	plateshadow[i][j]=plate[i][j];		
    for(int j=0;j<=5;j=j+1)	
	{for(int ig=0;ig<=1;ig=ig+1)
	    for(int jg=0;jg<=5;jg=jg+1)
        	plateshadow[ig][jg]=plate[ig][jg];//複製原棋盤資訊，以做模擬
	int f1B=1;//截取資料，以帶入公式
     int xB=plateshadow[1][j]%11;
	 int qB=plateshadow[1][j]/11;
	 int pB=j;
	 int kB=0;
	 int[] numberB=new int[2];
     if(plateshadow[1][j]==0)//當欲測試棋洞為0時，跳過，避免影響結果
     continue;	
		do{ //逆時針分配公式
	switch(f1B){
	         case 1:
			 for(pB=pB+1;pB<=5;pB=pB+1)
			 {
				 if(kB==xB){//當棋子分配完後記錄最後停下的棋洞數，並停止				     
				     
					 numberB[0]=1;
					 numberB[1]=pB-1;
				     break;}
				     			 
			     try{plateshadow[f1B][pB]+=1;
				 kB=kB+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				{f1B=0;
				 break;}
				 
				if(pB==5){
				f1B=0;
				pB=pB+1;
				break;	
				}
	         }
			 if(pB==6)
			 f1B=0;	 
			 break;	 
			 
			 case 0:
			 for(pB=pB-1;pB>=0;pB=pB-1)
		     {
				 if(kB==xB){//當棋子分配完後記錄最後停下的棋洞數，並停止
				     
			         numberB[0]=0;
					 numberB[1]=pB+1;
				     break;}
				 	 
				 try{plateshadow[f1B][pB]+=1;
				 kB=kB+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				 {f1B=1;
				  break;}
				 
				 if(pB==0){
				 f1B=1;
				 pB=pB-1;
				 break;
				 }
			 }
			 if(pB==-1)
			 f1B=1;	 
			 break;
	        
	        }
			if(kB==xB){
			if(f1B==1&pB==-1){
					 numberB[0]=0;
					 numberB[1]=0;
				    }
			else if(f1B==0&pB==6){
					 numberB[0]=1;
					 numberB[1]=5;
				     }
			}					 
	  }while(kB<xB);
    
	
	for(int i0=0;i0<=1;i0=i0+1){//將十一個棋洞填入數值 棋數/11
	  for(int j0=0;j0<=5;j0=j0+1){
        plateshadow[i0][j0]=plateshadow[i0][j0]+qB;		
	  }
	}
	plateshadow[1][j]=0;//將原棋洞填為0
	
    
	//玩家二獲取分數計算，與棋洞歸零
	int hB;
	if(numberB[0]==0){
	  for(hB=numberB[1];hB<=5;hB=hB+1){
		if((2<=plateshadow[0][hB])&(plateshadow[0][hB]<=3)){
  	    plateshadow[0][hB]=0;
		}
		else
		break; 
		 }  
 	 }
			  
			  //若此下法會使對手無棋可下，紀錄
                if(plateshadow[0][0]+plateshadow[0][1]+plateshadow[0][2]+plateshadow[0][3]+plateshadow[0][4]+plateshadow[0][5]==0)	 
	            checkB=checkB+0;
	            else//若不會使對手無棋可下，紀錄
	            checkB=checkB+1;
	
	
	}	
	
	
	System.out.print("請玩家二輸入欲移動的棋洞編號(2-1~2-6) (example:move 2-1): ");
    String aB="";
	int a0B=0;
	do{//玩家二輸入欲移動的棋洞數值
    aB=keyboard.nextLine();
    if(aB.length()==8){//判斷玩家二輸入的數值長度符合規格
	   if(aB.indexOf("move ")==0&aB.indexOf("-")==6&Character.isDigit(aB.charAt(5))&Character.isDigit(aB.charAt(7))){//判斷玩家二輸入的數值符合格式
		int d1=Integer.parseInt(aB.substring(5,6)), d2=Integer.parseInt(aB.substring(7,8));
		if((2<=d1)&(d1<=2)&(1<=d2)&(d2<=6)){//判斷輸入的數值為玩家二的棋洞
	       d1=d1-1;
		   d2=d2-1;
		   if(plate[d1][d2]>0){//判斷該棋洞是否有棋可下
	         int totalB=plate[1][0]+plate[1][1]+plate[1][2]+plate[1][3]+plate[1][4]+plate[1][5];
			 if(plate[d1][d2]==totalB)//若為唯一選擇
			 a0B=1;//通過	
			 else if(checkB==0)//若已知所有正確下法皆會使對手無棋可下
			 a0B=1;//通過	 
			 else {//測試是否會使對手無棋可下
              
			    int[][] plateghost = new int[2][6];
                for(int i=0;i<=1;i=i+1)
			      for(int j=0;j<=5;j=j+1)
                  plateghost[i][j]=plate[i][j];					
			  int f1B,f2B,kB,pB,xB,qB;
	f1B=Integer.parseInt(aB.substring(5,6));
	f2B=Integer.parseInt(aB.substring(7,8));
	f1B=f1B-1;
	f2B=f2B-1;
	kB=0;
	pB=f2B;
	xB=plateghost[f1B][f2B]%11;
	qB=plateghost[f1B][f2B]/11;
	int[] numberB=new int[2];//紀錄棋數分配最後停下的棋洞數
	do{//逆時針旋轉的公式 
	switch(f1B){
	         case 1:
			 for(pB=pB+1;pB<=5;pB=pB+1)
			 {
				 if(kB==xB){//當棋子分配完後記錄最後停下的棋洞數，並停止				     
				     
					 numberB[0]=1;
					 numberB[1]=pB-1;
				     break;}
				     			 
			     try{plateghost[f1B][pB]+=1;
				 kB=kB+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				{f1B=0;
				 break;}
				 
				if(pB==5){
				f1B=0;
				pB=pB+1;
				break;	
				}
	         }
			 if(pB==6)
			 f1B=0;	 
			 break;	 
			 
			 case 0:
			 for(pB=pB-1;pB>=0;pB=pB-1)
		     {
				 if(kB==xB){//當棋子分配完後記錄最後停下的棋洞數，並停止
				     
			         numberB[0]=0;
					 numberB[1]=pB+1;
				     break;}
				 	 
				 try{plateghost[f1B][pB]+=1;
				 kB=kB+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				 {f1B=1;
				  break;}
				 
				 if(pB==0){
				 f1B=1;
				 pB=pB-1;
				 break;
				 }
			 }
			 if(pB==-1)
			 f1B=1;	 
			 break;
	        
	        }
			if(kB==xB){
			if(f1B==1&pB==-1){
					 numberB[0]=0;
					 numberB[1]=0;
				    }
			else if(f1B==0&pB==6){
					 numberB[0]=1;
					 numberB[1]=5;
				     }
			}					 
	  }while(kB<xB);
    
	
	for(int i=0;i<=1;i=i+1){//將十一個棋洞填入數值 棋數/11
	  for(int j=0;j<=5;j=j+1){
        plateghost[i][j]=plateghost[i][j]+qB;		
	  }
	}
	plateghost[Integer.parseInt(aB.substring(5,6))-1][Integer.parseInt(aB.substring(7,8))-1]=0;//將原棋洞填為0
	
    
	//玩家二獲取分數計算，與玩家一棋洞歸零
	int hB;
	if(numberB[0]==0){
	  for(hB=numberB[1];hB<=5;hB=hB+1){
		if((2<=plateghost[0][hB])&(plateghost[0][hB]<=3)){
	    plateghost[0][hB]=0;
		}
		else
		break; 
		 }  
 	 }
			  
			  
                if(plateghost[0][0]+plateghost[0][1]+plateghost[0][2]+plateghost[0][3]+plateghost[0][4]+plateghost[0][5]==0)//若此下法會使對手無棋可下
	           {a0B=0; System.out.print("不可使對手無棋可下，除非為唯一下法，否則請嘗試移動別的棋洞，請重新輸入: ");}//不通過
                else
	            a0B=1;//通過	 
			 }  
		
		    }
           
		   else{//若此處無棋可下
           a0B=0;//不通過
           System.out.print("請重新輸入(此處無棋可下): ");}
	       }		   
		else{//若輸入棋洞不在自己的棋盤上
		a0B=0;
		System.out.print("請重新輸入(玩家二可移動的棋洞為2-1~2-6): ");}
		 }  
      else{//格式不符規格
		a0B=0;  
	    System.out.print("請重新輸入(example:move 2-1): ");
	      }
	}

    else if(aB.equals("game over"))//當玩家輸入game over時
    a0B=3;//特別通過並紀錄
	
    else{
	a0B=0;//不通過
    System.out.print("請重新輸入(example:move 2-1): ");
	}	
	}while(a0B==0);	//當不通過時，重複執行
	
	if(a0B==3)//當玩家輸入game over時，結算分數，用break退出遊戲(switch)
	{scoreA=scoreA+plate[0][0]+plate[0][1]+plate[0][2]+plate[0][3]+plate[0][4]+plate[0][5];
     scoreB=scoreB+plate[1][0]+plate[1][1]+plate[1][2]+plate[1][3]+plate[1][4]+plate[1][5];
	 System.out.println("結算分數");
	 System.out.println("玩家一的分數為"+scoreA);
     System.out.println("玩家二的分數為"+scoreB);
     if(scoreA>scoreB)//勝負判斷
     System.out.println("恭喜玩家一獲勝!!!");		 
	 else if(scoreA<scoreB)//勝負判斷
     System.out.println("恭喜玩家二獲勝!!!");		 
	 else if(scoreA==scoreB)//勝負判斷
     System.out.print("平手!!!");		
	break;//退出遊戲
	}

//截取玩家2輸入數值並進行逆時針分配，更改棋盤
	int f1B,f2B,kB,pB,xB,qB;//儲存資料，以帶入公式
	f1B=Integer.parseInt(aB.substring(5,6));
	f2B=Integer.parseInt(aB.substring(7,8));
	f1B=f1B-1;
	f2B=f2B-1;
	kB=0;
	pB=f2B;
	xB=plate[f1B][f2B]%11;
	qB=plate[f1B][f2B]/11;
	int[] numberB=new int[2];//紀錄棋數分配最後停下的棋洞數
	do{ //帶入逆時針旋轉公式
	switch(f1B){
	         case 1:
			 for(pB=pB+1;pB<=5;pB=pB+1)
			 {
				 if(kB==xB){//當棋子分配完後記錄最後停下的棋洞數，並停止				     
				     
					 numberB[0]=1;
					 numberB[1]=pB-1;
				     break;}
				     			 
			     try{plate[f1B][pB]+=1;
				 kB=kB+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				{f1B=0;
				 break;}
				 
				if(pB==5){
				f1B=0;
				pB=pB+1;
				break;	
				}
	         }
			 if(pB==6)
			 f1B=0;	 
			 break;	 
			 
			 case 0:
			 for(pB=pB-1;pB>=0;pB=pB-1)
		     {
				 if(kB==xB){//當棋子分配完後記錄最後停下的棋洞數，並停止
				     
			         numberB[0]=0;
					 numberB[1]=pB+1;
				     break;}
				 	 
				 try{plate[f1B][pB]+=1;
				 kB=kB+1;}
				 catch(ArrayIndexOutOfBoundsException e)
				 {f1B=1;
				  break;}
				 
				 if(pB==0){
				 f1B=1;
				 pB=pB-1;
				 break;
				 }
			 }
			 if(pB==-1)
			 f1B=1;	 
			 break;
	        
	        }
			if(kB==xB){
			if(f1B==1&pB==-1){
					 numberB[0]=0;
					 numberB[1]=0;
				    }
			else if(f1B==0&pB==6){
					 numberB[0]=1;
					 numberB[1]=5;
				     }
			}					 
	  }while(kB<xB);
    
	
	for(int i=0;i<=1;i=i+1){//將十一個棋洞填入數值 棋數/11
	  for(int j=0;j<=5;j=j+1){
        plate[i][j]=plate[i][j]+qB;		
	  }
	}
	plate[Integer.parseInt(aB.substring(5,6))-1][Integer.parseInt(aB.substring(7,8))-1]=0;//將原棋洞填為0
	

	//玩家二獲取分數計算，與玩家一棋洞歸零
	int hB;
	if(numberB[0]==0){
	  for(hB=numberB[1];hB<=5;hB=hB+1){
		if((2<=plate[0][hB])&(plate[0][hB]<=3)){
		scoreB=scoreB+plate[0][hB];
  	    plate[0][hB]=0;
		}
		else
		break; 
		 }  
 	 }
	
	
	for(int j=0;j<=5;j=j+1)//顯示結果
	System.out.print("  ┌───┐");
    System.out.println();
	for(int j=0;j<=5;j=j+1){
		if(plate[0][j]<10)  
		System.out.print("  │   "+plate[0][j]+"顆│");		
	    else
	    System.out.print("  │  "+plate[0][j]+"顆│");
	  }
	System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ├───┤");
    System.out.println();
	for(int j=1;j<=6;j=j+1)
	System.out.print("  │  1-"+j+" │");
    System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  └───┘");
	System.out.println();
	
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ┌───┐");
    System.out.println();
	for(int j=0;j<=5;j=j+1){
		if(plate[1][j]<10)  
		System.out.print("  │   "+plate[1][j]+"顆│");		
	    else
	    System.out.print("  │  "+plate[1][j]+"顆│");
	  }
	System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  ├───┤");
    System.out.println();
	for(int j=1;j<=6;j=j+1)
	System.out.print("  │  2-"+j+" │");
    System.out.println();  
	for(int j=0;j<=5;j=j+1)
	System.out.print("  └───┘");
	System.out.println();
	
	//顯示分數
	System.out.println("玩家一的分數: "+scoreA);
	System.out.println("玩家二的分數: "+scoreB);
	System.out.println();
	
	sumB=plate[0][0]+plate[0][1]+plate[0][2]+plate[0][3]+plate[0][4]+plate[0][5];
	
	if(scoreA>25)
	{System.out.print("恭喜玩家二得分超過25，獲得勝利!!!");
    break;}
    if(sumB==0)
	{System.out.print("玩家一無棋可下，恭喜玩家二獲得勝利!!!");
    break;}	
	
	}while(0==0);
	
	}//case的括號
    }//switch的括號
	System.out.println();
    System.out.println("遊戲結束!");
	System.out.print("歡迎再次遊戲~~");
    }
	
}
	