package org.mitprog1.j17.research.hierarchies.secure.sealed.classes;


/**
 * It's not needed to write the code to handle subclasses that don't exist !
 *
 *  */
public class Gardener {
    public int process(Plant plant) {
        return switch (plant) {
            case Cucumber c -> harvestCucumber(c);
            case Climber cl -> sowClimber(cl);
            case Herb h -> sellHerb(h);
            case Shrub s -> pruneShrub(s);
        };
    }

    private int pruneShrub(Plant plant) {return 1;}
    private int sellHerb(Plant plant) {return 2;}
    private int sowClimber(Plant plant) {return 3;}
    private int harvestCucumber(Plant plant) {return 4;}
}
