
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a task that inserts a number of people in a list.
 * 
 * @author
 */
class PushPeopleToList implements Runnable {

	/**
	 * Number of people to insert.
	 */
	private int numberOfPeople;

	/**
	 * Class constructor.
	 * 
	 * @paramnumberOfPeople people to insert.
	 */
	public PushPeopleToList(int numberOfPeople) {
		
	}

	@Override
	public void run() {
		System.out.println("Starting to push people to an ArrayList");

		// TODO: Crea un ArrayList. A continuación, dentro de un bucle con el
		// mismo número de iteraciones que personas a insertar, crea una espera
		// de medio segundo, crea la persona a insertar e insértala
		System.out.println("Everyone is already in the ArrayList");
	}
}
