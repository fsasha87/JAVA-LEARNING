package patterns.decorator.ex1;

public class DeveloperDecorator implements Developer{
    Developer dev;

    public DeveloperDecorator(Developer dev) {
        this.dev = dev;
    }

    @Override
    public String makeJob() {
        return dev.makeJob();
    }
}
