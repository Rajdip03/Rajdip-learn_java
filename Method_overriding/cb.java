package Method_overriding.java;

public class cb {

    void show() {
        System.out.println("12 date is my date");
    }
}

class Method_overriding extends cb {
    void show() {
        super.show();
        System.out.println("junior programmer in cbnits");
    }

    public static void main(String[] args) {
        Method_overriding c = new Method_overriding();
        c.show();
    }
}
