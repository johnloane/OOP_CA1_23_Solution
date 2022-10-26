package com.dkit.gd2.johnloane;

import java.util.ArrayList;

public class Team
{
    private String name;
    private String mascot;
    private ArrayList<Player> players;

    public Team(String name, String mascot)
    {
        this.name = name;
        this.mascot = mascot;
        this.players = new ArrayList<>();
    }

    public Player findPlayerByJerseyNumber(int number)
    {
        for(Player player : players)
        {
            if(player.getJerseyNumber() == number)
            {
                return player;
            }
        }
        return null;
    }

    public ArrayList<Player> findPlayersForPosition(String position)
    {
        ArrayList<Player> found = new ArrayList<>();
        for(Player player : players)
        {
            if(player.getPosition().equals(position))
            {
                found.add(player);
            }
        }
        return found;
    }

    @Override
    public String toString()
    {
        return "Team{" +
                "name='" + name + '\'' +
                ", mascot='" + mascot + '\'' +
                ", players=" + players +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public String getMascot()
    {
        return mascot;
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }
}
