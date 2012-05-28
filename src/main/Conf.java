package main;


import java.io.IOException;
import java.util.logging.Level;

import Interfaces.IOutput;

import logging.MyLogger;
import logging.UseLogger;

public class Conf {
	public final static int LEFT_WALL = 0;
	public final static int RIGHT_WALL = 1;
	public final static int TOP_WALL = 2;
	public final static int BOTTOM_WALL = 3;
	private MyLogger _logger;
	private IOutput _output;
	private mazeHandler _mymaze;

	public Conf() {
		setUpLogger();
	}
	
	public IOutput get_output() {
		return _output;
	}

	public void set_output(IOutput output) {
		this._output = output;
	}

	// TODO wird dies noch ben�tigt
	public static int STEPS = 0;

	public static String LOGSTRING = null;
	public boolean STEPMODUS = false;

	public boolean isSTEPMODUS() {
		return STEPMODUS;
	}

	public void setSTEPMODUS(boolean sTEPMODUS) {
		STEPMODUS = sTEPMODUS;
	}



	public static void increseSteps() {
		STEPS = STEPS + 1;
	}

	public void setUpLogger() {

		_logger = new MyLogger();
		try {
			_logger.setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UseLogger.LOGGER.setLevel(Level.ALL);
	}

	public static String getWallName(int i) {

		if (i == 0)
			return "LEFT";
		if (i == 1)
			return "RIGHT";
		if (i == 2)
			return "TOP";
		if (i == 3)
			return "BOTTOM";
		else
			return "NOT A CORRECT WALL DIRECTION!!!!";
	}
	
	
	
	
	

}