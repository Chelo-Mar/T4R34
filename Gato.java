
/**
 * Write a description of class felino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato {
   private String color;
   private String especie;
   private String tamaño;
   private String nombre;
   private int edad; 
   
   public Gato (String color,String especie,String tamaño,boolean pelo) {
       
       this.color = color;
       this.especie = especie;
       this.tamaño = tamaño;
       this.nombre = nombre;
       this.edad = edad;
    }
   
    public Gato()
    {
        color = "blanco";
        especie = "siames";
        tamaño = "mediano";
        nombre = "azula";
        edad = 2; 
    }
        
    public String saludar()
    {
        String miau;
        miau = "buenos dias";
        return miau;
    }
    
    public String getEspecie()
    {
        return especie;
    
    }
    
    public String getTamaño()
    {
        return tamaño;
    
    }
    
    public String getNombre()
    {
        return nombre;
    
    }
    
    public int  getEdad()
    {
        return edad;
    }   
    
   
}

