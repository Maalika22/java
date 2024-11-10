import java.io.*;       //Importing io package
class Occurance        //defining class
{	public static void main (String args[])	//defining main method
	{
		try				//using try
		{	FileInputStream fis=new FileInputStream("input.txt");	
						//reading from file
			BufferedInputStream bis=new BufferedInputStream(fis);
						//sorting temporary in file
			int i;			//declaring variables
			int occur=0;
			while((i=bis.read())!=-1)	//using while loop
			{
				char a=(char)i;		//using type casting
				if(i==args[0].charAt(0))	//using if condition
				{
					occur++;		//incrementing variable
				}
			}				//closing whlie loop
			System.out.println("The letter "+ args[0].charAt(0)+" occurs "+occur+" times in the file ");
		}	catch(Exception ex)		//using catch
			{System.out.println(ex.getMessage());
			}
	}						//closing main
}							//closing class

