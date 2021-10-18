/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author eduardo edd
 */
public class Escojer_dificultad {
        int dato;  
        int num2;
        int puntos =1; 
       char dificultad ;
       
       // ---------------------respuestas--------------------------------------
       
       String []arreglos={"Dificultad 1", "Dificultad 2"};
       String []res= {"60 min","3600 seg","60 seg","1440 min "};
       String []res_2= {res[1],"3600 seg","0.00001 micro segundos","10 min "};
       String []res_3= {"thor","superman","Batman","Flash"};
       String []res_4= {"Hombre araña","Duende verde","Harry Osborn",res_3[3]};
       String []res_5={"Lex Luthor","Mary Jane",res_4[1],res_3[3]};
       String []res_6={"Tormenta","Ghost rider",res_4[1],res_3[3]};
       String []res_7={"Stan Lee","Bob Kane","Kurt Busiek","Jerry Siegel"};
       String []res_8={"Clarence Charles",res_7[1],"Rob Liefeld",res_7[3]};

     String []resA= {"Si","No"};
     String []res_1A= {"Software","Hardware","ninguna de anteriores","Programas"};
     String [] res_2A={"Office","Windows","Teclado","Paint"};
     String [] res_3A={"impresora",res_2A[1],"Word","linux"};
     String [] res_4A={res_2A[2],res_3A[0],"Monitor","Proyector"};
     String [] res_5A={"Audio","Salida","Entrada","ninguna"};
     String [] res_6A={"bocinas","microfono","pantalla tactil",res_4A[3]};
     String [] res_7A={res_2A[3],res_3A[3],"corel Draw",res_3A[2]};  
     String [] res_8A={"Hexadecimal","ASCII","Binario","EBCDIC"};
     String [] res_9A={"Pagina web","link",".doc","niguna"};
     String [] res_10A={"Sistema operativo","anti virus",".doc","niguna"};
     String [] res_11A={"2a Generacion","3a Generacion","1a Generacion","4a Generaciona"};
     String [] res_12A={"5a Generacion","3a Generacion","1a Generacion","4a Generaciona"};
     String [] res_13A={"Isaac Newton","Karel Čapek","Arthur C. Clarke","Isaac Asimov"};
     String [] res_14A={"Mecanica, informatica, electronica","fisica, matematica, electronica","mecanica,fisica,informatica","electricidad,fisica, metematicas"};
     String [] res_15A={"Conductores","asilante","semiconductor","ninguna"};
     String [] res_16A={"multimetro","amperimetro","ociloscopio","cautin"};
     String [] res_17A={"1","2","3","4"};

     
     
     
     
     
     
             
   public void dificultad(){
   
            //dato = JOptionPane.showInputDialog("Inicia el juego escojiendo un nivel de dificultad  \n "  + "\n Nivel 1" + "\n Nivel 2" +"\n Nivel 3");
            //dificultad= dato.charAt(0);

             dato= JOptionPane.showOptionDialog(null,"Para empesar el juego Elije un nivel de dificultad ","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,arreglos,"nivel 1");
             System.out.println("Escojiste el " + arreglos[dato] );


             if(dato ==  0)
             {
              
               //1 
              num2= JOptionPane.showOptionDialog(null,"¿Cuántos minutos tiene una hora?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res,"");
               System.out.println("Tu respuessta es " + res[num2] );
                  if(num2 ==  1)
                     { 
                         puntos++; 
                     }
            //2
               num2= JOptionPane.showOptionDialog(null,"¿Cuanto segundos tiene una hora?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res,"");
               System.out.println("Tu respuessta es " + res[num2] ); 
                    if(num2 ==  1)
                     { 
                         puntos++; 
                     }
               //3
               num2= JOptionPane.showOptionDialog(null,"¿Cuanto segundos tiene un minuto?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res,"");
               System.out.println("Tu respuessta es " + res[num2] ); 
                    if(num2 ==  2)
                     { 
                         puntos++; 
                     }
               //4
               num2= JOptionPane.showOptionDialog(null,"¿Cuantos minutos tiene un dia?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res,"");
               System.out.println("Tu respuessta es " + res[num2] ); 
                 if(num2 ==  3)
                     { 
                         puntos++; 
                     }
             //5
               num2= JOptionPane.showOptionDialog(null,"Cuantos minutos tiene un dia en minecraft","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_2,"");
               System.out.println("Tu respuessta es " + res_2[num2] ); 
                    if(num2 ==  3)
                     { 
                         puntos++; 
                     }
                
             
           // -------------------------------preguntas 2 -------------------------------------------------------------------- 
           
           if(puntos >= 5){
                      
          
          JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguiente nivel 2");

               //6
               num2= JOptionPane.showOptionDialog(null,"¿Personaje de comics que usa capa y lentes?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_3,"");
               System.out.println("Tu respuessta es " + res_3[num2] ); 
               
                        if(num2 ==  1)
                     { 
                         puntos++; 
                     }
             //7
               num2= JOptionPane.showOptionDialog(null,"¿Personaje de comics que usa capa y su emblema es un murcielago?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_3,"");
               System.out.println("Tu respuessta es " + res_3[num2] ); 
               
                  if(num2 ==  2)
                     { 
                         puntos++; 
                     }
                 

             //8
               num2= JOptionPane.showOptionDialog(null,"¿Cuanto tarda flash en dar la vuelta al mundo?", "Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_2,"");
               System.out.println("Tu respuessta es " + res_2[num2] ); 
                        if(num2 ==  2)
                     { 
                         puntos++; 
                     }
               //9
               num2= JOptionPane.showOptionDialog(null,"¿Personaje de comics que es un dios? ","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_3,"");
               System.out.println("Tu respuessta es " + res_3[num2] ); 
                 if(num2 ==  0)
                     { 
                         puntos++; 
                     }
                 //10
                 num2= JOptionPane.showOptionDialog(null,"¿Que personaje usa un martillo como arma ?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_3,"");
               System.out.println("Tu respuessta es " + res_3[num2] ); 
               
                  if(num2 ==  0)
                     { 
                         puntos++; 
                     }  
                //--------------------------------ronda 3------------------------------------------------------------------     
                        JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguiente nivel 3");
                                
                //11
                  num2= JOptionPane.showOptionDialog(null,"¿Personaje con fuerza, rapidez y reflejos proporcionales a una araña ?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_4,"");
                  System.out.println("Tu respuessta es " + res_4[num2] ); 
               
                        if(num2 ==  0)
                     { 
                         puntos++; 
                     }
                 //12   
                  num2= JOptionPane.showOptionDialog(null,"¿Quien es el enemigo del hombre araña?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_4,"");
                  System.out.println("Tu respuessta es " + res_4[num2] ); 
               
                        if(num2 ==  1)
                     { 
                         puntos++; 
                     }
                    //13
                    num2= JOptionPane.showOptionDialog(null,"¿Quien es el mejor amigo de Peter parker?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_4,"");
                    System.out.println("Tu respuessta es " + res_4[num2] ); 
               
                        if(num2 ==  2)
                     { 
                         puntos++; 
                     }
                      //14
                    num2= JOptionPane.showOptionDialog(null,"¿Que personaje es el mas rapido del mundo?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_3,"");
                    System.out.println("Tu respuessta es " + res_3[num2] ); 
               
                        if(num2 ==  3)
                     { 
                         puntos++; 
                     }
                        
                    //15
                    num2= JOptionPane.showOptionDialog(null,"¿Enemigo de superman?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_5,"");
                    System.out.println("Tu respuessta es " + res_5[num2] ); 
               
                        if(num2 ==  0)
                     { 
                         puntos++; 
                     }
                        
                  //------------------------- ronda 4--------------------------------------------------------------------
                                                           
                     if(puntos >= 15){
                     
                     JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguiente nivel 4");
                    
                     //16
                     num2= JOptionPane.showOptionDialog(null,"¿Cómo se llama el creador del hombre araña? ","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_7,"");
                     System.out.println("Tu respuessta es " + res_7[num2] ); 
                               
                      if(num2 ==  0)
                     { 
                         puntos++; 
                     }
                      //17
                     num2= JOptionPane.showOptionDialog(null,"¿Personaje con fuerza sobrehumana, resistencia, durabilidad, agilidad y reflejos debido a la ingesta de la Fórmula Duende?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_5,"");
                     System.out.println("Tu respuessta es " + res_5[num2] ); 
                               
                      if(num2 ==  2)
                     { 
                         puntos++; 
                     }
                      //18
                      num2= JOptionPane.showOptionDialog(null,"¿chica simpatica , pelirroja y de ojos verdes, fue el cuarto amor de Peter Parker, tras Liz Allen, Betty Brant y Gwen Stacy. Hoy es considerada uno de los personajes más importantes de la serie, el hombre araña.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_5,"");
                     System.out.println("Tu respuessta es " + res_5[num2] ); 
                               
                      if(num2 ==  1)
                     { 
                         puntos++; 
                     }
                      //19
                      num2= JOptionPane.showOptionDialog(null,"¿Personaje que puede crear campos eléctricos, magnéticos y electromagnéticos.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_6,"");
                     System.out.println("Tu respuessta es " + res_6[num2] ); 
                               
                      if(num2 ==  0)
                     { 
                         puntos++; 
                     }
                      //20
                     num2= JOptionPane.showOptionDialog(null,"¿Personaje que posee la capacidad de generar, controlar, y proyectar fuego místico a voluntad?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_6,"");
                     System.out.println("Tu respuessta es " + res_6[num2] ); 
                           
                     
                     //------------------------------------ronda 5------------------------------------------------------
                      if(num2 ==  1)
                     { 
                         puntos++; 
                     }
                      
                               }else{
                               
                               JOptionPane.showMessageDialog(null,"Suerte para la proxima");

                               }
                     
                    if(puntos >= 20){
                             JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguiente nivel 5");

                     //21
                     num2= JOptionPane.showOptionDialog(null,"¿Cómo se llama el creador de aquaman?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_7,"");
                     System.out.println("Tu respuessta es " + res_7[num2] );
                     if(num2 ==  2)
                     { 
                         puntos++; 
                     }
                     //22
                     num2= JOptionPane.showOptionDialog(null,"¿Cómo se llama el creador de superman?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_7,"");
                     System.out.println("Tu respuessta es " + res_7[num2] );
                     if(num2 ==  3)
                     { 
                         puntos++; 
                     }
                     
                       //23 
                       //  String []res_7={"Stan Lee","Bob Kane","Kurt Busiek","Jerry Siegel"};

                     num2= JOptionPane.showOptionDialog(null,"¿Cómo se llama el creador de los 4 fantasticos?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_7,"");
                     System.out.println("Tu respuessta es " + res_7[num2] );
                     if(num2 ==  0)
                     { 
                         puntos++; 
                     }
                     
                     //24 

                     num2= JOptionPane.showOptionDialog(null,"¿Cómo se llama unos de los cradores de shazam?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_8,"");
                     System.out.println("Tu respuessta es " + res_8[num2] );
                     if(num2 ==  0)
                     { 
                         puntos++; 
                     }
                     
                        //25

                     num2= JOptionPane.showOptionDialog(null,"¿Es uno de los creadores de Depool?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_8,"");
                     System.out.println("Tu respuessta es " + res_8[num2] );
                     if(num2 ==  2)
                     { 
                         puntos++; 
                     }
                     
        
                    JOptionPane.showMessageDialog(null,"Felicidades completaste el ultimo nivel");

                     
                     }
             
                    }else{
                     JOptionPane.showMessageDialog(null,"Suerte para la proxima");
                    }
                   
                 
           }// if de niveles 
           
             
             //---------------------------Dificultad 2--------------------------------
             //     String []res_1A= {"Software","Hardware","ninguna de anteriores","Programas"};

             if( dato ==1)
             {
                 //1
             num2= JOptionPane.showOptionDialog(null,"¿Es la parte física de la computadora o sistema.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_1A,"");
             System.out.println("Tu respuessta es " + res_1A[num2] );
             if(num2 ==  1)
               { 
                 puntos++; 
                }
             //2
             num2= JOptionPane.showOptionDialog(null,"¿Es la parte Lógica de la computadora (que no se puede tocar)?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_1A,"");
             System.out.println("Tu respuessta es " + res_1A[num2] );
             if(num2 ==  0)
               { 
                 puntos++; 
                }
             
              //3
             num2= JOptionPane.showOptionDialog(null,"¿Es considerado como Hardware?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_2A,"");
             System.out.println("Tu respuessta es " + res_2A[num2] );
             if(num2 ==  2)
               { 
                 puntos++; 
                }
             
             //4
             num2= JOptionPane.showOptionDialog(null,"¿Es un puerto Periférico?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_2A,"");
             System.out.println("Tu respuessta es " + res_2A[num2] );
             if(num2 ==  0)
               { 
                 puntos++; 
                }
             
             //5
             num2= JOptionPane.showOptionDialog(null,"¿Son dispositivos de entrada?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_4A,"");
             System.out.println("Tu respuessta es " + res_4A[num2] );
             if(num2 ==  0)
               { 
                 puntos++; 
                }
             //----------------ronda 2 Dificultad2---------------
             if(puntos >= 5){
             
             JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguiente nivel 2");

             //6
             num2= JOptionPane.showOptionDialog(null,"¿Son dispositivos de Salida?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_4A,"");
             System.out.println("Tu respuessta es " + res_4A[num2] );
             if(num2 ==  3)
               { 
                 puntos++; 
                }
             
             //7
             num2= JOptionPane.showOptionDialog(null,"¿El micrófono es un periférico de....?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_5A,"");
             System.out.println("Tu respuessta es " + res_5A[num2] );
             if(num2 == 2 )
               { 
                 puntos++; 
                }
             //8
             num2= JOptionPane.showOptionDialog(null,"¿Es un periférico de Entrada como de Salida?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_6A,"");
             System.out.println("Tu respuessta es " + res_6A[num2] );
             if(num2 == 2 )
               { 
                 puntos++; 
                }
             
             //9
             num2= JOptionPane.showOptionDialog(null,"¿Es considerado un Sistema Operativo?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_7A,"");
             System.out.println("Tu respuessta es " + res_7A[num2] );
             if(num2 == 1 )
               { 
                 puntos++; 
                }
             //10
             num2= JOptionPane.showOptionDialog(null,"¿Tipo de lenguaje en la computadora que utiliza 0 y 1?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_8A,"");
             System.out.println("Tu respuessta es " + res_8A[num2] );
             if(num2 == 2 )
               { 
                 puntos++; 
                }
             
             if(puntos >= 10){
             //-----------------------------------3 Ronda dificultad 2------------------------------
              JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguiente nivel 3");

             //11
             num2= JOptionPane.showOptionDialog(null,"¿De que manera se le conoce a la dirección de las pagina de internet?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_9A,"");
             System.out.println("Tu respuessta es " + res_9A[num2] );
             if(num2 == 1 )
               { 
                 puntos++; 
                }
              //12
             num2= JOptionPane.showOptionDialog(null,"¿Controla la actividad principal de una computadora?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_10A,"");
             System.out.println("Tu respuessta es " + res_10A[num2] );
             if(num2 == 0 )
               { 
                 puntos++; 
                }
             //13
             num2= JOptionPane.showOptionDialog(null,"¿En cual generación los transistores reemplazan a los tubos de vacío?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_11A,"");
             System.out.println("Tu respuessta es " + res_11A[num2] );
             if(num2 == 0 )
               { 
                 puntos++; 
                }
              //14
             num2= JOptionPane.showOptionDialog(null,"¿ Gran Tamaño, Programación en lenguaje máquina, Tubo al vacío. Son características de cual generación.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_11A,"");
             System.out.println("Tu respuessta es " + res_11A[num2] );
             if(num2 == 2 )
               { 
                 puntos++; 
                }
              //15
             num2= JOptionPane.showOptionDialog(null,"¿la siguiente generación están basados ​​en inteligencia artificial, aún están en desarrollo. ?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_12A,"");
             System.out.println("Tu respuessta es " + res_12A[num2] );
             if(num2 ==  0)
               { 
                 puntos++; 
                }
             
             if(puntos >= 15){
             //-----------------------------------4 Ronda dificultad 2------------------------------

             JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguien nivel 4");
                //16
             num2= JOptionPane.showOptionDialog(null,"¿El desarrollo del circuito integrado fue el sello distintivo, de cual generación hablamos?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_12A,"");
             System.out.println("Tu respuessta es " + res_12A[num2] );
             if(num2 ==  1)
               { 
                 puntos++; 
                }
             
               //17
             num2= JOptionPane.showOptionDialog(null,"¿El microprocesador trajo la siguiente generación de ordenadores menciona cual es?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_12A,"");
             System.out.println("Tu respuessta es " + res_12A[num2] );
             if(num2 ==  3)
               { 
                 puntos++; 
                }
                 
                  //18
             num2= JOptionPane.showOptionDialog(null,"¿La palabra robótica fue acuñada por el escritor de ciencia ficción.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_13A,"");
             System.out.println("Tu respuessta es " + res_13A[num2] );
             if(num2 ==  1)
               { 
                 puntos++; 
                }
             
                 //19
             num2= JOptionPane.showOptionDialog(null,"¿Cuáles son las 3 áreas básicas que combina la Robótica?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_14A,"");
             System.out.println("Tu respuessta es " + res_14A[num2] );
             if(num2 == 0)
               { 
                 puntos++; 
                }
                //20
             num2= JOptionPane.showOptionDialog(null,"¿Son aquellos materiales que facilitan el paso de la energía eléctrica.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_15A,"");
             System.out.println("Tu respuessta es " + res_15A[num2] );
             if(num2 == 0)
               { 
                 puntos++; 
                }
             
             }else{
                     JOptionPane.showMessageDialog(null,"Suerte para la proxima");
                    }
             
              if(puntos >= 20){
           //-----------------------------------5 Ronda dificultad 2------------------------------

                           JOptionPane.showMessageDialog(null,"Felicidades pasaste al siguiente nivel 5");

                //21
             num2= JOptionPane.showOptionDialog(null,"¿Son materiales que pueden funcionar como conductores eléctricos o no conductores.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_15A,"");
             System.out.println("Tu respuessta es " + res_15A[num2] );
             if(num2 == 2)
               { 
                 puntos++; 
                }
             //22
             num2= JOptionPane.showOptionDialog(null,"¿Son aquellos materiales que dificultan el paso de la energía eléctrica?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_15A,"");
             System.out.println("Tu respuessta es " + res_15A[num2] );
             if(num2 == 1)
               { 
                 puntos++; 
                }
              //23
             num2= JOptionPane.showOptionDialog(null,"¿Es un instrumento de visualización electrónico para la representación gráfica de señales eléctricas que pueden variar en el tiempo.?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_16A,"");
             System.out.println("Tu respuessta es " + res_16A[num2] );
             if(num2 == 2)
               { 
                 puntos++; 
                }
              //24
             num2= JOptionPane.showOptionDialog(null,"¿Es una herramienta eléctrica usada para soldar ?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_16A,"");
             System.out.println("Tu respuessta es " + res_16A[num2] );
             if(num2 == 3)
               { 
                 puntos++; 
                } 
              //25
             num2= JOptionPane.showOptionDialog(null,"¿cuantos tipos de corriente existen ?","Elije", 0, JOptionPane.QUESTION_MESSAGE,null,res_17A,"");
             System.out.println("Tu respuessta es " + res_17A[num2] );
             if(num2 == 1)
               { 
                 puntos++; 
                } 
                                 JOptionPane.showMessageDialog(null,"Felicidades completaste el ultimo nivel");

             
              }
              else{
                     JOptionPane.showMessageDialog(null,"Suerte para la proxima");
                    }
              
             }else{
                     JOptionPane.showMessageDialog(null,"Suerte para la proxima");
                    }
             
             
             
             }else{
                     JOptionPane.showMessageDialog(null,"Suerte para la proxima");
                    }//if de primeros 5
             
             
             
             }
             
               else{
                         JOptionPane.showMessageDialog(null,"Gracias por participar");
               }
             
             

             
             
      //-----------------------------registro de puntos  y marca personal-----------------------       
                      
            System.out.println("Acumulaste " + puntos + "  puntos" );
           String nombre="";
              nombre = JOptionPane.showInputDialog("Escribir tu nombre " );
                          System.out.println(nombre  + "  Acumulaste "+ puntos + " puntos" );
              
          
           Workbook libro = new XSSFWorkbook();
           Sheet hoja = libro.createSheet("hola java");
           
           Row fila0 = hoja.createRow(0);
           fila0.createCell(0).setCellValue("Nombre");
           fila0.createCell(1).setCellValue("Puntos");

           
           Row fila1 = hoja.createRow(1);
           
           fila1.createCell(0).setCellValue(nombre);
           fila1.createCell(1).setCellValue(puntos);

           try{
               FileOutputStream archivo = new FileOutputStream("Nivel_1.xlsx"); 
               libro.write(archivo);
               archivo.close();
               
           }catch(Exception ex){
               System.err.println("Error, " + ex);
   
   }
     }
       }// final de Escojer_dificultad 
