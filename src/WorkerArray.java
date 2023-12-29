import java.util.Arrays;

public class WorkerArray implements Sort<Worker> {

    Worker[] array;

    public WorkerArray(Worker[] array) {
        this.array = array;
    }

    @Override
    public void sortArrayBySalary() {
        Worker min;
        Worker current;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j].getSalary() < min.getSalary()) {
                    current = array[j];
                    array[j] = min;
                    min = current;
                }
            }
            array[i] = min;
        }
    }

    @Override
    public String toString() {
        return "WorkerArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
