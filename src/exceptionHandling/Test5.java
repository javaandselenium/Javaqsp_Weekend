package exceptionHandling;

public class Test5 {

	
		public static void dataBase() {
			System.out.println("close the database");
		}

		public static void main(String[] args) {
			try {
				int i = 1 / 0;
			}
			catch(Exception e)
			{
				System.out.println("Handled");
			}

			finally {

				Test4.dataBase();
			}
		}

	}


