package Clases;

import java.util.Objects;

public class EmpleadoSet extends Empleado{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpleadoSet)) return false;
        EmpleadoSet empleado = (EmpleadoSet) o;
        return Objects.equals(this.getNombre(), empleado.getNombre()) &&
                Objects.equals(this.getApellido(), empleado.getApellido()) &&
                Objects.equals(this.getLegajo(), empleado.getLegajo()) &&
                Objects.equals(this.getAniosTrabajados(), empleado.getAniosTrabajados());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNombre(),
                this.getApellido(),
                this.getLegajo(),
                this.getAniosTrabajados());
    }
}
