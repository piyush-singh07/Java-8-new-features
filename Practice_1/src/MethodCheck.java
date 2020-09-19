import java.util.ArrayList;
import java.util.Iterator;

class Hello
{
}


public class MethodCheck extends Hello {

	public static void main(String[] args) throws ClassNotFoundException {

		Hello m = new MethodCheck();
		

		System.out.println(Class.forName(args[0]).isInstance(m));
		
		ArrayList al = new ArrayList();
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			
		}

	}

}
