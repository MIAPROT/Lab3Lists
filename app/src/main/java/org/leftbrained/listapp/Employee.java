package org.leftbrained.listapp;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Employee {
    private String mName;
    private String mTeam;
    private int raiting;
    private int code;
    private int proeckt;
    private int image;

    public Employee(String mName, String mTeam, int mImage) {
        this.mTeam = mTeam;
        this.mName = mName;
        this.image = mImage;
        this.raiting = ThreadLocalRandom.current().nextInt(1, 3);
        this.code = ThreadLocalRandom.current().nextInt(1, 10000000);
        this.proeckt = ThreadLocalRandom.current().nextInt(1, 100);
    }


    public int getImage()
    {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }

    public int getProeckt()
    {
        return proeckt;
    }

    public void setProeckt(int proeckt)
    {
        this.proeckt = proeckt;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public int getRaiting()
    {
        return raiting;
    }

    public void setRaiting(int raiting)
    {
        this.raiting = raiting;
    }

    public String getmTeam()
    {
        return mTeam;
    }

    public void setmTeam(String mTeam)
    {
        this.mTeam = mTeam;
    }

    public String getmName()
    {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }


}
