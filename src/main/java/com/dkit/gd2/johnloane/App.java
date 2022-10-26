package com.dkit.gd2.johnloane;

public class App
{
    public static void main(String[] args)
    {
        Team myTeam = new Team("My team", "Harry");
        addPlayersToTeam(myTeam);
        System.out.println(myTeam.findPlayerByJerseyNumber(7));
        System.out.println(myTeam.findPlayersForPosition("Forward"));
        System.out.println(Player.getNumInstances());
    }

    private static void addPlayersToTeam(Team myTeam)
    {
        myTeam.getPlayers().add(new Player("John", 20, "Forward", 7));
        myTeam.getPlayers().add(new Player("Dermot", 21, "Forward", 8));
        myTeam.getPlayers().add(new Player("Bernie", 22, "Midfield", 11));
        myTeam.getPlayers().add(new Player("James", 20, "Goalkeeper", 1));
        myTeam.getPlayers().add(new Player("Jennie", 24, "Back", 9));
    }
}
