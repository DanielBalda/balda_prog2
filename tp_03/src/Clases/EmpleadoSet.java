package Clases;

import java.util.Objects;

public class EmpleadoSet<T> extends Empleado {
    public EmpleadoSet() {
    }
    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EmpleadoSet empleado = (EmpleadoSet) o;
        return getLegajo() == empleado.getLegajo() && Objects.equals(getNombre(), empleado.getNombre())
                && Objects.equals(getApellido(), empleado.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getLegajo());
    }
}
