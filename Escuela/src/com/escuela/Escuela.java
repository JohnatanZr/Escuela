package com.escuela;

import javax.swing.JOptionPane;

public class Escuela {
	private Curso[] curso;

	public Escuela() {
		this.curso = new Curso[4];
	}

	public void InscribirCurso(int cod, String nombre, double cos) {
		boolean registro = false;
		for (int i = 0; i < curso.length; i++) {
			if (curso[i] == null && !registro) {
				curso[i] = new Curso(cod, nombre, cos);
				registro = true;
				JOptionPane.showMessageDialog(null, "Registro exitoso");
			}
		}
	}

	public String Mostrar() {
		String mensaje = "\tCursos\n";
		for (int i = 0; i < curso.length; i++) {
			if (curso[i] != null) {
				mensaje += "Código:" + curso[i].getCodigo() + "\t " + "Nombre:" + curso[i].getNombre() + "\t "
						+ "Costo:$" + curso[i].getCosto() + "\n";
			}
		}
		return mensaje;
	}

	public Curso BuscarCurso(int codigo) {
		Curso encontrado = null;
		for (int i = 0; i < curso.length; i++) {
			if (curso[i] != null && curso[i].getCodigo() == codigo) {
				encontrado = curso[i];
			}
		}
		return encontrado;
	}

	public void EliminarCurso(int codigo) {
		Curso eliminado = BuscarCurso(codigo);
		if (eliminado != null) {
			for (int i = 0; i < curso.length; i++) {
				if (curso[i] != null && curso[i].getCodigo() == codigo) {
					curso[i] = null;
					JOptionPane.showMessageDialog(null, "Curso eliminado");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "No existe el curso");
		}
	}
}
