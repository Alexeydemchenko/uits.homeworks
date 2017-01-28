
package basitypes;

public class Task1 {
    public static void main(String[] args){
        hello();
        System.out.println();
        manyLines();
        System.out.println();
        dataName();
    }
    
    static void hello(){
        System.out.println("Здравствуй мир");  
    }
    
    static void manyLines(){
        String lorem = "Lorem ipsum dolor sit amet, consectetuer adipiscing"
                            + "elit. Aenean commodo ligula eget dolor. Aenean"
                            + "massa. Cum sociis natoque penatibus et magnis dis"
                            + " parturient montes, nascetur ridiculus mus. Donec"
                            + " quam felis, ultricies nec, pellentesque eu, "
                            + "pretium quis, sem. Nulla consequat massa quis enim";
        System.out.println(lorem);
    }              
    
    static void dataName(){
        String name = "Демченко Алексей Владимирович";
        String groupId= "JV-1614";
        float time = 19.00f;
        
        System.out.println("ФИО:" + "[" + name + "]");
        System.out.println("номер группы:" + "[" + groupId + "]");
        System.out.println("время занятий:" + "[" + time + "]");
    }
}

