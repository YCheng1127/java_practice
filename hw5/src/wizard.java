public class wizard{
int potion=5;
String name;
double energy;
double energy0;
int IQ;
int talent;
int statusS=0;//0 平常狀態,非0 Spectumsempra狀態
int statusExpel=0;//0 平常狀態,非0 Expel狀態
int statusPert=0;//0 平常狀態, 非0 Pert狀態
int statusFe=0;//平常狀態,非 Felix Felicis狀態
int statusEl=0;
int statusIn=0;
int type;

public void Griffendorwizard(wizard k){	//設定初始能力值
k.energy=150;
k.energy0=k.energy;
k.IQ=12;
k.talent=30;	
type=1;
}

public void Hufflepuffwizard(wizard k){	
k.energy=120;
k.energy0=k.energy;
k.IQ=12;
k.talent=30;	
type=2;
}

public void Ravenclawwizard(wizard k){	
k.energy=100;
k.energy0=k.energy;
k.IQ=15;
k.talent=30;	
type=3;
}

public void Slytherinwizard(wizard k){	
k.energy=100;
k.energy0=k.energy;
k.IQ=10;
k.talent=40;	
type=4;
}

}


