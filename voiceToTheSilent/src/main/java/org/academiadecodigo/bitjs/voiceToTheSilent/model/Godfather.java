package org.academiadecodigo.bitjs.voiceToTheSilent.model;

public class Godfather {

    private Integer choiceId;
    private Integer id;
    private String name;
    private Integer contact;
    private String email;
    private String wayToHelp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public String getWayToHelp() {
        return wayToHelp;
    }

    public void setWayToHelp(String wayToHelp) {
        this.wayToHelp = wayToHelp;
    }

    public Integer getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Integer choiceId) {
        this.choiceId = choiceId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Godfather{" +
                "choiceId=" + choiceId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", wayToHelp='" + wayToHelp + '\'' +
                '}';
    }
}
