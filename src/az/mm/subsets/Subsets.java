package az.mm.subsets;

import java.util.*;

/**
 *  Compilation:  javac Subsets.java
 *  Execution:    java Subsets 1 2 3
 *
 * @author MM <mushfiqazeri@gmail.com>
 */
public class Subsets {
    
    public static void main(String[] args) {
        if(args.length == 0) 
            args = new String[]{"1", "2", "3"};
        
        List set = Arrays.asList(args);
        Subsets s = new Subsets();
        s.printAllSubsets(set);
    }

    private void printAllSubsets(List set) {
        List emptySet = new ArrayList();
        printSubset(emptySet, set);
    }

    private void printSubset(List current, List next) {
        if (next.isEmpty()) 
            System.out.println(current);
        else {
            List newSet = new ArrayList(current);
            newSet.add(next.get(0));
            printSubset(newSet, next.subList(1, next.size()));
            printSubset(current, next.subList(1, next.size()));
        }
    }
}
