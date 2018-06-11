import java.util.Scanner;
public class hw3{
	
	
	
	
	
static void showsd(sd k)//顯示外科醫生的狀態
{
System.out.print("外科醫生"+k.name+"    狀態: ");
if(k.status==1)	
System.out.print("閒置");
else if(k.status==4)
System.out.print("透支");	
else 
System.out.print("忙碌");	
System.out.println("    體力值: "+k.energy);
}

static void showpd(pd k)//顯示內科醫生的狀態
{
System.out.print("內科醫生"+k.name+"    狀態: ");
if(k.status==1)	
System.out.print("閒置");
else if(k.status==4)
System.out.print("透支");	
else 
System.out.print("忙碌");	
System.out.println("    體力值: "+k.energy);
}

static void showad(ad k)//顯示麻醉醫生的狀態
{
System.out.print("麻醉醫生"+k.name+"    狀態: ");
if(k.status==1)	
System.out.print("閒置");
else if(k.status==4)
System.out.print("透支");	
else 
System.out.print("忙碌");	
System.out.println("    體力值: "+k.energy);
}

static void shownu(nu k)//顯示護理師的狀態
{
if(k.name==10)
System.out.print("護理師"+k.name+"     狀態: ");	
else
System.out.print("護理師"+k.name+"      狀態: ");
if(k.status==1)	
System.out.print("閒置");
else if(k.status==4)
System.out.print("透支");	
else 
System.out.print("忙碌");	
System.out.println("    體力值: "+k.energy);
}





static void cchoossd(sd a,sd b,sd c)//選取一位外科醫生進行外科手術
{
int[] jas=new int[3];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
int haha=0;


int[] jassd=new int[3];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}


int sf=2;//找到符合人員時，跳出迴圈所需的變數

for(int bb=2;bb>=0;bb=bb-1)//從排列的陣列中，從體力值最高的人員開始嘗試執行
{switch(jassd[bb])
{
case 1:
 sf=a.surgery();
 break; 
case 2:
 sf=b.surgery();		
 break;
 case 3:
 sf=c.surgery();
 break; 
 
 }	
if(sf==1)	//若是成功，跳出迴圈
break;	
}
}

static void cchoossdsee(sd a,sd b,sd c)//選取一位外科醫生進行看診
{
int[] jas=new int[3];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
int haha=0;


int[] jassd=new int[3];//將體力值輸入陣列中
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}

int sf=2;//找到符合人員時，跳出迴圈所需的變數

for(int bb=2;bb>=0;bb=bb-1)//從排列的陣列中，從體力值最高的人員開始嘗試執行
{switch(jassd[bb])
{
case 1:
 sf=a.diagnoze();
 break; 
case 2:
 sf=b.diagnoze();		
 break;
 case 3:
 sf=c.diagnoze();
 break; 
 
 }	
if(sf==1)//若是成功，跳出迴圈	
break;	
}
}

static void echoossd(sd a,sd b,sd c)//緊急情況選取一位外科醫生進行外科手術
{
int[] jas=new int[3];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
int haha=0;


int[] jassd=new int[3];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}


int sf=2;//找到符合人員時，跳出迴圈所需的變數

for(int bb=2;bb>=0;bb=bb-1)//從排列的陣列中，從體力值最高的人員開始嘗試執行
{switch(jassd[bb])
{
case 1:
 sf=a.surgery();
 break; 
case 2:
 sf=b.surgery();		
 break;
 case 3:
 sf=c.surgery();
 break; 
 
 }	
if(sf==1)	
break;	
}


if(sf!=1)//所有人都在一般情況下都不能成功時,從體力最大的開始透支
{for(int bb=2;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.die();
 break; 
case 2:
 sf=b.die();		
 break;
 case 3:
 sf=c.die();
 break; 
 }	
if(sf==1)//成功透支1人	
break;	
}


}	





}

static void cchoospdsee(pd a,pd b,pd c)//選取一位內科醫生進行看診
{
int[] jas=new int[3];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
int haha=0;


int[] jassd=new int[3];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}


