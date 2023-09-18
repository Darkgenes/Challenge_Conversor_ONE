package conversor_divisas;

import javax.swing.JOptionPane;

public class convertir_divisas { //It's better with an API

	public void ConvertirPesosADolares(double valor) {
		double dolar = valor / 3930.00;
		dolar = (double) Math.round(dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Son $" + dolar + " USD");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double euro = valor / 4191.55;
		euro = (double) Math.round(euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Son €" + euro + " EUR");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double libra = valor / 4871.55;
        libra = (double) Math.round(libra *100d)/100;
        JOptionPane.showMessageDialog(null, "Son £" +libra+ " GBP");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double yen = valor / 26.59;
        yen = (double) Math.round(yen *100d)/100;
        JOptionPane.showMessageDialog(null, "Son ¥" + yen + " JPY");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double won = valor / 2.96;
        won = (double) Math.round(won *100d)/100;
        JOptionPane.showMessageDialog(null, "Son ₩" + won + " KRW");
	}

    public double ConvertirDolaresAPesos(double valor, boolean especial) {
		if (especial == false){
			double cop = valor * 3930.00;
        	cop = (double) Math.round(cop *100d)/100;
        	JOptionPane.showMessageDialog(null, "Son $" + cop + " COP");
			return 0.0;
		}else{
			double cop = valor * 3930.00;
        	cop = (double) Math.round(cop *100d)/100;
			return cop;
		}
	}
	
	public double ConvertirEurosAPesos(double valor, boolean especial) {
		if (especial == false){
			double cop = valor * 4191.55;
        	cop = (double) Math.round(cop *100d)/100;
        	JOptionPane.showMessageDialog(null, "Son $" + cop + " COP");
			return 0.0;
		}else{
			double cop = valor * 4191.55;
        	cop = (double) Math.round(cop *100d)/100;
			return cop;
		}
	}
	
	public double ConvertirLibrasAPesos(double valor, boolean especial) {
        if (especial == false){
			double cop = valor * 4871.55;
        	cop = (double) Math.round(cop *100d)/100;
        	JOptionPane.showMessageDialog(null, "Son $" + cop + " COP");
			return 0.0;
		}else{
			double cop = valor * 4871.55;
        	cop = (double) Math.round(cop *100d)/100;
			return cop;
		}
	}
	
	public double ConvertirYenAPesos(double valor, boolean especial) {
		if (especial == false){
			double cop = valor * 26.59;
        	cop = (double) Math.round(cop *100d)/100;
        	JOptionPane.showMessageDialog(null, "Son $" + cop + " COP");
			return 0.0;
		}else{
			double cop = valor * 26.59;
        	cop = (double) Math.round(cop *100d)/100;
			return cop;
		}
	}
	
	public double ConvertirWonAPesos (double valor, boolean especial) {
		if (especial == false){
			double cop = valor * 2.96;
        	cop = (double) Math.round(cop *100d)/100;
        	JOptionPane.showMessageDialog(null, "Son $" + cop + " COP");
			return 0.0;
		}else{
			double cop = valor * 2.96;
        	cop = (double) Math.round(cop *100d)/100;
			return cop;
		}
	}
}