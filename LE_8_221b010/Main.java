
public class Main
{
	public static void main(String[] args) {
		Crow crow = new IndianCrow();
		//Swan swan=new IndianSwan();
		CrowAdapter crowadapter=new CrowAdapter(crow);
		client(crowadapter);
	}
	//main ends InheritableThreadLocal//our client is our princess
	public static void client(Swan swan){
	    swan.eat();
	    swan.swim();
	    swan.sing();
	}
}
