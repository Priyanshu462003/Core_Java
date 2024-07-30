package Generics_and_Wrapper_class;
import java.util.ArrayList;
public class learngenerics
{
    public static void main(String[] args) {
      Dog<String,String> d1=new Dog<>("asffd","leo");
      Dog<String,Integer> d2=new Dog<>("fhgjkl",123);
      Dog<Integer,String> d3=new Dog<>(123,"liom");
        System.out.println(d3.getId());
    }
}

class Dog<E,V>
{
    E id;
    V name;
  public Dog(E id,V name)
  {
      this.id=id;
      this.name=name;
  }
  E getId(){
      return id;
  }
}

