public class ObjArrMain {

    public static void main(String[] args) {
        // 첫 번째 학생 객체 생성 및 값 설정
        ObjArrTest1 obj1 = new ObjArrTest1();
        obj1.setName("어윤규");
        obj1.setScore(100);
        
        // 두 번째 학생 객체 생성 및 값 설정
        ObjArrTest1 obj2 = new ObjArrTest1();
        obj2.setName("최지혜");
        obj2.setScore(80);
        
        // ObjArrTest1 배열 생성 및 초기화
        ObjArrTest1[] arr = new ObjArrTest1[2];
        arr[0] = obj1;
        arr[1] = obj2;
        
        // 점수 합계 및 평균 계산
        float sum = 0;
        float avg = 0;
        int max_value = Integer.MIN_VALUE;
        int maxScoreIdx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getScore();
            if (max_value < arr[i].getScore()) {
                max_value = arr[i].getScore();  // 최대 점수 업데이트
                maxScoreIdx = i;  // 최대 점수의 인덱스 업데이트
            }
        }
        
        avg = sum / arr.length;
        
        // 결과 출력
        System.out.println("학생들의 점수 합계: " + sum);
        System.out.println("학생들의 점수 평균: " + avg);
        System.out.println("1등 학생의 이름: " + arr[maxScoreIdx].getName());
    }
}