int sf=2;//找到符合人員時，跳出迴圈所需的變數

for(int bb=2;bb>=0;bb=bb-1)//排列順序，體力值與編號一起更動
{switch(jassd[bb])
{
case 1:
 sf=a.diagnoze();
 break; 
case 2:
 sf=b.diagnoze();		
 break;
 case 3:
 sf=c.diagnoze();
 break; 
 
 }	
if(sf==1)	
break;	
}

}

static void cchoospd(pd a,pd b,pd c)//選取一位內科醫生進行內科治療
{
int[] jas=new int[3];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
int haha=0;


int[] jassd=new int[3];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}


int sf=2;//找到符合人員時，跳出迴圈所需的變數

for(int bb=2;bb>=0;bb=bb-1)//排列順序，體力值與編號一起更動
{switch(jassd[bb])
{
case 1:
 sf=a.pcure();
 break; 
case 2:
 sf=b.pcure();		
 break;
 case 3:
 sf=c.pcure();
 break; 
 
 }	
if(sf==1)//若是成功，跳出迴圈
break;	
}

}

static void echoospd(pd a,pd b,pd c)//緊急情況選取一位內科醫生進行急救治療
{
int[] jas=new int[3];
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
int haha=0;


int[] jassd=new int[3];
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}


int sf=2;

for(int bb=2;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.emergency();
 break; 
case 2:
 sf=b.emergency();		
 break;
 case 3:
 sf=c.emergency();
 break; 
 
 }	
if(sf==1)	
break;	
}


if(sf!=1)//所有人都不行時,從體力最大的開始透支
{for(int bb=2;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.dieandem();
 break; 
case 2:
 sf=b.dieandem();		
 break;
 case 3:
 sf=c.dieandem();
 break; 
 }	
if(sf==1)//成功透支1人	
break;	
}

//萬一都沒人可用
}	





}

static void cchoosnug(nu a,nu b,nu c,nu d,nu e,nu f,nu g,nu h,nu i,nu j)//選取一位的護理師一般照護
{
int[] jas=new int[10];
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
jas[3]=d.energy;
jas[4]=e.energy;
jas[5]=f.energy;
jas[6]=g.energy;
jas[7]=h.energy;
jas[8]=i.energy;
jas[9]=j.energy;
int haha=0;


int[] jassd=new int[10];
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
jassd[3]=4;
jassd[4]=5;
jassd[5]=6;
jassd[6]=7;
jassd[7]=8;
jassd[8]=9;
jassd[9]=10;

int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}

int sf=2;

for(int bb=9;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.generalcare();
 break; 
case 2:
 sf=b.generalcare();		
 break;
 case 3:
 sf=c.generalcare();
 break; 
case 4:
 sf=d.generalcare();
 break; 
case 5:
 sf=e.generalcare();
 break; 
case 6:
 sf=f.generalcare();
 break; 
case 7:
 sf=g.generalcare();
 break; 
case 8:
 sf=h.generalcare();
break; 
case 9:
 sf=i.generalcare();	 
break;
 case 10:
 sf=j.generalcare();	
 break;
 
 }	
if(sf==1)	
break;	
}






}	

static void cchoosnuo(nu a,nu b,nu c,nu d,nu e,nu f,nu g,nu h,nu i,nu j)//選取一位的護理師手術照護
{
int[] jas=new int[10];
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
jas[3]=d.energy;
jas[4]=e.energy;
jas[5]=f.energy;
jas[6]=g.energy;
jas[7]=h.energy;
jas[8]=i.energy;
jas[9]=j.energy;
int haha=0;


int[] jassd=new int[10];
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
jassd[3]=4;
jassd[4]=5;
jassd[5]=6;
jassd[6]=7;
jassd[7]=8;
jassd[8]=9;
jassd[9]=10;

int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}

int sf=2;

