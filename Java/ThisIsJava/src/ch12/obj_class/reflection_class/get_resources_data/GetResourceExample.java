package ch12.obj_class.reflection_class.get_resources_data;

public class GetResourceExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("photo1.jpg").getPath();
        String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
    }
}
