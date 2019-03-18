package org.vms.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {

	public static void takeLog(String classname, String message)
	{
		Logger log=Logger.getLogger(classname);
		DOMConfigurator.configure("./log4j.xml");
		log.info(message);
	}
}
