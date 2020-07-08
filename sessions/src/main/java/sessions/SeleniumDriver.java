package sessions;


public class SeleniumDriver {

	
	public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        SeleniumFunctionLibrary mySelenuimObj = new SeleniumFunctionLibrary();
        mySelenuimObj.invokeBrowser();
//        mySelenuimObj.createAccount();
        mySelenuimObj.getCommands();
        System.out.println( "All's done!" );
        
//        mySelenuimObj.closeBrowser();
    }
	
}
