package Multiple_inheritance;

public class Multiple_inheritance {

    interface clientOne {

        abstract void webdevelop();
    }

    interface clientTwo {

        abstract void webdesign();
    }

    class cbnits implements clientOne, clientTwo {

        public void webdevelop() {
            System.out.println("frontend---> html,css,javascript,react js");
            System.out.println("backend---> node js, express js");
            System.out.println("database---> mongobb");
        }

        public void webdesign() {
            System.out.println("design by--> figma , motion");
        }

        public static void main(String[] args) {
            cbnits c = new cbnits();
            c.webdevelop();
            c.webdesign();
        }
    }
}
