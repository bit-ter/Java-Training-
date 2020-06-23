interface Human{
	default void breathe(){                     
		System.out.println("Generic breathe");
	}

	 void sleep();
	 void run();
}

interface Dancer extends Human{

	 void dance();
}

interface Singer extends Human{
    void sing();
}
class Dev implements Singer,Dancer{
	@Override
	public void sleep(){                          // scope should never be narrowed   
		System.out.println("Dev's sleep...");
	}

	@Override
	public void run(){                          
		System.out.println("Dev's run...");
	}
	
	@Override
	public void sing(){                            
		System.out.println("Dev can sing");
	}

	@Override
	public void dance(){                           
		System.out.println("Dev can dance");
	}
	
}

class InterfaceTest{
	public static void main(String[] args) {
        Dev d=new Dev();
        d.sleep();
        d.run();
        d.breathe();
        d.sing();
        d.dance();
	}
}
