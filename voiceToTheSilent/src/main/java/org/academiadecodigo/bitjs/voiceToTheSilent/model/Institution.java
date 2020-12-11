package org.academiadecodigo.bitjs.voiceToTheSilent.model;

public class Institution {

    private Integer id;
    private String name;
    private String cause;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                '}';
    }
}
