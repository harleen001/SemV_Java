public class VariableScope {
    static int staticVar = 100;
    int instanceVar = 200;
    void myMethod() {
        int localVar = 300;
        if (true) {
            int blockVar = 400;
            System.out.println("Inside block: blockVar = " + blockVar);
        }
        System.out.println("Inside method: localVar = " + localVar);
    }
    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.myMethod();
        System.out.println("Static variable: staticVar = " + VariableScope.staticVar);
        System.out.println("Instance variable: instanceVar = " + obj.instanceVar);
    }
}