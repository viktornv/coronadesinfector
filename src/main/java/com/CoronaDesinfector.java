package com;

public class CoronaDesinfector {

    private Annoucer annoucer = new ConsoleAnnoucer();
    private Policmen policmen = new PolicemanIml();
    //private Policmen policmen;


    public void start(Room room){

        annoucer.announce("Начинаем дезинфекцию, все вон!");
        policmen.makePeopleLeaveRoom();
        desinfect(room);
        annoucer.announce("Рискните зайти обратно!");
    }

    private void desinfect(Room room){
        System.out.println("зачитывается молитва: Корона изыди!");
    }
}
