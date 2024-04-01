package Entities;

import java.util.Date;

public class Alunos {
    private String name;
    private int ID;
    private Date birth;
    private String curso;

    public Alunos(String name, int ID, String curso) {
        this.name = name;
        this.ID = ID;
        this.curso = curso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
