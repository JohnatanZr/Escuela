package com.escuela;

import javax.swing.JOptionPane;

public class Validador {
	private Escuela escuela;

	public Validador() {
		this.escuela = new Escuela();
	}

	public void InscribirCurso() {

		String codigo = JOptionPane.showInputDialog("Ingrese c�digo grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un c�digo grupo");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "C�digo inv�lido");
			return;
		}
		String nombre = JOptionPane.showInputDialog("Ingrese nombre curso");
		if (nombre.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un nombre");
			return;
		}
		String costo = JOptionPane.showInputDialog("Ingrese costo grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un c�digo");
			return;
		}
		double cos = 0;
		try {
			cos = Double.parseDouble(costo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Costo inv�lido");
			return;
		}
		escuela.InscribirCurso(cod, nombre, cos);

	}

	public void BuscarCurso() {
		String codigo = JOptionPane.showInputDialog("Ingrese c�digo grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un c�digo");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Datos inv�idos");
		}
		escuela.BuscarCurso(cod);
	}

	public void EliminarCurso() {
		String codigo = JOptionPane.showInputDialog("Ingrese c�digo grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese c�digo grupo");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Datos inv�idos");
		}
		escuela.EliminarCurso(cod);
	}

	public String Mostrar() {
		String mensaje = escuela.Mostrar();
		return mensaje;
	}
}
