
public class Example2_RepeatedFunctionalityLogger_refactored {
    public static void main(String[] args) {
        Service service = new LoggingServiceDecorator(new ServiceImpl());
        service.process();
        service.validate();
    }
}

interface Service {
    void process();

    void validate();
}

class ServiceImpl implements Service {
    @Override
    public void process() {
        System.out.println("logic");
    }

    @Override
    public void validate() {
        System.out.println("logic");
    }
}

abstract class ServiceDecorator implements Service {
    protected final Service delegate;

    protected ServiceDecorator(Service delegate) {
        this.delegate = delegate;
    }
}

class LoggingServiceDecorator extends ServiceDecorator {
    LoggingServiceDecorator(Service delegate) {
        super(delegate);
    }

    @Override
    public void process() {
        System.out.println("Start process");
        delegate.process();
        System.out.println("End process");
    }

    @Override
    public void validate() {
        System.out.println("Start validate");
        delegate.validate();
        System.out.println("End validate");
    }
}
