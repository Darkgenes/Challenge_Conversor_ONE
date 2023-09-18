package conversor_longitudes;

import javax.swing.JOptionPane;

public class longitudes {

    convertir_longitudes temp = new convertir_longitudes();
	
	public void ConvertirLongitud() {

        Object[] opciones = {"Millas (mi)", "Kilometros (km)", "Metros (m)", "Pulgadas (in)", "Pies (ft)"};
		Object[] opcionesSinSeleccion = new Object[opciones.length - 1];
		String opcion_input = (JOptionPane.showInputDialog(null, "Elije una longitud de origen", 
		"longitudes a cambiar", JOptionPane.PLAIN_MESSAGE, null, opciones, "Selección")).toString();
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
        "Elije una longitud de destino", "Longitudes a cambiar", 
        JOptionPane.PLAIN_MESSAGE, null, opcionesSinSeleccion, "Selección")).toString();
		
        String opcion = opcion_input + " a " + opcion_output;
        String input = JOptionPane.showInputDialog("Ingresa la longitud a convertir: " + "(" + opcion_input + " a " + opcion_output + ")");
        double value_long = ValidarNumero(input); //get double value
        //System.out.println(opcion);
        boolean esp = false; //Especial cases

        switch(opcion) {

            //De x a metros
            case "Kilometros (km) a Metros (m)":
                if (value_long >= 0.0) temp.ConvertirKilometrosAMetros(value_long, esp);
                break;
            case "Millas (mi) a Metros (m)":
                if (value_long >= 0.0) temp.ConvertirMillasAMetros(value_long, esp);
                break;
            case "Pulgadas (inc) a Metros (m)":
                if (value_long >= 0.0) temp.ConvertirPulgadasAMetros(value_long, esp);
                break;
            case "Pies (ft) a Metros (m)":
                if (value_long >= 0.0) temp.ConvertirPiesAMetros(value_long, esp);
                break;

            //De metros a
            case "Metros (m) a Kilometros (km)":
                if (value_long >= 0.0) temp.ConvertirMetrosAKilometros(value_long);
                break;
            case "Metros (m) a Millas (mi)":
                if (value_long >= 0.0) temp.ConvertirMetrosAMillas(value_long);
                break;
            case "Metros (m) a Pulgadas (inc)":
                if (value_long >= 0.0) temp.ConvertirMetrosAPulgadas(value_long);
                break; 
            case "Metros (m) a Pies (ft)":
                if (value_long >= 0.0) temp.ConvertirMetrosAPies(value_long);
                break;

            //Especial cases
            //Km
            case "Kilometros (km) a Millas (mi)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirKilometrosAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAMillas(value_long);
                break;
            case "Kilometros (km) a Pulgadas (inc)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirKilometrosAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAPulgadas(value_long);
                break;
            case "Kilometros (km) a Pies (ft)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirKilometrosAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAPies(value_long);
                break;
            
            //Millas
            case "Millas (mi) a Kilometros (km)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirMillasAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAKilometros(value_long);
                break;
            
            case "Millas (mi) a Pulgadas (inc)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirMillasAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAPulgadas(value_long);
                break;
            case "Millas (mi) a Pies (ft)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirMillasAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAPies(value_long);
                break;

            //Pies
            case "Pies (ft) a Kilometros (km)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirPiesAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAKilometros(value_long);
                break;
            case "Pies (ft) a Pulgadas (inc)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirPiesAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAPulgadas(value_long);
                break;
            case "Pies (ft) a Millas (mi)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirPiesAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAMillas(value_long);
                break;

            //Pies
            case "Pulgadas (inc) a Kilometros (km)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirPulgadasAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAKilometros(value_long);
                break;
            case "Pulgadas (inc) a Pies (ft)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirPulgadasAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAPies(value_long);
                break;
            case "Pulgadas (inc) a Millas (mi)":
                esp = true;
                if (value_long >= 0.0) value_long = temp.ConvertirPulgadasAMetros(value_long, esp);
                if (value_long >= 0.0) temp.ConvertirMetrosAMillas(value_long);
                break;
            
            default: //Ningún caso
                System.out.println("Intento inválido");
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
