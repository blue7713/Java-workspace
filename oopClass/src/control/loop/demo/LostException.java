package control.loop.demo;

class MinorException extends Exception{}
class SeriousException extends Exception{}

public class LostException {
	public static void main(String[] args) throws Exception{
		try {
			System.out.println("In. finally-block");
			
			try {
				throw new SeriousException();
			}
			finally {
				System.out.println("In. finally-block");
			}
		}
		finally {
			System.out.println("Out. finally-block");
			throw new MinorException();		
		}	
	}
}
