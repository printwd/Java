import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
    }

    public void calculate() {
        // 숫자 입력 받기
        String num1String = JOptionPane.showInputDialog(null, "첫 번째 숫자를 입력하세요:");
        int num1;
        try {
            num1 = Integer.parseInt(num1String);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "숫자를 입력해야 합니다.");
            return;
        }

        String num2String = JOptionPane.showInputDialog(null, "두 번째 숫자를 입력하세요:");
        int num2;
        try {
            num2 = Integer.parseInt(num2String);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "숫자를 입력해야 합니다.");
            return;
        }

        // 연산자 입력 받기
        String operator = JOptionPane.showInputDialog(null, "연산자를 입력하세요\n+ 더하기, - 빼기, * 곱하기, / 나누기, % 나머지");

        // 입력이 유효한지 확인하고 계산하기
        int result;
        if (operator.equals("+")) {
            result = num1 + num2;
            JOptionPane.showMessageDialog(null, "덧셈 결과: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            JOptionPane.showMessageDialog(null, "뺄셈 결과: " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            JOptionPane.showMessageDialog(null, "곱셈 결과: " + result);
        } else if (operator.equals("/")) {
            result = num1 / num2;
            JOptionPane.showMessageDialog(null, "나눗셈 결과: " + result);
        } else if (operator.equals("%")) {
            result = num1 % num2;
            JOptionPane.showMessageDialog(null, "나머지 결과: " + result);
        } else {
            JOptionPane.showMessageDialog(null, "올바른 연산자를 입력하세요: +, -, *, /, %");
        }
    }
}
