package org.academiadecodigo.bitjs.voiceToTheSilent.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Godfather {

    private Integer choiceId;
    private Integer id;

    @NotNull(message = "The Name is mandatory")
    @NotBlank(message = "The Name is mandatory")
    @Size(min = 3, max = 64)
    private String name;

    @Pattern(regexp = "^\\+?[0-9]*$", message = "Phone number contains invalid characters")
    @Size(min= 9, max = 9)
    private int contact;

    @NotNull(message = "The email is mandatory")
    @NotBlank(message = "The email is mandatory")
    @Size(min = 8, max = 100)
    private String email;

    @NotNull(message = "The way to help is mandatory")
    @NotBlank(message = "The way to help is mandatory")
    @Size(min = 8, max = 1000)
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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
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
