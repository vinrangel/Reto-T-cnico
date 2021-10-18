
package concurso_de_preguntas;
import Niveles.Escojer_dificultad;


public class Concurso_de_preguntas {

/**
 autor: Eduardo olivares borja
 *El programa consiste en un concurso de preguntas cada pregunta tiene un valor de 1 pto.  
 * Al correr el codigo tienes que escoger un nivel de dificultad para empezar a jugar.   
 * Cada nivel de dificulta consta de 5 niveles al momento de contestar las preguntas correctamente subiras de nivel,
 apareciendo la siguiente leyenda "Felicidades pasaste al siguiente nivel" dependiendo del nivel que subiste, 
 encaso de no contestar bien las preguntas y no alcanzar los puntos necesario te aparecerá la siguiente leyenda "Suerte para la próxima". 
 *El juego termina cuando aparece la siguiente leyenda "Escribir tu nombre" donde pondrás poner tu marca personal,  
 quedando reflejado en un archivo .xlsx  y en la consola de java. ejemplo "Eduardo  Acumulaste 20 puntos"  
 * Por ultimo el juego te pregunta "¿ Quieres seguir jugando ?" en caso de una afirmación positiva se repite ciclo,  
 en  caso de una afirmación negativa aparecerá la siguiente leyenda "Gracias por participar". */
    
    
    
    public static void main(String[] args) {

          Escojer_dificultad Df= new Escojer_dificultad();
          
          
          Df.dificultad();
          
         
        
          
          
    }

    
    
    
    
    
}
