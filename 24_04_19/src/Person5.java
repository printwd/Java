import javax.swing.JOptionPane;

public class Person5 {
    private int age = 20;
    private String name = "홍길동";
    private boolean isMan = true;

    public void setAge() {
        String num1 = JOptionPane.showInputDialog(null, "나이(숫자만) 입력.");
        try {
            age = Integer.parseInt(num1);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "나이는 숫자를 입력해야 합니다.");
        }
    }

    public void setName() {
        name = JOptionPane.showInputDialog(null, "이름 입력.");
    }

    public void setIsMan() {
        String tmpisMan = JOptionPane.showInputDialog(null, "성별 입력.\n남자:0,여자:1");
        if (tmpisMan.equals("0")) {
            isMan = true;
        } else if (tmpisMan.equals("1")) {
            isMan = false;
        }
    }

    public void printAge() {
        JOptionPane.showMessageDialog(null, "나이는 ' " + age + " ' 입니다.");
    }

    public void printName() {
        JOptionPane.showMessageDialog(null, "이름은 ' " + name + " ' 입니다.");
    }

    public void printIsMan() {
        JOptionPane.showMessageDialog(null, "성별 " + (isMan ? "남자입니다." : "여자입니다."));
    }

    public static void main(String[] args) {
        Person5 person = new Person5();
        person.setAge();
        person.setName();
        person.setIsMan();
        person.printAge();
        person.printName();
        person.printIsMan();
    }
}
