
// TODO Inserire il package corretto
package it.marconicivitavecchia.as2018_19.c5Binf.classe;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		super.setSize(15,50);
		StringBuilder sb = new StringBuilder();
		
		sb.append("<html>");
		
		sb.append("<h1>Almanacco astronomico</h1>");
		
		
		sb.append("<h3>Novembre 2018</h3>");
		
		
		sb.append("<h3>II Sole.</h3> <p>In Novembre perderemo compressivamente 1 ora e 3 minuti di luce.</p>");
		
		
		
		sb.append("<div style='display:table'>");
		
		sb.append("<div style='display:table-row'>");
		sb.append("<p>Data</p>");
		sb.append("</div>");
		sb.append("<div style='display:table-row'>");
		sb.append("<p>Sorge</p>");
		sb.append("</div>");
		sb.append("<div style='display:table-row'>");
		sb.append("<p>Tramonta</p>");
		sb.append("</div>");
		
		
		// TODO Convertire lo StringBuilder in String
		
		// TODO Assegnare correttamente la stringa create a JLabel
		sb.append("</html>");
		
		String htmlText = sb.toString();
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

