
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(300,300);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb=new StringBuilder("<html>");
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1><b>SSH First Aid</b></h1>");
		
		
		sb.append("<div style='dysplay:table'>");
		//prima riga
		sb.append("<div style='dysplay:table-row'>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("Alias");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("Hostname");
		sb.append("</div>");
		sb.append("</div>");
		//seconda riga
		sb.append("<div style='dysplay:table-row'>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("Raspberry");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("server.marconi.it");
		sb.append("</div>");
		sb.append("</div>");
		//terza riga
		sb.append("<div style='dysplay:table-row'>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("CoreSwitch");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("10.0.100.1");
		sb.append("</div>");
		sb.append("</div>");
		sb.append("</div>");
		// TODO Convertire lo StringBuilder in String
		String html=sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

