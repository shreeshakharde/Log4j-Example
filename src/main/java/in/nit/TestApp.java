package in.nit;

import org.apache.log4j.*;
import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

import java.io.IOException;

import org.apache.log4j.*;

public class TestApp {
	
	private static Logger log=Logger.getLogger(TestApp.class);
	
  public static void main(String []args) throws IOException
  {
	 // Layout layout=new HTMLLayout();
	 // Layout layout=new SimpleLayout();
	 // Layout layout=new XMLLayout();
	  Layout layout=new PatternLayout("%d %C %M %m %n");
	  
	  //Appender app=new ConsoleAppender(layout);
	  Appender app=new FileAppender(layout, "C:/mylogs/data.log");
	  
	  log.addAppender(app);
	  
	  //============print messages============
	  
	  log.info("From Info");
	  log.debug("From Debug");
	  log.fatal("From Fatal");
	  log.error("From Error");
	  log.warn("From Warn");
	  
	  
  }

}
