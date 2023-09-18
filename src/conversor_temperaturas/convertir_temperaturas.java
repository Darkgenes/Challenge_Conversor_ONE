package conversor_temperaturas;

import javax.swing.JOptionPane;

public class convertir_temperaturas {

	public double ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " °C son: " + farenheit + " °F");
		return farenheit;
	}
	
	public void ConvertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " °C son: " + kelvin + " K");
	}
	
	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " °F son: " + celcius + " °C");
	}

    public void ConvertirFarenheitAKelvin(double valor) {
		double kelvin = ((valor - 32)/1.8) + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " °F son: " + kelvin + " K");
	}
	
	public double ConvertirKelvinACelcius(double valor) {
		 double celcius = valor - 273.15;
         celcius = (double) Math.round(celcius *100d)/100;
         JOptionPane.showMessageDialog(null, + valor + " K son: " + celcius + " °C");
         return celcius;
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double farenheit = ConvertirKelvinACelcius(valor);
		farenheit = ConvertirCelciusAFarenheit(farenheit);
		farenheit	= (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " K son: " + farenheit + " °F");
	}

}