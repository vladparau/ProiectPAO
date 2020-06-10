package com.company;

import Giocatore.Jucator_Titular;

import java.util.Comparator;

class Sortbyrating implements Comparator<Jucator_Titular>
{

    public int compare(Jucator_Titular A, Jucator_Titular B)
    {
        return (int) (B.getRating()-A.getRating());
    }
}
