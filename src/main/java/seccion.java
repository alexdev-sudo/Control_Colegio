import java.util.List;
public class seccion extends colegio {
    private String codigo;
    private List<estudiante> estudiantes1;
    private List<profesor> profesor1;
public seccion(String nombrecolegio, String codigo) {
    super(nombrecolegio);
    this.codigo = codigo;


}
    public void agregrEstudiante(estudiante estu) {
        estudiantes1.add(estu);
    }
    public void agregrProfesor(profesor profe){
    profesor1.add(profe);
    }
}


