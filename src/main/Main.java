//Packages
package main;

//Imports
import javax.swing.JOptionPane; //Mainly library to be used in this project
import conversor_divisas.divisa;
import conversor_longitudes.longitudes;
import conversor_temperaturas.temperatura;

public class Main {
    public static void main(String[] args) throws Exception {
        //Options for convertion
        divisa help_divisa = new divisa();
        temperatura help_temp = new temperatura();
        longitudes help_longitudes = new longitudes();
        //General
        boolean bucle = true;
        int respuesta;
        while(bucle){
           
            //Easy panel
            String opc = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", 
            JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura", 
            "Conversor de Longitudes"}, "Selección")).toString();
            
            switch(opc) {
                //First case
                case "Conversor de Moneda": //Case money interchange (only positive numbers)
                    help_divisa.seleccion_divisa(); //Object to access "divisa" functions
                    respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?", 
                    "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Selecciona opción Afirmativa");
                    }else{
                        JOptionPane.showMessageDialog(null, "Programa terminado");  
                        bucle = false;                       
                    }
                    break;

                //Second case
                case "Conversor de Temperatura": 
                    help_temp.ConvertirTemperatura();; //Object to access "temperatura" functions
                    respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?", 
                    "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Selecciona opción Afirmativa");
                    }else{
                        JOptionPane.showMessageDialog(null, "Programa terminado");  
                        bucle = false;                       
                    }
                    break;
                //Third case
                case "Conversor de Longitudes": //Only positive numbers
                    help_longitudes.ConvertirLongitud(); //Object to access "longitudes" functions
                    respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?", 
                    "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Selecciona opción Afirmativa");
                    }else{
                        JOptionPane.showMessageDialog(null, "Programa terminado");  
                        bucle = false;                       
                    }
                    break;

                default:
                    System.out.println("Opción no disponible");
                    break;
            }
        }
    }

}
