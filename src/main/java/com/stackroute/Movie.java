package com.stackroute;

import java.util.List;

public class Movie {
    List<Actor> actor;

    public List<Actor> getActor() {
        return actor;
    }

   public void setActor(List<Actor> actor) {
       this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
    //Hello Please delete this,hahahah
}
