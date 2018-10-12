
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a task that inserts a number of people in a text file.
 * 
 * @author
 */
class PushPeopleToFile implements Runnable {

	/**
	 * Number of people to insert.
	 */
	private int numberOfPeople;

	/**
	 * Class constructor.
	 *
	 * @paramnumberOfPeople people to insert.
	 */
	public PushPeopleToFile(int numberOfPeople) {
		
	}

	@Override
	public void run() {
		System.out.println("Starting to push people to a text file");

		//TODO: Crea los objetos necesarios para escribir a fichero de texto en Java. 
		//A continuación, dentro de un bucle con el mismo número de iteraciones
		//que personas a insertar, crea una espera
		//de medio segundo, crea la persona y vuélcala a fichero 
		System.out.println("Everyone is already in a text file");
	}
}
