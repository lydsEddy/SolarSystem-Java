 public class MoonObjects extends SolarObjects
 {
   SolarSystem window;
   PlanetObjects earth;

   public MoonObjects(double distance, double angle, double diameter, String col, double speed, PlanetObjects earth, SolarSystem window)
    {
       super(distance, angle, diameter, col, speed);
       this.window = window;
       this.earth = earth;
    }
		
   public void draw()
    {
     //Draws the earth's moon
       this.setAngle(this.getAngle() + this.getSpeed());
       window.drawSolarObjectAbout(this.getDistance(), this.getAngle(), this.getDiameter(),this.getColour(), earth.getDistance(), earth.getAngle());
    }		   
 }
