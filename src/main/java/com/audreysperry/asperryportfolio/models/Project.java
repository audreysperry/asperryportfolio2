package com.audreysperry.asperryportfolio.models;


import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String modalid;
    private String title;
    private String shortdescription;
    private String longdescription;
    private String date;
    private String languages;
    private String imagelink;
    private String sourcecode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModalid() {
        return modalid;
    }

    public void setModalid(String modalid) {
        this.modalid = modalid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public String getLongdescription() {
        return longdescription;
    }

    public void setLongdescription(String longdescription) {
        this.longdescription = longdescription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }

    public String getSourcecode() {
        return sourcecode;
    }

    public void setSourcecode(String sourcecode) {
        this.sourcecode = sourcecode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", modalid='" + modalid + '\'' +
                ", title='" + title + '\'' +
                ", shortdescription='" + shortdescription + '\'' +
                ", longdescription='" + longdescription + '\'' +
                ", date='" + date + '\'' +
                ", languages='" + languages + '\'' +
                ", imagelink='" + imagelink + '\'' +
                ", sourcecode='" + sourcecode + '\'' +
                '}';
    }
}
