package Post41.Access;

public class ObjectDemo {

    int num;
    float gpa;


    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa; 
    }



    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(21, 89.4f);
        ObjectDemo obj2 = new ObjectDemo(21, 45.4f);

        if(obj1 == obj2){
            System.out.println("Obj1 is equal to obj2");
        }

        if(obj1.equals(obj2)){
            System.out.println("Obj2 is equal to obj2---");
        }



    }







}


