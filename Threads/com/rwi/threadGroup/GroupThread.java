package com.rwi.threadGroup;

class DemoGroup extends Thread{
	
	DemoGroup(String threadname, ThreadGroup tobj) 
    { 
        super(tobj, threadname); 
        start(); 
    }
	public void run() 
    { 
  
        for (int i = 0; i <=3; i++)  
        { 
            try 
            { 
                Thread.sleep(10); 
            } 
            catch (InterruptedException ex)  
            { 
                System.out.println("Exception encounterted"); 
            } 
        } 
    } 
}  


public class GroupThread extends Thread{

	public static void main(String[] args) {
		
		 ThreadGroup obj = new ThreadGroup("Parent thread group"); 
		  
		 DemoGroup a1 = new DemoGroup("Hell0", obj); 
		 
	     System.out.println("Starting Hello"); 
	     
	     DemoGroup a2 = new DemoGroup("Hii", obj); 
	        
	     System.out.println("Starting Hii"); 
	     
	     System.out.println("Thread Group Name :" +obj.getName());
	     obj.list();
		
	}

}
