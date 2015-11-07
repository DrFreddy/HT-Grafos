import java.io.*;
import java.util.Vector;

public class main{
public static void main(String[] args) throws Exception
	{
		String linea="", textoC="";
		String[] info,datos;
		Represent_Graph_Adjacency_Matrix graph;
		Grafo<Integer> grafo= new Grafo<Integer>();
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
        	  cantLineas++;
          }//Cierre del while
          info=textoC.split("< ");
         
          int contador=0;
          int nodos=0;
          graph = new Represent_Graph_Adjacency_Matrix(grafo.getCiudades().capacity());
          for (int i=0; i<info.length ; i++){
        	  datos= info[i].split(" ");
        	  /*System.out.println(datos[0]);
        	  System.out.println(datos[1]);
        	  System.out.println(datos[2]);*/
        	 
        	  if (grafo.getCiudades().contains(datos[0]) == false){
        		grafo.addNodo(datos[0]);
        		//grafo.getCiudades().indexOf("");
        	  }
        	  if(grafo.getCiudades().contains(datos[1]) == false){
        		  grafo.addNodo(datos[1]);
        		  //grafo.addVertice(grafo.getCiudades().indexOf(datos[0]), grafo.getCiudades().indexOf(datos[1]), Integer.parseInt(datos[2]));
        		  //graph.makeEdge(grafo.getCiudades().indexOf(datos[0]),grafo.getCiudades().indexOf(datos[1]),Integer.parseInt(datos[2]));
        	  }
        	  if((grafo.getCiudades().indexOf(datos[0])!= -1) && (grafo.getCiudades().indexOf(datos[0])!= -1)){
        		  grafo.addVertice(grafo.getCiudades().indexOf(datos[0]), grafo.getCiudades().indexOf(datos[1]), Integer.parseInt(datos[2]));
        		  //graph.makeEdge(grafo.getCiudades().indexOf(datos[0]),grafo.getCiudades().indexOf(datos[1]),Integer.parseInt(datos[2]));
        	  }
          }
          
         for(int i=0; i<grafo.getCiudades().capacity();i++){
        	 int j=0;
        	 SimplementeEnlazada<Integer> temp = grafo.getListas().get(i);
        	 while(j<grafo.getListas().get(i).size()){
        		 graph.makeEdge(i,temp.getFirst().get(0),temp.getFirst().get(1));
        		 temp.removeFirst();
        		 j++;
         }
         }
          
        
          /*  
          for (int k=0; k< info.length; k++){
        		datos= info[k].split(" ");
        		graph.makeEdge(grafo.getCiudades().indexOf(datos[0]),grafo.getCiudades().indexOf(datos[1]),Integer.parseInt(datos[2]));
        	}*/
             
          
          int v=grafo.getCiudades().capacity();
          System.out.println("The adjacency matrix for the given graph is: ");
          System.out.print("  ");
          for (int i = 0; i <= v; i++)
          System.out.print(i + " ");
          System.out.println();

          for (int i = 0; i <= v; i++) 
          {
              System.out.print(i + " ");
              for (int j = 1; j <= v; j++) 
                  System.out.print(graph.getEdge(i, j) + " ");
              System.out.println();
          }
          
          
          
          
          
		}
		
		//Cierre del try
        catch(Exception e){ //En caso que no pueda leerse el archivo
     	   System.err.println( "ARCHIVO NO ENCONTRADO" );
       } //Cierre del Catch
		
	
		
		
		
		
		
	}
}
