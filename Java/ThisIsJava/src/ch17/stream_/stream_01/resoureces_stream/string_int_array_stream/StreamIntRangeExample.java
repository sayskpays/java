package ch17.stream_.stream_01.resoureces_stream.string_int_array_stream;

import java.util.stream.IntStream;

public class StreamIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println(sum);
    }
}
