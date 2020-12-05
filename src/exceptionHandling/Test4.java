package exceptionHandling;

public class Test4 {
	public static void dataBase() {
		System.out.println("close the database");
	}

	public static void main(String[] args) {
		try {
			int i = 1 / 0;
		}

		finally {

			Test4.dataBase();
		}
	}

}
