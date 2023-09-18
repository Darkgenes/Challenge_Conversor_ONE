
package conversor_temperaturas;

import javax.swing.JOptionPane;

public class temperatura {
	
	convertir_temperaturas temp = new convertir_temperaturas();
	
	public void ConvertirTemperatura() {

      Object[] opciones = {"Grados Celcius (°C)", "Grados Farenheit (°F)", "Kelvin (K)"};
		Object[] opcionesSinSeleccion = new Object[opciones.length - 1];
		String opcion_input = (JOptionPane.showInputDialog(null, "Elije una temperatura de origen", 
		"Temperaturas a cambiar", JOptionPane.PLAIN_MESSAGE, null, opciones, "Selección")).toString();
		// Verificar si se seleccionó una opción y eliminarla del arreglo
		
		if (opcion_input != null) { 
			int j = 0;
			for (int i = 0; i < opciones.length; i++) {
				if (!opciones[i].equals(opcion_input)) {
					opcionesSinSeleccion[j++] = opciones[i];
				}
			}
		}

		String opcion_output = (JOptionPane.showInputDialog(null, 
      "Elije una temperatura de destino", "Temperaturas a cambiar", 
      JOptionPane.PLAIN_MESSAGE, null, opcionesSinSeleccion, "Selección")).toString();
		
		String opcion = opcion_input + " a " + opcion_output;
		String input = JOptionPane.showInputDialog("Ingresa la temperatura a convertir: " + "(" + opcion_input + " a " + opcion_output + ")");
		double value_temp = ValidarNumero(input); //get double value
      System.out.println(opcion);

      switch(opcion) {
         
         case "Grados Celcius (°C) a Grados Farenheit (°F)":
            temp.ConvertirCelciusAFarenheit(value_temp);
            break;
         case "Grados Celcius (°C) a Kelvin (K)":
            temp.ConvertirCelciusAKelvin(value_temp);
            break;
         case "Grados Farenheit (°F) a Grados Celcius (°C)":
            temp.ConvertirFarenheitACelcius(value_temp);
            break;
         case "Grados Farenheit (°F) a Kelvin (K)":
            temp.ConvertirFarenheitAKelvin(value_temp);
            break;
         case "Kelvin (K) a Grados Celcius (°C)":
            temp.ConvertirKelvinACelcius(value_temp);
            break;
         case "Kelvin (K) a Grados Farenheit (°F)":
            temp.ConvertirKelvinAFarenheit(value_temp);
            break;
      }
	}

   public static double ValidarNumero(String input) { //A possible exception
      try {
          double x = Double.parseDouble(input);
          return x;
          } catch (NumberFormatException e) { // e catch info of exception
              return -1.0;
          }
  }
   
}
    