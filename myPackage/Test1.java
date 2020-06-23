import java.io.*;
import myPackage2.Test2;
class Test1 extends Test2{
    public static void main(String[] args){
        Test1 t=new Test1();
        t.show();
        //t.display(); //error as Test2.display is protected
        t.showDisplay();
    }
    void showDisplay(){
        this.display();
    }
}
