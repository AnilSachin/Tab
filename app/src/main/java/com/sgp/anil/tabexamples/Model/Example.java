
package com.sgp.anil.tabexamples.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Example {

    @SerializedName("actors")
    @Expose
    private List<Actor> actors = new ArrayList<Actor>();

    /**
     * @return The actors
     */
    public List<Actor> getActors() {
        return actors;
    }

    /**
     * @param actors The actors
     */
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

}
