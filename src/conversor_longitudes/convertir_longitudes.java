package conversor_longitudes;

import javax.swing.JOptionPane;

public class convertir_longitudes {
    
	public double ConvertirKilometrosAMetros(double valor, boolean especial) {
        if (especial == false){
			double metros = valor * 1000;
            metros = (double) Math.round(metros *100d)/100;
            JOptionPane.showMessageDialog(null, "La longitud es: " + metros + " m");
            return metros;
		}else{
			double metros = valor * 1000;
            metros = (double) Math.round(metros *100d)/100;
			return metros;
		}
	}
	
	public double ConvertirPulgadasAMetros(double valor, boolean especial){
        if (especial == false){
			double metros = valor * 0.0254;
            metros = (double) Math.round(metros *100d)/100;
            JOptionPane.showMessageDialog(null, "La longitud es: " + metros + " m");
            return metros;
		}else{
			double metros = valor * 0.0254;
            metros = (double) Math.round(metros *100d)/100;
            return metros;
		}
    }
	
	public double ConvertirPiesAMetros(double valor, boolean especial) {
        if (especial == false){
			double metros = valor * 0.3048;
            metros = (double) Math.round(metros *100d)/100;
            JOptionPane.showMessageDialog(null, "La longitud es: " + metros + " m");
            return metros;
		}else{
			double metros = valor * 0.3048;
            metros = (double) Math.round(metros *100d)/100;
            return metros;
		}
    }

    public double ConvertirMillasAMetros(double valor, boolean especial) {
        if (especial == false){
            double metros = valor * 1609.34;
            metros = (double) Math.round(metros *100d)/100;
            JOptionPane.showMessageDialog(null, "La longitud es: " + metros + " m");
            return metros;
        }else{
            double metros = valor * 1609.34;
            metros = (double) Math.round(metros *100d)/100;
            return metros;
		}
    }
	
	public void ConvertirMetrosAKilometros(double valor) {
		double Kilometros = valor / 1000.0;
		Kilometros	= (double) Math.round(Kilometros *100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es: " +  Kilometros + " km");
	}

    public void ConvertirMetrosAMillas(double valor) {
		double Kilometros = valor / 1609.34;
		Kilometros	= (double) Math.round(Kilometros *100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es: " +  + Kilometros + " mi");
	}

    public void ConvertirMetrosAPies(double valor) {
		double pies = valor * 3.28084;
		pies	= (double) Math.round(pies *100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es: " + pies + " km");
	}

    public void ConvertirMetrosAPulgadas(double valor) {
		double pulgadas = valor * 39.3701;
		pulgadas	= (double) Math.round(pulgadas *100d)/100;
        JOptionPane.showMessageDialog(null, "La longitud es: " +  pulgadas + " mi");
	}

}
