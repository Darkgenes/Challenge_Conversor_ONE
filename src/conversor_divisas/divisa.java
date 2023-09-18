package conversor_divisas;

import javax.swing.JOptionPane;

public class divisa {

	convertir_divisas money = new convertir_divisas();
	
    public void seleccion_divisa () {
    	Object[] opciones = {"Peso Colombiano (COP)", "Dólar Estadounidense (USD)", "Euro (EUR)", "Libras esterlinas (GBP)", "Yen Japonés (JPY)", "Won Surcoreano (KRW)"};
		Object[] opcionesSinSeleccion = new Object[opciones.length - 1];
		String opcion_input = (JOptionPane.showInputDialog(null, "Elije una Divisa de origen", 
		"Monedas a cambiar", JOptionPane.PLAIN_MESSAGE, null, opciones, "Selección")).toString();
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
		"Elije la Divisa de destino", "Monedas resultado", 
		JOptionPane.PLAIN_MESSAGE, null, opcionesSinSeleccion, "Selección")).toString();
		
		String opcion = opcion_input + " a " + opcion_output;
		//System.out.println(opcion);
		String input = JOptionPane.showInputDialog("Ingresa el monto a convertir: " + "(" + opcion_input + " a " + opcion_output + ")");
		double divisa_input = ValidarNumero(input); //get double value
		boolean esp = false; //Especial cases

		switch(opcion) {

			case "Peso Colombiano (COP) a Dólar Estadounidense (USD)":
				if (divisa_input >= 0.0) money.ConvertirPesosADolares(divisa_input);
				break;
            
            case "Peso Colombiano (COP) a Euro (EUR)":
				if (divisa_input >= 0.0) money.ConvertirPesosAEuros(divisa_input);
				break;
            
            case "Peso Colombiano (COP) a Libras esterlinas (GBP)":
				if (divisa_input >= 0.0) money.ConvertirPesosALibras(divisa_input);
				break;
        
            case "Peso Colombiano (COP) a Yen Japonés (JPY)":
				if (divisa_input >= 0.0) money.ConvertirPesosAYen(divisa_input);
				break;
        
            case "Peso Colombiano (COP) a Won Surcoreano (KRW)":
				if (divisa_input >= 0.0) money.ConvertirPesosAWon(divisa_input);
				break; 

			case "Dólar Estadounidense (USD) a Peso Colombiano (COP)":
				if (divisa_input >= 0.0) money.ConvertirDolaresAPesos(divisa_input, esp);
				break;
        
            case "Euro (EUR) a Peso Colombiano (COP)":
				if (divisa_input >= 0.0) money.ConvertirEurosAPesos(divisa_input, esp);
				break;
        
            case "Libras esterlinas (GBP) a Peso Colombiano (COP)":
				if (divisa_input >= 0.0) money.ConvertirLibrasAPesos(divisa_input, esp);
				break;
			
            case "Yen Japonés (JPY) a Peso Colombiano (COP)":
				if (divisa_input >= 0.0) money.ConvertirYenAPesos(divisa_input, esp);
				break;
        
            case "Won Surcoreano (KRW) a Peso Colombiano (COP)":
				if (divisa_input >= 0.0) money.ConvertirWonAPesos(divisa_input, esp);
				break;   
			
			//Casos añadidos
			//Dólar
			case "Dólar Estadounidense (USD) a Euro (EUR)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosADolares(divisa_input);
				break;

			case "Dólar Estadounidense (USD) a Libras esterlinas (GBP)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosALibras(divisa_input);
				break;

			case "Dólar Estadounidense (USD) a Yen Japonés (JPY)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAEuros(divisa_input);
				break;
			
			case "Dólar Estadounidense (USD) a Won Surcoreano (KRW)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAWon(divisa_input);
				break;

			//Euro
			case "Euro (EUR) a Dólar Estadounidense (USD)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosADolares(divisa_input);
				break;

			case "Euro (EUR) a Libras esterlinas (GBP)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosALibras(divisa_input);
				break;

			case "Euro (EUR) a Yen Japonés (JPY)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAEuros(divisa_input);
				break;

			case "Euro (EUR) a Won Surcoreano (KRW)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirEurosAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAWon(divisa_input);
				break;

			//Libra
			case "Libras esterlinas (GBP) a Dólar Estadounidense (USD)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirLibrasAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosADolares(divisa_input);
				break;

			case "Libras esterlinas (GBP) a Euro (EUR)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirLibrasAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAEuros(divisa_input);
				break;

			case "Libras esterlinas (GBP) a Yen Japonés (JPY)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirLibrasAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosALibras(divisa_input);
				break;

			case "Libras esterlinas (GBP) a Won Surcoreano (KRW)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirLibrasAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAWon(divisa_input);
				break;

			//Yen
			case "Yen Japonés (JPY) a Dólar Estadounidense (USD)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirYenAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosADolares(divisa_input);
				break;

			case "Yen Japonés (JPY) a Euro (EUR)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirYenAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAEuros(divisa_input);
				break;

			case "Yen Japonés (JPY) a Libras esterlinas (GBP)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirYenAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosALibras(divisa_input);
				break;

			case "Yen Japonés (JPY) a Won Surcoreano (KRW)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirYenAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAWon(divisa_input);
				break;

			//Won
			case "Won Surcoreano (KRW) a Dólar Estadounidense (USD)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirWonAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosADolares(divisa_input);
				break; 

			case "Won Surcoreano (KRW) a Euro (EUR)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirWonAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAEuros(divisa_input);
				break; 

			case "Won Surcoreano (KRW) a Libras esterlinas (GBP)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirWonAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosALibras(divisa_input);
				break; 

			case "Won Surcoreano (KRW) a Yen Japonés (JPY)":
				esp = true;
				if (divisa_input >= 0.0) divisa_input = money.ConvertirWonAPesos(divisa_input, esp);
				if (divisa_input >= 0.0) money.ConvertirPesosAYen(divisa_input);
				break; 

			default: //Ningún caso
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
