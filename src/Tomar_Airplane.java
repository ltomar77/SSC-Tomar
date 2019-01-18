import java.util.ArrayList;

import com.sun.javafx.scene.control.skin.SeparatorSkin;

/*
 * Author Name: Levar Tomar
 * Date: 1/13/19
 * Program Name: Tomar_Airplane
 * Purpose: Simulation using "call" button, call attendant
 */
/*UI*/
public class Tomar_Airplane {
	private static int seatLights = 5;

	/* Declares */
	private static ArrayList<Airplane_Passanger> seats = new ArrayList<Airplane_Passanger>();

	public static void turnOffLights() {
		// check if light is on.
		for (int i = 0; i < seats.size(); i++) {
			if (seats.get(i).isSeatLightOn()) {
				// System.out.println(seatLights + "Lights is ON");
				seats.get(i).lightsOff();
			}
		}

	}

	public static void main(String[] args) {

		/* Loop that makes the Passenger seats */
		for (int i = 0; i < seatLights; i++) {

			// System.out.println(i + 1);
			/* initaliz */
			Airplane_Passanger temp = new Airplane_Passanger(i + 1, false);

			seats.add(temp);
			System.out.println(temp.toString());
		}

		/* Test UI seat call attendent */
		seats.get(0).callAttendent();
		// seats.get(1).callAttendent();
		seats.get(2).callAttendent();
		// seats.get(3).callAttendent();
		seats.get(4).callAttendent();
		/* Displays the seats */
		// for (int i = 0; i < seats.size(); i++) {
		System.out.println(seats);

		// }
		turnOffLights();
		System.out.println(seats);
	}

}