for(int bb=9;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.dieandop();
 break; 
case 2:
 sf=b.dieandop();		
 break;
 case 3:
 sf=c.dieandop();
 break; 
case 4:
 sf=d.dieandop();
 break; 
case 5:
 sf=e.dieandop();
 break; 
case 6:
 sf=f.dieandop();
 break; 
case 7:
 sf=g.dieandop();
 break; 
case 8:
 sf=h.dieandop();
break; 
case 9:
 sf=i.dieandop();	 
break;
 case 10:
 sf=j.dieandop();	
 break;
 
 }	
if(sf==1)	
break;	
}








}	


static void echoosnu(nu a,nu b,nu c,nu d,nu e,nu f,nu g,nu h,nu i,nu j)//緊急情況選取一位的護理師一般照護
{
int[] jas=new int[10];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
jas[3]=d.energy;
jas[4]=e.energy;
jas[5]=f.energy;
jas[6]=g.energy;
jas[7]=h.energy;
jas[8]=i.energy;
jas[9]=j.energy;
int haha=0;


int[] jassd=new int[10];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
jassd[3]=4;
jassd[4]=5;
jassd[5]=6;
jassd[6]=7;
jassd[7]=8;
jassd[8]=9;
jassd[9]=10;

int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}

int sf=2;

for(int bb=9;bb>=0;bb=bb-1)//從排列的陣列中，從體力值最高的人員開始嘗試執行
{switch(jassd[bb])
{
case 1:
 sf=a.generalcare();
 break; 
case 2:
 sf=b.generalcare();		
 break;
 case 3:
 sf=c.generalcare();
 break; 
case 4:
 sf=d.generalcare();
 break; 
case 5:
 sf=e.generalcare();
 break; 
case 6:
 sf=f.generalcare();
 break; 
case 7:
 sf=g.generalcare();
 break; 
case 8:
 sf=h.generalcare();
break; 
case 9:
 sf=i.generalcare();	 
break;
 case 10:
 sf=j.generalcare();	
 break;
 
 }	
if(sf==1)	
break;	
}


if(sf!=1)//所有人都不行時,從體力最大的開始透支
{for(int bb=9;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.dieandge();
 break; 
case 2:
 sf=b.dieandge();		
 break;
 case 3:
 sf=c.dieandge();
 break; 
case 4:
 sf=d.dieandge();
 break; 
case 5:
 sf=e.dieandge();
 break; 
case 6:
 sf=f.dieandge();
 break; 
case 7:
 sf=g.dieandge();
 break; 
case 8:
 sf=h.dieandge();
break; 
case 9:
 sf=i.dieandge();	 
break;
 case 10:
 sf=j.dieandge();	
 break; 
 }	
if(sf==1)//成功透支1人	
break;	
}


}	





}	


static void oechoosnu(nu a,nu b,nu c,nu d,nu e,nu f,nu g,nu h,nu i,nu j)//緊急情況選取一位的護理師進行手術照護
{
int[] jas=new int[10];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
jas[2]=c.energy;
jas[3]=d.energy;
jas[4]=e.energy;
jas[5]=f.energy;
jas[6]=g.energy;
jas[7]=h.energy;
jas[8]=i.energy;
jas[9]=j.energy;
int haha=0;


int[] jassd=new int[10];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
jassd[2]=3;
jassd[3]=4;
jassd[4]=5;
jassd[5]=6;
jassd[6]=7;
jassd[7]=8;
jassd[8]=9;
jassd[9]=10;

int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}

int sf=2;

for(int bb=9;bb>=0;bb=bb-1)//從排列的陣列中，從體力值最高的人員開始嘗試執行
{switch(jassd[bb])
{
case 1:
 sf=a.surgery();
 break; 
case 2:
 sf=b.surgery();		
 break;
 case 3:
 sf=c.surgery();
 break; 
case 4:
 sf=d.surgery();
 break; 
case 5:
 sf=e.surgery();
 break; 
case 6:
 sf=f.surgery();
 break; 
case 7:
 sf=g.surgery();
 break; 
case 8:
 sf=h.surgery();
break; 
case 9:
 sf=i.surgery();	 
break;
 case 10:
 sf=j.surgery();	
 break;
 
 }	
if(sf==1)	
break;	
}


