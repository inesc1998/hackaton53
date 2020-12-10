package org.academiadecodigo.bitjs.voiceToTheSilent.model;

public class Institution {
    private Integer id;
    private String name;
    private String  cause;
    private String history;


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



    public String getHistory() {
        return history;
    }



    public void setHistory(String history) {
        this.history = history;
    }
}
