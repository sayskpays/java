package ch03;

public class SwitchChar {
    public static void main(String[] args) {

//        char grade = 'B';
//        switch (grade){
//            case 'A':
//            case 'a':
//                break;
//            case 'B':
//            case 'b':
//                break;
//            default:
//
//        }

        char grade = 'B';

        switch (grade){
            case 'A', 'a'->{
                System.out.println("");
            }
            case 'B', 'b'->{
                System.out.println("");
            }
            default -> {
                System.out.println();
            }
        }


    }
}
