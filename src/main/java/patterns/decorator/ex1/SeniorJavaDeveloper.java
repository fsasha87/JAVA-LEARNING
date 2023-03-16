package patterns.decorator.ex1;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer dev) {
        super(dev);
    }

    public String makeCodeReview(){
        return "make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeCodeReview();
    }
}
