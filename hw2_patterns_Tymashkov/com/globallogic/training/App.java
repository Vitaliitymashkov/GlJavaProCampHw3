package hw2_patterns_Tymashkov.com.globallogic.training;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;
import hw2_patterns_Tymashkov.com.globallogic.training.duck.builder.DuckBuilder;

import java.util.*;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, choose case# ");
        int caseNum = sc.nextInt();
        switch (caseNum) {
            //Duck
            //Case #10 Sample Builder
            case 10: {
                Duck duck = new DuckBuilder()
                        .setAge(10)
                        .setName("Scrooge McDuck")
                        .build();

                System.out.println(duck.toString());
                break;
            }

            //Case #11 Sample Prototype
            case 11: {
                Duck duck1 = new DuckBuilder()
                        .setAge(10)
                        .setName("Scrooge McDuck")
                        .build();

                Duck duck2 = new DuckBuilder()
                        .setAge(10)
                        .setName("Scrooge McDuck")
                        .build();

                System.out.println(duck1);
                System.out.println(duck2);
                System.out.println(duck1.equals(duck2));

                Duck duck3 = duck1.clone();
                System.out.println("Cloned by clone() duck1 -> duck3");
                System.out.println(duck1);
                System.out.println(duck3);
                System.out.println(duck1.equals(duck3));


                Duck duck4 = new Duck(duck1);
                System.out.println("Cloned by constructor duck1 -> duck4");
                System.out.println(duck1);
                System.out.println(duck4);
                System.out.println(duck1.equals(duck4));

                break;
            }

            //Case #12 Sample State
            case 12: {
                Duck duck = new DuckBuilder()
                        .setAge(10)
                        .setName("Scrooge McDuck")
                        .build();

                System.out.println(duck.toString());

                new WalkingState().doAction(duck);
                System.out.println(duck.getState().toString());

                new RunningState().doAction(duck);
                System.out.println(duck.getState().toString());

                new FlyingState().doAction(duck);
                System.out.println(duck.getState().toString());
                break;
            }

            //Case #13 Error change state from Flying -> Sleeping
            case 13: {
                Duck duck = new DuckBuilder()
                        .setAge(10)
                        .setName("Scrooge McDuck")
                        .build();

                System.out.println(duck.toString());

                new WalkingState().doAction(duck);
                System.out.println(duck.getState().toString());

                new RunningState().doAction(duck);
                System.out.println(duck.getState().toString());

                new FlyingState().doAction(duck);
                System.out.println(duck.getState().toString());

                new SleepingState().doAction(duck);
                System.out.println(duck.getState().toString());
                break;
            }

            //Case #14 Sample Decorator
            case 14: {
                Duck duck = new DuckBuilder()
                        .setAge(10)
                        .setName("Scrooge McDuck")
                        .build();

                System.out.println(new TagDuckDecorator(new ChainletDuckDecorator(new ChainletDuckDecorator(new TagDuckDecorator(duck)))).toString());
                break;
            }
            //
            case 22: {
                Duck duck = new Duck();
                duck.setProperty("Name", "Dark Fate");
                duck.setProperty("Birth date", "August 23, 2021");
                duck.setProperty("Distributed by", "Globallogic");

                System.out.println("Duck: " + duck);

                break;
            }
        }
    }
}
