import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception
	{
		Scanner teclado = new Scanner(System.in);
		String linea="", textoC="";
		String[] info,datos;
		Represent_Graph_Adjacency_Matrix graph;
//*********************LECTURA DE CIUDADES********************
		try{
      	File archivo = new File ("src\\ciudades.txt");
      	FileReader fr= new FileReader(archivo);
      	BufferedReader bf= new BufferedReader(fr);
      
      	System.out.println("BIENVENIDO");
      	int cantLineas=0;
      	//El ciclo se mantiene hasta que no hayan lineas que leer
          while((linea = bf.readLine()) != null){ 
        	  textoC=textoC+linea;
        	  textoC= textoC+"< ";
        	  cantLineas++;
          }//Cierre del while
          info=textoC.split("< ");
          
          
          //Creación del grafo
          GraphMatrix<String, Integer> g = new GraphMatrixDirected<String, Integer>(cantLineas*2);  
          graph= new Represent_Graph_Adjacency_Matrix(cantLineas*2);
          //Agregando vertices y edges
          for (int i=0; i <info.length; i++){
        	  datos= info[i].split(" ");
        	  g.add(datos[0]);
        	  g.add(datos[1]);
        	  g.addEdge(datos[0], datos[1], Integer.parseInt(datos[2]));
        	  //System.out.println(g.indexVertex(datos[0])+" "+g.indexVertex(datos[1]));
        	  graph.makeEdge(g.indexVertex(datos[0]),g.indexVertex(datos[1]),Integer.parseInt(datos[2]));
        	 // System.out.println(graph.getEdge(g.indexVertex(datos[0]),g.indexVertex(datos[1])));
          }
          
   //********************************* IMPRESION DE MATRIZ DE ADYACENCIA ********************************************************
          int v=g.size();
          //System.out.println(g.size());
          System.out.println("La matriz de adyacencia para el grafo dado es: ");
          System.out.print("  ");
          for (int i = 0; i <= v; i++)
          System.out.print(i + " ");
          System.out.println();

          for (int i = 0; i <= v; i++) 
          {
              System.out.print(i + " ");
              for (int j = 0; j <= v; j++) 
                  System.out.print(graph.getEdge(i, j) + " ");
              System.out.println();
          }
          
         int i=0; 
         while(i==0){
        	 System.out.println("\nELJIA UNA DE LAS SIGUIENTES OPCIONES:\n1.Conocer la ruta más corta entre dos ciudades\n2.Conocer la ciudad en el centro del grafo\n3.Modificar el grafo\n4.Salir del Programa");
        	 int opcion = teclado.nextInt();
        	 if(opcion==1){
        		 //SE LLAMA AL ALGORITMO DE FLOYD PARA CONOCER LA RUTA MAS CORTA 
        	 }
        	 else if(opcion==2){
        		 //SE LLAMA AL ALGORITMO PARA CONOCER EL CENTRO DEL GRAFO
        	 }
        	 else if(opcion==3){
        		 System.out.println("Elija una de las siguientes opciones:\n1.Hay tráfico o bloqueo entre dos ciudades\n2.Agregar nueva ruta");
        		 int opcion2 = teclado.nextInt();
        		 teclado.nextLine();
        		 if(opcion2==1){
        			 int b=0;
        			 while(b==0){
	        			 System.out.println("Ingrese el nombre de la primera ciudad");
	        			 String ciudadO = teclado.nextLine();
	        			 if(g.contains(ciudadO)==true){
	        				 b=1;
	        				 int a =0;
	        				 while(a==0){
	        					 System.out.println("Ingrese el nombre de la segunda ciudad");
		        				 String ciudadD = teclado.nextLine();
		        				 if(g.contains(ciudadD)){
		        						 g.addEdge(ciudadO,ciudadD,0);
		        						 graph.makeEdge(g.indexVertex(ciudadO), g.indexVertex(ciudadD), 0);
		        					 	 a=1;
		        				 }
		        				 else 
		        					 System.out.println("Esa ciudad no es valida. Ingrese otra ciudad");
	        				 }
	        			 }
	        			 else
	        				System.out.println("Esa ciudad no es valida. Ingrese otra ciudad");
        			 }
        		 }
        		 else if(opcion2==2){
        			 System.out.println("Ingrese el nombre de la primera ciudad");
        			 String ciudadO = teclado.nextLine();
        			 System.out.println("Ingrese el nombre de la segunda ciudad");
    				 String ciudadD = teclado.nextLine();
    				 System.out.println("Ingrese el nombre de la ditsancia entre las ciudades");
    				 int distancia = teclado.nextInt();
    				 teclado.nextLine();
    				 g.add(ciudadO);
    				 g.add(ciudadD);
    				 g.addEdge(ciudadO, ciudadD, distancia); 
        		 }
        		 int v2=g.size();
                 System.out.println("La matriz de adyacencia para el grafo dado es: ");
                 System.out.print("  ");
                 for (int i2 = 0; i2 <= v2; i2++)
                 System.out.print(i2 + " ");
                 System.out.println();

                 for (int i2 = 0; i2 <= v2; i2++) 
                 {
                     System.out.print(i2 + " ");
                     for (int j2 = 0; j2 <= v2; j2++) 
                         System.out.print(graph.getEdge(i2, j2) + " ");
                     System.out.println();
                 }
        	 }
         }
		}
		
		//Cierre del try
        catch(Exception e){ //En caso que no pueda leerse el archivo
     	   System.err.println( "ARCHIVO NO ENCONTRADO" );
       } //Cierre del Catch
					
}
}

