package ch02;

public class StringTypeChangeType {
    public static void main(String[] args) {

        // 문자열 -> 기본 타입

        String str1 = "10";
        byte value1 = Byte.parseByte(str1);

        String str2 = "200";
        short value2 = Short.parseShort(str2);

        String str3 = "300000";
        int value3 = Integer.parseInt(str3);

        String str4 = "400000000";
        long value4 = Long.parseLong(str4);

        String str5 = "12.345";
        float value5 = Float.parseFloat(str5);

        String str6 = "12.345";
        double value6 = Double.parseDouble(str6);

        String str7 = "true";
        boolean value7 = Boolean.parseBoolean(str7);

        // 기본 타입 -> 문자열
        String strValueOf = String.valueOf(str3);
    }
}
