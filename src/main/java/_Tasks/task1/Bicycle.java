package _Tasks.task1;

public class Bicycle {
    private String oName = "Aist";
    public void go(){
        System.out.println("Поехали");
    }

    public void getWheel(){
        Wheel wheel = new Wheel();
        System.out.println(wheel.iName);
    }


    public String getoName() {
        return oName;
    }

    class Wheel{
        private String iName = "Aistwheel";

        public String getiName() {
            return iName;
        }

        public void turnLeft(){
            System.out.println("Turn left"+ oName+iName+getiName()+getoName());
        }
    }
}
