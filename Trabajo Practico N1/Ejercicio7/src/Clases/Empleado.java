package Clases;

public class Empleado {
    protected String nombre;
    protected String apellido;
    protected String legajo;
    protected int aniosTrabajados;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        if (nombre.isEmpty() || apellido.isEmpty() || legajo.isEmpty() || aniosTrabajados <= 0) {
            throw new IllegalArgumentException("Todos los campos tienen que tener datos y aniosTrabajados debe ser mayor a cero");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    private boolean isNumeric(int aniosTrabajados) {
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString(){
        return "Empleado: "+this.nombre+
                " "+this.apellido+
                " | Legajo: "+this.legajo+
                " | Años Trabajados: "+this.aniosTrabajados;
    }

    public static Empleado stringToObject(String empleadoString){
        String[] campos = empleadoString.replaceAll("\\s", "").split(",");
        String nombre = "";
        String apellido = "";
        String legajo = "";
        int aniosTrabajados = -1;
        for (String elemento: campos ) {
            String[] parametro = elemento.split("=");
            if(parametro.length < 2){
                throw new IllegalArgumentException("Formato incorrecto, falta el campo y/o el dato.");
            }
            switch (parametro[0].toLowerCase()){
                case "nombre":
                    nombre = parametro[1];
                    break;
                case "apellido":
                    apellido = parametro[1];
                    break;
                case "legajo":
                    legajo = parametro[1];
                    break;
                case "aniostrabajados":
                    try {
                        aniosTrabajados = Integer.parseInt(parametro[1]);
                    }catch (NumberFormatException e){
                        throw new IllegalArgumentException("El campo aniosTrabajados debe ser un numero entero");
                    }
                    if (aniosTrabajados <= 0) {
                        throw new IllegalArgumentException("El campo aniosTrabajados debe ser mayor a 0");
                    }
            }
        }
        return new Empleado(nombre, apellido, legajo, aniosTrabajados);
    }
}
