package june0630;

public class c_11_threadException {

	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
