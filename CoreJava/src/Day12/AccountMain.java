package Day12;

public class AccountMain {

	public static void main(String []args ) {
		// TODO Auto-generated method stub
		
		
		Account ac=new Account();
		ac.setAccno(101);
		ac.setAmount(12334);
		ac.setName("nith");
		System.out.println(ac.getAccno());//101
		System.out.println(ac.getAmount());//12334.0
		System.out.println(ac.getName());//nith
	}

}
