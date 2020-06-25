/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro_fisicaapp;

/**
 *
 * @author Ana Pico Solis
 */
class Libro_Fisica {
    
    // Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
        
    //Constructores
    public Libro_Fisica(int pCodigo,String pAutor, String pTitulo, int pAnio_edicion){
      
       codigo=pCodigo; 
       autor=pAutor;
       titulo=pTitulo;
       anio_edicion=pAnio_edicion;
    }
    
    //Metodos
    
        public void setCodigo(int codigo){    
        this. codigo = codigo; /* this puntero que invoca al atributo private codigo*/
    } 
        
       public int getCodigo(){
        return codigo;
    }  
    
      public void setAutor(String autor){
           this.autor=autor ;
       }
     
       public String getAutor(){
        return autor;
    }  
       
  public void setTitulo(String titulo){
        this.titulo = titulo;
    }

     public String getTitulo(){    
        return titulo;
     }
   
     public void setAnio_edicion(int anio_edicion){
        this.anio_edicion = anio_edicion;     
    }
     
    public int getAnio_edicion(){
        return anio_edicion;
    }

    

    
     @Override
    public String toString(){
        return "El libro de física " +titulo+ " con CODIGO: "+codigo+" -- "
                + "tiene " +anio_edicion+ " año de edicion";
                
                        
    }
}


public class Libro_FisicaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Creamos los objetos
         Libro_Fisica libro1=new Libro_Fisica(1, "Fisica general","Fisica fundamental", 1985);
        Libro_Fisica libro2=new Libro_Fisica(2, "Dinámica","Estatica" ,1999);
        Libro_Fisica libro3=new Libro_Fisica(3, "Estatica","Fisica ", 2000);
    
        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        
        
    }
    
}
