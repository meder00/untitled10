package com.geektech;

public class Medic extends Hero{




    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println( " Medic использовал супер силу " + superAbilityType);
    }
}
