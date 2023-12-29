//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new HourWorker("Vasya", 200),
                new MonthWorker("Nik", 450),
                new HourWorker("Petr", 78),
                new MonthWorker("Pavel", 150),
                new HourWorker("Alex", 90),
                new MonthWorker("Robers", 420),
        };

        WorkerArray workersArray = new WorkerArray(workers);
        workersArray.sortArrayBySalary();

        for (Worker worker: workersArray.array) System.out.println(worker);
    }
}