package ua.onlineua.homework.hw_exception;

//Examples from https://habr.com/ru/company/golovachcourses/blog/225585/

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExamplesOfException_2 {

}

//class App {
//    public static void main(String[] args){
//        throw new Exception(); // тут ошибка компиляции
//    }
//}

//class App_2 {
//    public static void main(String[] args) throws IOException  {
//        throw new Exception(); // тут ошибка компиляции
//    }
//}

class App_3 {
    public static void main(String[] args) throws Exception { // предупреждаем о Exception
        throw new Exception(); // и кидаем Exception
    }
}

class App_4 {
    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
        throw new Exception(); // а кидаем только Exception
    }
}

class App_5 {
    public static void main(String[] args) throws Exception { // пугаем
        // но ничего не бросаем
    }
}

//class App_6 {
//    public static void main(String[] args) {
//        f(); // тут ошибка компиляции
//    }
//
//    public static void f() throws Exception {
//    }
//}

class App_7 {
    // они пугают целым Throwable
    public static void main(String[] args) throws Throwable {
        f();
    }
    // хотя мы пугали всего-лишь Exception
    public static void f() throws Exception {
    }
}

class InternetDownloader {
    public static byte[] stub (String url) throws IOException {
        return "<html><body>Nothing! It's stub!</body></html>".getBytes();
    }
}

class App_8 {
    public static void main(String[] args) {
        f();
    }
    public static void f() throws RuntimeException {
    }
}

class App_9 {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

class App_10 {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }
    public static void f0() throws EOFException { }
    public static void f1() throws FileNotFoundException { }
}

class App_11 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

class App_12 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
}

class App_13 {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();
    }
    public static void f0() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
    public static void f2() throws InterruptedException {}
}

class App_14 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            // ...
        }
    }
}

class App_15 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Throwable e) {
            // ...
        }
    }
}

//class App_16 {
//    public static void main(String[] args) {
//        try {
//            throw new Throwable();
//        } catch (Exception e) {
//            // ...
//        }
//    }
//}

//class App_17 {
//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Error e) {
//            // ...
//        }
//    }
//}

class App_18 {
    // EOFException перехватили catch-ом, им не пугаем
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException e) {
            // ...
        }
    }
}

//class App_19 {
//    // пугаем Exception
//    public static void main(String[] args) throws Exception {
//        Throwable t = new Exception(); // и лететь будет Exception
//        throw t; // но тут ошибка компиляции
//    }
//}

//class App_20 {
//    public static void main(String[] args) throws Exception {
//        Object ref = "Hello!";  // ref указывает на строку
//        char c = ref.charAt(0); // но тут ошибка компиляции
//    }
//}

//class App_21 {
//    public static void f0(Throwable t) throws Exception {
//        throw t;
//    }
//    public static void f1(Object ref){
//        char c = ref.charAt(0);
//    }
//}

//class App_22 {
//    // пугаем Exception
//    public static void main(String[] args) throws Exception {
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }
//}

class App_23 {
    // ТЕПЕРЬ пугаем Throwable
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }
}
//_____________________________________________________________
class Parent {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

class Child extends Parent {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}
//_____________________________________________________________
//class Parent_2 {
//    public void f() throws IOException, InterruptedException {}
//}
//
//class Child_2 extends Parent_2 {
//    @Override
//    public void f() throws Exception {}
//}
//_____________________________________________________________
//class Parent3 {
//    // предок пугает Exception
//    public void f() throws Exception {}
//}
//
//class Child3 extends Parent3 {
//    // потомок расширил Exception до Throwable
//    public void f() throws Throwable {}
//}
//
//class Demo {
//    public static void test(Parent ref) {
//        // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
//        try {
//            ref.f();
//        } catch(Exception e) {}
//    }
//}
//
//class App_24 {
//    public static void main(String[] args) {
//        // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
//        Demo.test(new Child());
//    }
//}