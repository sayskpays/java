package ch17.stream_.stream_01.sorted_stream.comparable_sort;

public class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        // score와 o.score가 같을 경우 0을 리턴, 작을 경우 음수 리턴, 클 경우 양수 리턴
        return Integer.compare(score, o.score);
    }
}