if(sf!=1)//所有人都不行時,從體力最大的開始透支
{for(int bb=9;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.dieandop();
 break; 
case 2:
 sf=b.dieandop();		
 break;
 case 3:
 sf=c.dieandop();
 break; 
case 4:
 sf=d.dieandop();
 break; 
case 5:
 sf=e.dieandop();
 break; 
case 6:
 sf=f.dieandop();
 break; 
case 7:
 sf=g.dieandop();
 break; 
case 8:
 sf=h.dieandop();
break; 
case 9:
 sf=i.dieandop();	 
break;
 case 10:
 sf=j.dieandop();	
 break; 
 }	
if(sf==1)//成功透支1人	
break;	
}

//萬一都沒人可用
}	





}	
	
	
static void cchoosad(ad a,ad b)//選取一位麻醉醫生進行麻醉
{
int[] jas=new int[2];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
int haha=0;


int[] jassd=new int[2];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}


int sf=2;

for(int bb=1;bb>=0;bb=bb-1)//從排列的陣列中，從體力值最高的人員開始嘗試執行
{switch(jassd[bb])
{
case 1:
 sf=a.anesthesia();
 break; 
case 2:
 sf=b.anesthesia();		
 break;

 }	
if(sf==1)	
break;	
}






}	
	
	
	
