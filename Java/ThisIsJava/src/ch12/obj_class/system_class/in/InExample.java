package ch12.obj_class.system_class.in;

public class InExample {
    public static void main(String[] args) throws Exception{
        int speed = 0;
        int keyCode = 0;

        while(true){
            // Enter 키를 읽지 않았을 경우에만 실행
            if(keyCode != 13 && keyCode != 10){
                if(keyCode == 49){
                    speed++;
                }else if(keyCode == 50){
                    speed--;
                } else if (keyCode == 51) {
                    break;
                }
            }

            keyCode = System.in.read();
        }
    }
}
