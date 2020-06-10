package com.company;
import Angajat_Club.Angajat_Club;
import File.ReadFile;
import Giocatore.Jucator;
import Giocatore.Jucator_Rezerva;
import Giocatore.Jucator_Titular;
import Staff.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


 public class Service_Class {
    private List<Jucator_Titular> Jucatori_titulari;
    private List<Jucator_Rezerva> Jucatori_rezerva;
    private List<Medic> Lista_medici;
    private List<Manager> Lista_manageri;
    private static Service_Class single_instance=null;
    public static Service_Class getInstance() throws IOException{
        if(single_instance == null)
            single_instance = new Service_Class();
        return single_instance;
    }



   public Service_Class() throws IOException
    {
        this.Jucatori_titulari=new ArrayList<>();
        this.Jucatori_rezerva=new ArrayList<>();
        this.Lista_medici=new ArrayList<>();
        this.Lista_manageri=new ArrayList<>();
        ReadFile in = ReadFile.getInstance();


        List<String []> obJucatori_titulari = in.readFromFile("jucator_titular");
        for( String [] line : obJucatori_titulari) {

            Jucator_Titular aux = new Jucator_Titular(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), line[4], Boolean.getBoolean(line[5]), Integer.parseInt(line[6]), Integer.parseInt(line[7]), Integer.parseInt(line[8]));
            Jucatori_titulari.add(aux);
        }
        for (int i = 0 ; i < Jucatori_titulari.size(); i++)
        System.out.println(Jucatori_titulari.get(i).toString());
        System.out.println(" ");

        List<String []> obJucatori_rezerva = in.readFromFile("jucator_rezerva");
        for( String [] line : obJucatori_rezerva) {

            Jucator_Rezerva aux = new Jucator_Rezerva(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), line[4], Integer.parseInt(line[5]));
            Jucatori_rezerva.add(aux);
        }
        for (int i = 0 ; i < Jucatori_rezerva.size() ; i++)
            System.out.println(Jucatori_rezerva.get(i).toString());
        System.out.println(" ");
        List<String []> obMedici = in.readFromFile("doctor");
        for (String [] line: obMedici)
        {
            Medic aux=new Medic(line[0],Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3]),line[4]);
            Lista_medici.add(aux);

        }
        for (int i = 0 ; i < Lista_medici.size() ; i++)
            System.out.println(Lista_medici.get(i).toString());
        List<String []> obManageri = in.readFromFile("manager");
        System.out.println(" ");
        for (String [] line : obManageri)
        {
            Manager aux=new Manager(line[0],Integer.parseInt(line[1]),Integer.parseInt(line[2]),Double.parseDouble(line[3]),Double.parseDouble(line[4]),Integer.parseInt(line[5]));
            Lista_manageri.add(aux);
        }
        for (int i = 0 ; i < Lista_manageri.size() ; i++ )
            System.out.println(Lista_manageri.get(i).toString());

        ReadFile out = ReadFile.getInstance();




        //cele 8 obiecte de tip A1,A2,...A8 derivate din clasa de baza A, intr-o lista de tip A
        List<Angajat_Club> list = new ArrayList<>();
        list.add(new Angajat_Club("Gheorghe Raducan",30,4000));
        list.add(new Jucator_Titular("Adrian Mutu",45,7000, 85, "Atacant",false,2,2,1));
        out.audit("Added Player");
        list.add(new Jucator_Rezerva("Gabriel Tamas",37, 3000, 77, "Fundas", 2));
        list.add(new Antrenor_principal("Jurgen Klopp",50,100000, 2,"Pro", false));
        out.audit("Added Coach");
        list.add(new Antrenor_secund("Marius Sumudica", 65, 3000, 1,true));
        list.add(new Manager("Ilie Dumitrescu",47, 2500, 5, 7, 8));
        out.audit("Added Manager");
        list.add(new Medic("Alexandru Popescu", 53, 1700, 22, "Terapeut"));
        out.audit("Added Doctor");
        list.add(new Membru_Staff("Ion ",27, 700,1.5));
        out.audit("Added Staff Member");
        //cele 10 actiuni/interogari
        System.out.println(((Jucator_Titular)list.get(1)).getBonus_victorie());
        System.out.println(list.get(2).getNume());
        System.out.println(((Antrenor_principal)list.get(3)).isWants_new_players());
        System.out.println(((Antrenor_secund)list.get(4)).isHas_license());
        System.out.println(((Manager)list.get(5)).getNr_transferuri_valabile());
        System.out.println(((Medic)list.get(6)).getSpecializare());
        list.remove(2);
        List <Jucator_Titular> list2 = new ArrayList<>();
        list2.add(new Jucator_Titular("Adrian Mutu",45,7000, 85, "Atacant",false,2,2,1));
        list2.add(new Jucator_Titular("Leo Messi",30,7000000, 99, "Atacant",true,3,2,0));
        list2.add(new Jucator_Titular("Cristiano Ronaldo",33,5000000, 98, "Atacant",false,2,1,0));
        list2.add(new Jucator_Titular("Neymar Jr",28,400000, 92, "Mijlocas",false,1,3,0));
        list2.add(new Jucator_Titular("Paul Pogba",30,120000, 88, "Mijlocas",false,2,1,0));
        list2.add(new Jucator_Titular("Virgil van Dijk",29,180000, 93, "Fundas",true,4,2,3));
        Collections.sort(list2,new Sortbyrating());
        out.audit("Sorted By Rating");

        for (int i=0 ; i < list2.size(); i++)
            System.out.println(list2.get(i).toString());
        list2.remove(0);
        System.out.println(" ");
        Collections.sort(list2,new Sortbyrating());
        for (int i=0 ; i < list2.size(); i++)
            System.out.println(list2.get(i).toString());


    }


    public static void main(String[] args) {

    }


}

