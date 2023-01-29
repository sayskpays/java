package ch12.obj_class.obj.equals;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member target){
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }
}
