package com.escuela;

import javax.swing.JOptionPane;

public class Registro {
	public static void main(String[] args) {
		Validador validar = new Validador();
		int opcion = 0;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"\tMenú\n" + "1. Inscribir Curso\n" + "2. Mostrar Cursos\n" + "3. Eliminar Curso\n" + "0. Salir"));
			switch (opcion) {
			case 1:
				validar.InscribirCurso();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, validar.Mostrar());
				break;
			case 3:
				validar.EliminarCurso();
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}
}
