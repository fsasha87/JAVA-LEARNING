package patterns.decorator.ex3;

public class DecoratorLesson {
    public static void main(String[] args) {
        FileStream fileStream = new FileStreamReader();
        fileStream.read();//Read file
        FileStream fileStream1 = new FileBufferedReader(new FileStreamReader());
        fileStream1.read();//Read file Read buffer
    }

}
interface FileStream{
    void read();
}
class FileStreamReader implements FileStream{
    @Override
    public void read() {
        System.out.println("Read file");
    }
}
abstract class FileDecorator implements FileStream {
    FileStream fileDecorator;
    public FileDecorator(FileStream fileDecorator) {
        this.fileDecorator = fileDecorator;
    }
    public abstract void read();
}
class FileBufferedReader extends FileDecorator{
    public FileBufferedReader(FileStream fileDecorator) {
        super(fileDecorator);
    }

    @Override
    public void read() {
        fileDecorator.read();
        System.out.println("Read buffer");
    }//добавили доп функционал (надстройку) к базовому функционалу
}