import java.io.*;
import java.util.Vector;

public class main{
public static void main(String[] args) throws Exception
	{
		String linea="", textoC="";
		String[] info,datos;
//*********************LECTURA DE CIUDADES********************
		try{
      	File archivo = new File ("src\\ciudades.txt");
      	FileReader fr= new FileReader(archivo);
      	BufferedReader bf= new BufferedReader(fr);
      
      	int cantLineas=0;
      	//El ciclo se mantiene hasta que no hayan lineas que leer
          while((linea = bf.readLine()) != null){ 
        	  textoC=textoC+linea;
        	  textoC= textoC+"< ";
          }//Cierre del while
          info=textoC.split("< ");
          
     
          
         Vector<String> ciudades= new Vector <String>();
          int contador=0;
          for (int i=0; i<info.length ; i++){
        	  datos= info[i].split(" ");
        	  /*System.out.println(datos[0]);
        	  System.out.println(datos[1]);
        	  System.out.println(datos[2]);*/
        	 
        	  if (ciudades.contains(datos[0]) == false){
        		  ciudades.add(datos[0]);
        	  }
        	  if(ciudades.contains(datos[1]) == false){
        		  ciudades.add(datos[1]);
        	  }
        	  
        	 
          }
          
          for (int j=0; j<ciudades.capacity(); j++){
        	  System.out.println(ciudades.get(j));
          }
       	  
          
     		/* for (int k=0; k<ciudades.length; k++){
     			 System.out.println(ciudades[k]);
     			 if (ciudades[k]== null){
     				 break;
     			 }*/
		}
		
		//Cierre del try
        catch(Exception e){ //En caso que no pueda leerse el archivo
     	   System.err.println( "ARCHIVO NO ENCONTRADO" );
       } //Cierre del Catch
		
	
		
		
		
		
		
	}
}
