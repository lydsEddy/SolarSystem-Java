 public class PlanetObjects extends SolarObjects
 {
   SolarSystem window;

   public PlanetObjects(double distance, double angle, double diameter, String col, double speed, SolarSystem window)
     {
	   super(distance, angle, diameter, col, speed);
	   this.window = window;
     }

   public void draw()
     {
       //Draws all of the planets on to the solar system model
       this.setAngle(this.getAngle() + this.getSpeed());
	   window.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getColour());
     }	
 }
