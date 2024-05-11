public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("HallaVandalaWorld!");
        System.out.println("task1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println( "Task2" );
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println(" Task 5 ");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println(" Task 6 ");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var SummaWeight = secondBoxerWeight + firstBoxerWeight;
        System.out.println("Mass two boxer = " + SummaWeight );
        var weightDiscrepancy = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между массами бойцов = " + weightDiscrepancy);

        System.out.println(" Task 7 ");
        var weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления между двумя весами = " + weightDifference);

        System.out.println(" Task 8 ");
        var AllTimeWork = 640;
        var OneWorkerTime = 8;
        var WorkerAmount = AllTimeWork / OneWorkerTime;
        System.out.println("Всего работников в компании — " + WorkerAmount + " человек ");
        var NewAllWorker = WorkerAmount + 94;
        var NewOneWorkerAmount = AllTimeWork / NewAllWorker;
        System.out.println("Если в компании работает " + NewAllWorker+ " человек, то всего " + NewOneWorkerAmount + " часов работы может быть поделено между сотрудниками" );









    }
}