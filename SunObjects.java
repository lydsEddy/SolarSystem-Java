 public class SunObjects extends SolarObjects
  {
    SolarSystem window;
	
    public SunObjects(double distance, double angle, double diameter, String col, double speed, SolarSystem window)
      {
	    super(distance, angle, diameter, col, speed);
	    this.window = window;
      }
	
    public void draw()
      {
         //Draws the sun
         window.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getColour());
      }
 }		
