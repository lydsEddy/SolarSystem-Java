/**
  *This class respresents a point thus a location within the solar system
  */
 public class Point
 {
   private double distance;
   private double angle;
		
   public Point(double distance, double angle)
     {
	  this.distance = distance;
	  this.angle = angle;
     }
	
   public void setDistance(double distance)
     {
	  this.distance = distance;		
     }
		
   public void setAngle(double Angle)
     {
	  this.angle = angle;		
     }
		
   public double getDistance()
     {
	  return distance;		 
     }
		
   public double getAngle()
     {
	  return angle;		
     }
 }
