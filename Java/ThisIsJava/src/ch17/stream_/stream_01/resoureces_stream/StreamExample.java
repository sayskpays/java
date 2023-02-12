package ch17.stream_.stream_01.resoureces_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<ProductDTO> list = new ArrayList<>();
        for(int i=1; i<=5; i++){
            ProductDTO productDTO = new ProductDTO(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
            list.add(productDTO);
        }

        // 객체 스트림 얻기
        Stream<ProductDTO> stream = list.stream();
        stream.forEach(productDTO -> System.out.println(productDTO));
    }
}
