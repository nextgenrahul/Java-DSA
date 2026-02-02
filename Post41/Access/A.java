package Post41.Access;

public class A {
    protected int num; 
    private String name;
    int[] arr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


}
