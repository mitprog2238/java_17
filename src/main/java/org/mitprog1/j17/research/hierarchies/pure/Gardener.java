package org.mitprog1.j17.research.hierarchies.pure;


/**
 *
 * The problem #:
 *  There is an assumption that developers have to deal with in the last else construct,
 *  which is to define actions even though they are sure that all possible types of the method parameters have been already addressed.
 *  In the preceding code, the code in the last else block might look unreachable now,
 *  but what happens if some other developer adds a class to this hierarchy?
 *  Also, the compiler can’t help the method process to check whether it has handled all the subclasses.
 *
 * */
public class Gardener {
    int process(Plant plant) {
        if (plant instanceof Cucumber) {
            return harvestCucumber(plant);
        } else if (plant instanceof Climber) {
            return sowClimber(plant);
        } else if (plant instanceof Herb) {
            return sellHerb(plant);
        } else if (plant instanceof Shrub) {
            return pruneShrub(plant);
        } else {
            System.out.println("Unreachable CODE. Unknown Plant type");
            return 0;
        }
    }

    private int pruneShrub(Plant plant) {return 1;}
    private int sellHerb(Plant plant) {return 2;}
    private int sowClimber(Plant plant) {return 3;}
    private int harvestCucumber(Plant plant) {return 4;}
}
