package com.escuela;

import javax.swing.JOptionPane;

public class Validador {
	private Escuela escuela;

	public Validador() {
		this.escuela = new Escuela();
	}

	public void InscribirCurso() {

		String codigo = JOptionPane.showInputDialog("Ingrese código grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un código grupo");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Código inválido");
			return;
		}
		String nombre = JOptionPane.showInputDialog("Ingrese nombre curso");
		if (nombre.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un nombre");
			return;
		}
		String costo = JOptionPane.showInputDialog("Ingrese costo grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un código");
			return;
		}
		double cos = 0;
		try {
			cos = Double.parseDouble(costo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Costo inválido");
			return;
		}
		escuela.InscribirCurso(cod, nombre, cos);

	}

	public void BuscarCurso() {
		String codigo = JOptionPane.showInputDialog("Ingrese código grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un código");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Datos inváidos");
		}
		escuela.BuscarCurso(cod);
	}

	public void EliminarCurso() {
		String codigo = JOptionPane.showInputDialog("Ingrese código grupo");
		if (codigo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese código grupo");
			return;
		}
		int cod = 0;
		try {
			cod = Integer.parseInt(codigo);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Datos inváidos");
		}
		escuela.EliminarCurso(cod);
	}

	public String Mostrar() {
		String mensaje = escuela.Mostrar();
		return mensaje;
	}
}
