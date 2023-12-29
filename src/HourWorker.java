import java.lang.reflect.Array;

public class HourWorker extends Worker {

    public HourWorker(String name, int hourlyRate) {
        super(name, hourlyRate);
    }

    @Override
    public double getSalary() {
        return 20.8*8*super.getSalary();
    }
}
