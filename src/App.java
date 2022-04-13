public class App {
    public static void main(String[] args) throws Exception {
        //Crear un objeto persona en el main.
        Persona persona = new Persona();

        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, 
        persona.setNombre("Juan");
        persona.setEdad(40);
        persona.setTelefono(123987);
        
        //por último muéstralas por consola.
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());


    }
}

//Crear clase Persona.
class Persona{
//Crear variables las privadas edad, nombre y telefono de la clase Persona.    
    private int edad;
    private String nombre;
    private int telefono;
   
 //Crear gets y sets de cada propiedad.  
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}



