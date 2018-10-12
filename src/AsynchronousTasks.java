
/**
 * Represents a task that inserts a number of people in a list.
 *
 * @author
 */
public class AsynchronousTasks {

	/**
	 * Entry point of the app.
	 *
	 * @paramargs the command line arguments
	 */
	public static void main(String[] args) {
		int numberOfPeople = 20;
		
		//TODO: Crea un hilo para insertar personas en un fichero y ejecútalo.
		
		//Crea otro hilo para insertar personas en una lista y ejecútalo.
		
		Thread t1 = new Thread(new PushPeopleToFile(numberOfPeople));
		t1.start();
		Thread t2 = new Thread(new PushPeopleToList(numberOfPeople));
		t2.start();
	}
}
