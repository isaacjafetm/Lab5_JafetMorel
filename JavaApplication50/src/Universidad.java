
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class Universidad {
    ArrayList<Ceo> ceo = new ArrayList();
    ArrayList< Administrativo> admin = new ArrayList();
    ArrayList< PersonalAcademico> pacademico = new ArrayList();
    ArrayList< PersonalPlanta> pplanta = new ArrayList();
    ArrayList< Docente> docente = new ArrayList();
    ArrayList< Estudiantes> estudiantes = new ArrayList();

    public Universidad() {
    }

    public ArrayList<Ceo> getCeo() {
        return ceo;
    }

    public void setCeo(ArrayList<Ceo> ceo) {
        this.ceo = ceo;
    }

    public ArrayList<Administrativo> getAdmin() {
        return admin;
    }

    public void setAdmin(ArrayList<Administrativo> admin) {
        this.admin = admin;
    }

    public ArrayList<PersonalAcademico> getPacademico() {
        return pacademico;
    }

    public void setPacademico(ArrayList<PersonalAcademico> pacademico) {
        this.pacademico = pacademico;
    }

    public ArrayList<PersonalPlanta> getPplanta() {
        return pplanta;
    }

    public void setPplanta(ArrayList<PersonalPlanta> pplanta) {
        this.pplanta = pplanta;
    }

    public ArrayList<Docente> getDocente() {
        return docente;
    }

    public void setDocente(ArrayList<Docente> docente) {
        this.docente = docente;
    }

    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" + "ceo=" + ceo + ", admin=" + admin + ", pacademico=" + pacademico + ", pplanta=" + pplanta + ", docente=" + docente + ", estudiantes=" + estudiantes + '}';
    }
    
    
}
