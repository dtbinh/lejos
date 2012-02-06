package org.lejos.sample.pilotparams;
import java.io.IOException;

import lejos.util.PilotProps;

/**
 * Use this sample to set the parameters for DifferentialPilot. These values
 * will then work with any sample that uses DifferentialPilot.
 * 
 * @author Lawrie Griffiths
 *
 */
public class PilotParams {

	public static void main(String[] args) throws IOException {
		// Change this to match your robot
		PilotProps p = new PilotProps();
		p.setProperty(PilotProps.KEY_WHEELDIAMETER, "5.6");
		p.setProperty(PilotProps.KEY_TRACKWIDTH, "16.0");
		p.setProperty(PilotProps.KEY_LEFTMOTOR, "A");
		p.setProperty(PilotProps.KEY_RIGHTMOTOR, "C");
		p.setProperty(PilotProps.KEY_REVERSE, "true");
		
		p.storePersistentValues();
	}
}