static void echoosad(ad a,ad b)//緊急情況選取一位麻醉醫生進行麻醉
{
int[] jas=new int[2];//將體力值輸入陣列中
jas[0]=a.energy;
jas[1]=b.energy;
int haha=0;


int[] jassd=new int[2];//將編號輸入陣列中
jassd[0]=1;
jassd[1]=2;
int hahasd;





for(int ia=jas.length-2;ia>=0;ia--)//排列順序，體力值與編號一起更動
{for(int ja=0;ja<=ia;ja++)
	{
		if(jas[ja]>jas[ja+1])
		{haha=jas[ja];
		jas[ja]=jas[ja+1];
		jas[ja+1]=haha;	
		hahasd=jassd[ja];
        jassd[ja]=jassd[ja+1];
        jassd[ja+1]=hahasd;		
		}
	}		
}


int sf=2;

for(int bb=1;bb>=0;bb=bb-1)//從排列的陣列中，從體力值最高的人員開始嘗試執行
{switch(jassd[bb])
{
case 1:
 sf=a.anesthesia();
 break; 
case 2:
 sf=b.anesthesia();		
 break;

 }	
if(sf==1)	
break;	
}


if(sf!=1)//所有人都不行時,從體力最大的開始透支
{for(int bb=1;bb>=0;bb=bb-1)
{switch(jassd[bb])
{
case 1:
 sf=a.dieandan();
 break; 
case 2:
 sf=b.dieandan();		
 break;

 }	
if(sf==1)//成功透支1人	
break;	
}

}	





}	
	

	
static int testmedical(pd a,pd b,pd c,nu a1,nu b1,nu c1,nu d1,nu e1,nu f1,nu g1,nu h1,nu i1,nu j1)//檢查是否有人可以MEDICAL
{int ka=0;
if(a.status==1)//先檢查是否有空
{if(a.energy>=10)//再檢查是否有體力
	ka=ka+1;//如果可以，將人數加一	
else	
ka=ka+0;}
else	
	ka=ka+0;
if(b.status==1)
{if(b.energy>=10)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;
if(c.status==1)
{if(c.energy>=10)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;

int ka2=0;

if(a1.status==1)
{if(a1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;			

if(b1.status==1)
{if(b1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(c1.status==1)
{if(c1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(d1.status==1)
{if(d1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(e1.status==1)
{if(e1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(f1.status==1)
{if(f1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(g1.status==1)
{if(g1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	
	

if(h1.status==1)
{if(h1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	


if(i1.status==1)
{if(i1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;


if(j1.status==1)
{if(j1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;

if(ka>=1&ka2>=1)//如果人數到達所需人數，回傳值
return 100;	
else
return 0;	
}

static int testwrap(sd a,sd b,sd c,nu a1,nu b1,nu c1,nu d1,nu e1,nu f1,nu g1,nu h1,nu i1,nu j1)//檢查是否有人可以WRAP
{int ka=0;
if(a.status==1)//先檢查是否有空
{if(a.energy>=10)//再檢查是否有體力
	ka=ka+1;//如果可以，將人數加一	
else	
ka=ka+0;}
else	
	ka=ka+0;
if(b.status==1)
{if(b.energy>=10)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;
if(c.status==1)
{if(c.energy>=10)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;

int ka2=0;

if(a1.status==1)
{if(a1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;			

if(b1.status==1)
{if(b1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(c1.status==1)
{if(c1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(d1.status==1)
{if(d1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(e1.status==1)
{if(e1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(f1.status==1)
{if(f1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(g1.status==1)
{if(g1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	
	

if(h1.status==1)
{if(h1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	


if(i1.status==1)
{if(i1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;


if(j1.status==1)
{if(j1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;

if(ka>=1&ka2>=1)//如果人數到達所需人數，回傳值
return 100;	
else
return 0;	
}

static int testsurgery(sd a,sd b,sd c,nu a1,nu b1,nu c1,nu d1,nu e1,nu f1,nu g1,nu h1,nu i1,nu j1,ad a2,ad b2)//檢查是否有人可以surgery
{int ka=0;
if(a.status==1)//先檢查是否有空
{if(a.energy>=50)//再檢查是否有體力
	ka=ka+1;//如果可以，將人數加一	
else	
ka=ka+0;}
else	
	ka=ka+0;
if(b.status==1)
{if(b.energy>=50)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;
if(c.status==1)
{if(c.energy>=50)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;
int ka2=0;

if(a1.status==1)
{if(a1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;			

if(b1.status==1)
{if(b1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(c1.status==1)
{if(c1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(d1.status==1)
{if(d1.energy>=30)
	ka2=ka2+1;	
else	
ka=ka+0;}
else	
	ka2=ka2+0;	

if(e1.status==1)
{if(e1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(f1.status==1)
{if(f1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(g1.status==1)
{if(g1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	
	

if(h1.status==1)
{if(h1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	


if(i1.status==1)
{if(i1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;


if(j1.status==1)
{if(j1.energy>=30)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;

int ka3=0;

if(a2.status==1)
{if(a2.energy>=30)
	ka3=ka3+1;	
else	
ka3=ka3+0;}
else	
	ka3=ka3+0;

if(b2.status==1)
{if(b2.energy>=30)
	ka3=ka3+1;	
else	
ka3=ka3+0;}
else	
	ka3=ka3+0;

if(ka>=1&ka2>=3&ka3>=1)//如果人數到達所需人數，回傳值
return 100;
else
return 0;	//如果沒有足夠人數，回傳值
}

static int testchemotherapy(pd a,pd b,pd c,nu a1,nu b1,nu c1,nu d1,nu e1,nu f1,nu g1,nu h1,nu i1,nu j1)//檢查是否有人可以chemotherapy
{int ka=0;
if(a.status==1)//先檢查是否有空
{if(a.energy>=20)//再檢查是否有體力
	ka=ka+1;	//如果可以，將人數加一
else	
ka=ka+0;}
else	
	ka=ka+0;
if(b.status==1)
{if(b.energy>=20)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;
if(c.status==1)
{if(c.energy>=20)
	ka=ka+1;	
else	
ka=ka+0;}
else	
	ka=ka+0;
int ka2=0;

if(a1.status==1)
{if(a1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;			

if(b1.status==1)
{if(b1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(c1.status==1)
{if(c1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(d1.status==1)
{if(d1.energy>=10)
	ka2=ka2+1;	
else	
ka=ka+0;}
else	
	ka2=ka2+0;	

if(e1.status==1)
{if(e1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(f1.status==1)
{if(f1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	

if(g1.status==1)
{if(g1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	
	

if(h1.status==1)
{if(h1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;	


if(i1.status==1)
{if(i1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;


if(j1.status==1)
{if(j1.energy>=10)
	ka2=ka2+1;	
else	
ka2=ka2+0;}
else	
	ka2=ka2+0;

if(ka>=1&ka2>=3)//如果人數到達所需人數，回傳值
return 100;
else
return 0;	//如果沒有足夠人數，回傳值
}

static int etestsurgery(sd a,sd b,sd c,nu a1,nu b1,nu c1,nu d1,nu e1,nu f1,nu g1,nu h1,nu i1,nu j1,ad a2,ad b2)//檢查是否有人可以緊急surgery
{int ka=0;
if(a.status==1)//先檢查是否有空
{if(a.energy>=50)//再檢查是否有體力
	ka=ka+1;	//如果可以，將人數加一
else	
{if(a.gg==0)//如果有空、體力值不足、但是還沒透支過，將人數加一
	ka=ka+1;
else
ka=ka+0;}}
else	
ka=ka+0;

if(b.status==1)
{if(b.energy>=50)
	ka=ka+1;	
else	
{if(b.gg==0)
	ka=ka+1;
else
ka=ka+0;}}
else	
ka=ka+0;

if(c.status==1)
{if(c.energy>=50)
	ka=ka+1;	
else	
{if(c.gg==0)
	ka=ka+1;
else
ka=ka+0;}}
else	
ka=ka+0;

int ka2=0;

if(a1.status==1)
{if(a1.energy>=30)
	ka2=ka2+1;	
else	
{if(a1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;
if(b1.status==1)
{if(b1.energy>=30)
	ka2=ka2+1;	
else	
{if(b1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;	

if(c1.status==1)
{if(c1.energy>=30)
	ka2=ka2+1;	
else	
{if(c1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;

if(d1.status==1)
{if(d1.energy>=30)
	ka2=ka2+1;	
else	
{if(d1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;	

if(e1.status==1)
{if(e1.energy>=30)
	ka2=ka2+1;	
else	
{if(e1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;

if(f1.status==1)
{if(f1.energy>=30)
	ka2=ka2+1;	
else	
{if(f1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;	

if(g1.status==1)
{if(g1.energy>=30)
	ka2=ka2+1;	
else	
{if(g1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;
	

if(h1.status==1)
{if(h1.energy>=30)
	ka2=ka2+1;	
else	
{if(h1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;


if(i1.status==1)
{if(i1.energy>=30)
	ka2=ka2+1;	
else	
{if(i1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;


if(j1.status==1)
{if(j1.energy>=30)
	ka2=ka2+1;	
else	
{if(j1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;

int ka3=0;

if(a2.status==1)
{if(a2.energy>=30)
	ka3=ka3+1;	
else	
{if(a2.gg==0)
	ka3=ka3+1;
else
ka3=ka3+0;}}
else	
ka3=ka3+0;

if(b2.status==1)
{if(b2.energy>=30)
	ka3=ka3+1;	
else	
{if(b2.gg==0)
	ka3=ka3+1;
else
ka3=ka3+0;}}
else	
ka3=ka3+0;
if(ka>=1&ka2>=3&ka3>=1)//如果人數到達所需人數(包含可透支人數)，回傳值
return 100;
else
return 0;	//如果沒有足夠人數，回傳值
}

static int etestfirstaid(pd a,pd b,pd c,nu a1,nu b1,nu c1,nu d1,nu e1,nu f1,nu g1,nu h1,nu i1,nu j1)//檢查是否有人可以緊急surgery
{int ka=0;
if(a.status==1)//先檢查是否有空
{if(a.energy>=30)//再檢查是否有體力
	ka=ka+1;//如果可以，將人數加一	
else	
{if(a.gg==0)//如果有空、體力值不足、但是還沒透支過，將人數加一
	ka=ka+1;
else
ka=ka+0;}}
else	
ka=ka+0;

if(b.status==1)
{if(b.energy>=30)
	ka=ka+1;	
else	
{if(b.gg==0)
	ka=ka+1;
else
ka=ka+0;}}
else	
ka=ka+0;

if(c.status==1)
{if(c.energy>=30)
	ka=ka+1;	
else	
{if(c.gg==0)
	ka=ka+1;
else
ka=ka+0;}}
else	
ka=ka+0;

int ka2=0;

if(a1.status==1)
{if(a1.energy>=10)
	ka2=ka2+1;	
else	
{if(a1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;
if(b1.status==1)
{if(b1.energy>=10)
	ka2=ka2+1;	
else	
{if(b1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;	

if(c1.status==1)
{if(c1.energy>=10)
	ka2=ka2+1;	
else	
{if(c1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;

if(d1.status==1)
{if(d1.energy>=10)
	ka2=ka2+1;	
else	
{if(d1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;	

if(e1.status==1)
{if(e1.energy>=10)
	ka2=ka2+1;	
else	
{if(e1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;

if(f1.status==1)
{if(f1.energy>=10)
	ka2=ka2+1;	
else	
{if(f1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;	

if(g1.status==1)
{if(g1.energy>=10)
	ka2=ka2+1;	
else	
{if(g1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;
	

if(h1.status==1)
{if(h1.energy>=10)
	ka2=ka2+1;	
else	
{if(h1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;


if(i1.status==1)
{if(i1.energy>=10)
	ka2=ka2+1;	
else	
{if(i1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;


if(j1.status==1)
{if(j1.energy>=10)
	ka2=ka2+1;	
else	
{if(j1.gg==0)
	ka2=ka2+1;
else
ka2=ka2+0;}}
else	
ka2=ka2+0;


if(ka>=1&ka2>=2)//如果人數到達所需人數，回傳值
return 100;
else
return 0;	//如果沒有足夠人數，回傳值
}








	
public static void main(String args[]){

System.out.println("歡迎使用醫院模擬遊戲~");
System.out.println("可輸入指令:1.medical 2.wrap 3.surgery 4.chemotherapy ");
System.out.println("           5.emergency-surgery 6.first-aid 7.game over");
System.out.println("");
sd sd1=new sd(1);//宣告3個外科醫生
sd sd2=new sd(2);
sd sd3=new sd(3);	
pd pd1=new pd(1);//宣告3個內科醫生
pd pd2=new pd(2);
pd pd3=new pd(3);
ad ad1=new ad(1);//宣告2個麻醉醫生
ad ad2=new ad(2);
nu nu1=new nu(1);//宣告10個護理師
nu nu2=new nu(2);
nu nu3=new nu(3);
nu nu4=new nu(4);
nu nu5=new nu(5);
nu nu6=new nu(6);
nu nu7=new nu(7);
nu nu8=new nu(8);
nu nu9=new nu(9);
nu nu10=new nu(10);


showsd(sd1);//顯示狀態
showsd(sd2);
showsd(sd3);

showpd(pd1);
showpd(pd2);
showpd(pd3);

shownu(nu1);
shownu(nu2);
shownu(nu3);
shownu(nu4);
shownu(nu5);
shownu(nu6);
shownu(nu7);
shownu(nu8);
shownu(nu9);
shownu(nu10);

showad(ad1);
showad(ad2);
System.out.println("");
int cr=0;//判斷醫院資源是否足夠所需的變數
int endd=0;//game over所需的變數
int ed=0;//switch所需的變數，switch是為了要能夠隨時跳出程式game over
do{
switch(ed)
{
case 0:
System.out.println("請輸入病患所需的醫療手段: ");
Scanner keyboard=new Scanner(System.in);
String a="";
int k=0;

do{//使用者輸入指令
a=keyboard.nextLine();
 if(a.equals("medical")||a.equals("wrap")||a.equals("surgery")||a.equals("chemotherapy")||a.equals("emergency-surgery")||a.equals("first-aid"))//玩家一輸入的數值判斷
	k=1;
 else if(a.indexOf("game over")==0)
    k=2;
 else
 {k=0;

  System.out.println("指令錯誤");
  System.out.println("可輸入指令:1.medical 2.wrap 3.surgery 4.chemotherapy ");
System.out.println("           5.emergency-surgery 6.first-aid 7.game over");
  System.out.print("請重新輸入: ");	
    
 }
 }while(k==0);

 
 
 
 switch(a){//根據指令執行
	case "medical"://指令
	if(testmedical(pd1,pd2,pd3,nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10)==100)//醫院資源足夠值行此指令
	{cchoospdsee(pd1,pd2,pd3);//執行選取人員
	cchoosnug(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	cr=1;}//成功選取，之後可進行回合人員狀態結算
	else 
	{System.out.println("本醫院資源無法醫治該病人，將移轉至其他醫院進行治療");
	cr=0;}//無法治療，不進行回合結算
	break;
	
	case "wrap":
	if(testwrap(sd1,sd2,sd3,nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10)==100)
	{cchoossdsee(sd1,sd2,sd3);
	cchoosnug(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	cr=1;}
	else
	{System.out.println("本醫院資源無法醫治該病人，將移轉至其他醫院進行治療");
	cr=0;}
	break;
	
	case "surgery":
	if(testsurgery(sd1,sd2,sd3,nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10,ad1,ad2)==100)
	{cchoossd(sd1,sd2,sd3);
	 oechoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	 oechoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	 oechoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	 cchoosad(ad1,ad2);
	cr=1;
	}
	else
	{System.out.println("本醫院資源無法醫治該病人，將移轉至其他醫院進行治療");
	cr=0;}
	break;
	
	case "chemotherapy":
	if(testchemotherapy(pd1,pd2,pd3,nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10)==100)
	{cchoospd(pd1,pd2,pd3);
	 cchoosnug(nu1,nu2,nu2,nu4,nu5,nu6,nu7,nu8,nu9,nu10);			
	cr=1;
	}
	else
	{System.out.println("本醫院資源無法醫治該病人，將移轉至其他醫院進行治療");
	cr=0;}
	break;
	
	case "emergency-surgery":
	if(etestsurgery(sd1,sd2,sd3,nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10,ad1,ad2)==100)
	{echoossd(sd1,sd2,sd3);
	 oechoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	 oechoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	 oechoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
	 echoosad(ad1,ad2);
	cr=1;
	}
	else
	{System.out.println("本醫院資源無法醫治該病人，將移轉至其他醫院進行治療");
	cr=0;}
	break;
	
	case "first-aid":
	if(etestfirstaid(pd1,pd2,pd3,nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10)==100)
	{echoospd(pd1,pd2,pd3);
	 echoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);
     echoosnu(nu1,nu2,nu3,nu4,nu5,nu6,nu7,nu8,nu9,nu10);	 
	cr=1;
	}
	else 
	{System.out.println("本醫院資源無法醫治該病人，將移轉至其他醫院進行治療");
	cr=0;}
	break;
	
	case "game over":
	endd=1;
	break;
}
if(endd==1) 	 
break;//跳出程式
	 
if(cr==1)	 
{sd1.checkstatus();//回合結算
sd2.checkstatus();
sd3.checkstatus();
pd1.checkstatus();
pd2.checkstatus();
pd3.checkstatus();

nu1.checkstatus();
nu2.checkstatus();
nu3.checkstatus();
nu4.checkstatus();
nu5.checkstatus();
nu6.checkstatus();
nu7.checkstatus();
nu8.checkstatus();
nu9.checkstatus();
nu10.checkstatus();
ad1.checkstatus();
ad2.checkstatus();
}	 
System.out.println("");//顯示回合過完後，各人員資訊
showsd(sd1);
showsd(sd2);
showsd(sd3);

showpd(pd1);
showpd(pd2);
showpd(pd3);

shownu(nu1);
shownu(nu2);
shownu(nu3);
shownu(nu4);
shownu(nu5);
shownu(nu6);
shownu(nu7);
shownu(nu8);
shownu(nu9);
shownu(nu10);

showad(ad1);
showad(ad2);
System.out.println("");	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}	 
}while(endd==0);	 
System.out.println("程式結束~");	 
System.out.println("感謝您的使用~");	 
	 
	 
	 
	 
	 
}
}