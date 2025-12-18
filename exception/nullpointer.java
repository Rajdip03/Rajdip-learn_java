class nullpointer 
{
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.toUpperCase());
        } catch (Exception e) {
            System.out.println("null is leteral... so we null not convert into upeercase");
        }
    }
}