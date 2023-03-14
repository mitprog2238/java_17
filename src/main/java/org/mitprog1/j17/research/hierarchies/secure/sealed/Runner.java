package org.mitprog1.j17.research.hierarchies.secure.sealed;

import org.mitprog1.j17.research.hierarchies.secure.sealed.classes.*;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
//        runCase_1();

//        javaApiResearch();

        strongerCodeAnalysis(new Climber());
    }

    private static void strongerCodeAnalysis(Plant plant) {
        if (plant instanceof Flowering){
//            Flowering plant1 = (Flowering) plant;
//            CharSequence  plant1 = (CharSequence) plant;

//            Integer integer = new Integer(5);
//            if (integer instanceof Runnable){
                CharSequence cs = (CharSequence) plant;
//            }

            System.out.println("WTF");
        }
    }

    private static void javaApiResearch() {
        var clazz = Plant.class;
        if(clazz.isSealed()){
            Arrays.stream(clazz.getPermittedSubclasses())
                    .forEach(System.out::println);
        }
    }

    private static void runCase_1() {
        Plant herb = new Herb();
        Gardener gardener = new Gardener();
        System.out.println(gardener.process(herb));
    }
}
