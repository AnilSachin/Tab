package com.sgp.anil.tabexamples.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Anil on 07-06-2016.
 */
public class Datastore {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("fname")
    @Expose
    private String fname;
    @SerializedName("lanme")
    @Expose
    private String lanme;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("filepath")
    @Expose
    private String filepath;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname The fname
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return The lanme
     */
    public String getLanme() {
        return lanme;
    }

    /**
     * @param lanme The lanme
     */
    public void setLanme(String lanme) {
        this.lanme = lanme;
    }

    /**
     * @return The age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age The age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return The filepath
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * @param filepath The filepath
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

}
