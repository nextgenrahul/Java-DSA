package Post40.StaticExample;

//  class Text{

//         static String name;
//         public Text(String name){
//             this.name = name;
//         }
//     }
  
// static public class InnerClass { -> outer classes cannot be static but inner class can be static 
public class InnerClass {
  static class Text{

        String name;
        public Text(String name){
            this.name = name;
        }

        @Override
        public String toString() {
        // TODO Auto-generated method stub
        return name;
        }
    }


    public static void main(String[] args) {
        // These object give an error bcz if this inner class is in outer class, and yet you are creating an obj in the static fn then it will through an error
        // What if i make this inner class static it will not throw an error


        Text a = new Text("rahul");
        Text b = new Text("kunal");

        System.out.println(a);
        // If inner classes outside the outside class then it will print same name like when i create last object then it assign the value and print Kunal , Kunal
        // System.out.println(a.name);
        // System.out.println(b.name);

        // But when i put this class in the Innerclass then will and make this static then it will give us obj value that i have pass in the object why bcz this Text is doesn't not depend of Innerclass object that's why

        // Static method resolve during complie time
        // System.out.println(a.name);
        // System.out.println(b.name);

    }
}

// static Class A{ // We cannot do like this bcz this can cannot dependent on other classes

// }