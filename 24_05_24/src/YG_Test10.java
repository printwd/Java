import javax.swing.JOptionPane;

public class YG_Test10 {
    public static void main(String[] args) {
        // 5개의 int 배열 선언
        int[] numbers = new int[5];
        
        // 숫자 값을 5번 입력받아 배열에 저장
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("숫자를 입력하세요:");
            numbers[i] = Integer.parseInt(input);
        }
        
        // 배열에서 가장 큰 값 찾기
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // 가장 큰 값을 출력
        JOptionPane.showMessageDialog(null, "가장 큰 숫자는: " + max);
    }
}
