package com.dkit.gd2.johnloane;

public class Player
{
    private String name;
    private int age;
    private String position;
    private int jerseyNumber;
    private static int numPlayersCreated=0;

    public Player(String name, int age, String position, int jerseyNumber)
    {
        this.name = name;
        this.age = age;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        numPlayersCreated++;
    }

    public static int getNumInstances()
    {
        return numPlayersCreated;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getPosition()
    {
        return position;
    }

    public int getJerseyNumber()
    {
        return jerseyNumber;
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
