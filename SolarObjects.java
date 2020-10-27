/*
 *This class holds initiates the variables that are being used when creating the solar system objects
 */
 
 public class SolarObjects
 {
   private double distance;
   private double angle; 
   private double diameter;
   private String col;
   private double speed;

   public SolarObjects(double distance, double angle, double diameter, String col, double speed){
    this.distance = distance;
	this.angle = angle;
    this.diameter = diameter;
    this.col = col;
    this.speed = speed;
   }

   public double getDistance(){
	return distance;
   }

   public double getAngle(){
	return angle;
   }

   public double getDiameter(){
	return diameter;
   }

   public String getColour(){
	return col;
   }

   public double getSpeed(){
	return speed;
   }
   
   //This method allows the movement of the solar objects to take place
   public void draw(){
	angle += speed;
   }
   
   public void setAngle(double i){
	this.angle = i;
   }
 }
