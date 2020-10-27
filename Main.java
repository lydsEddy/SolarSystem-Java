/**
 * This program creates a model of the solar system.
 * @author Lydia Edwards
 */
 public class Main
 {
    public static void main(String[] args)
    {
       SolarSystem window = new SolarSystem(900,900);
	
       //Create new instances for the planets
       PlanetObjects mercury = new PlanetObjects(70,30,10,"LIGHTGREY",4,window); 
       PlanetObjects venus = new PlanetObjects(90,30,10,"GREEN",3,window);	
       PlanetObjects earth = new PlanetObjects(120,30,13,"BLUE",2,window); 
       PlanetObjects mars = new PlanetObjects(170,30,13,"RED",1.2,window);
       PlanetObjects jupiter = new PlanetObjects(220,30,25,"DARKGREY",3,window);
       PlanetObjects saturn = new PlanetObjects(270,30,23,"ORANGE",3.5,window);
       PlanetObjects uranus = new PlanetObjects(360,30,20,"CYAN",3.2,window);
       PlanetObjects neptune = new PlanetObjects(410,30,20,"MAGENTA",1.5,window);
	   
       //Creates the sun, which is at the centre of the system
       SunObjects sun = new SunObjects(0,0,50,"YELLOW",0,window);
	   
       //Create the moon for the earth
       MoonObjects moon = new MoonObjects(20,30,4,"WHITE",4,earth,window);
       
       //Draws out all of the solar system objects	
       while(true)
	   {
	    sun.draw();
        mercury.draw();
	    venus.draw();
	    earth.draw();
	    mars.draw();
	    jupiter.draw();
        saturn.draw();
	    uranus.draw();
	    neptune.draw();
	    moon.draw();
	   
     	window.finishedDrawing();
       }
    }
 }

