package ch17.stream_.stream_01.filter_stream.mapping_stream;

public class StudentDTO {
    private String name;
    private int score;

    public StudentDTO(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
