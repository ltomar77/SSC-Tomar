/*
 * Author Name: Levar Tomar
 * Date: 1/13/19
 * Program Name: Tomar_Airplane
 * Purpose: Simulation using "call" button, call attendant
 */
/*Data Layer*/
public class Airplane_Passanger {

	private int seat;
	private boolean seatLight;

	public Airplane_Passanger(int seatNum, boolean lightOn) {

		seat = seatNum;
		seatLight = lightOn;
	}

	public void callAttendent() {

		/* This will make the display turn on at attendant panel */

		seatLight = true;/* Turns on light */
		/* System.out.println("SeatLight"); */

	}

	public void lightsOff() {
		seatLight = false;
	}

	// Feedbacks the status of the lights
	public boolean isSeatLightOn() {
		return seatLight;
	}

	/* Each set can call the Attendant */
	// new method to display values
	public String toString() {

		/*
		 * if true light is on else light is off
		 */
		if (seatLight) {
			return "Seat Number " + this.seat + " light is on  ";
		}
		return "Seat Number " + this.seat + " light is  off ";
	}// End of
}
