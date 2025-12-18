import java.util.Arrays;

// import javax.swing.plaf.TreeUI;

public class array {
    public static void main(String[] args) {

        // static array
    //     String marvel_heros [] = {"iron man","Hulk","thor","spider man"};

    //     System.out.println(Arrays.toString(marvel_heros));

    //     for (String s : marvel_heros) {
    //         System.out.println(s);
    //     }
    //     for (int i = 0; i < marvel_heros.length ; i++) {
    //         System.out.println(marvel_heros[i]);
    //     }
    //     // Dynamic array
    //     int roll_number [] = new int [8];
    //     roll_number[0]=101;
    //     roll_number[1]=102;
    //     roll_number[2]=103;
    //     roll_number[3]=104;
    //     roll_number[4]=105;
    //     roll_number[5]=106;
    //     roll_number[6]=107;
    //     roll_number[7]=108;
    //    for (int i = 0; i < roll_number.length ; i++) {
    //         System.out.println(roll_number[i]);
    //    }
    //    // 2D array
    //         int marks [][]={{80,90,100},{60,70,80}};
    //         System.out.println(Arrays.deepToString(marks));

    //     //reverse array
    //      String dc_heros [] = {"super man","flash","wonder woman","Bat man"};
    //      System.out.println("\nArray element");
    //         for (int i = 0; i < dc_heros.length; i++) {

    //             System.out.println(dc_heros[i]);
    //         }

    //         System.out.println("\nReverse order of dc_heros");

    //         for (int i =dc_heros.length-1 ; i >=0 ; i--) {
    //                 System.out.println(dc_heros[i]);
    //             }

        //copy array element
        // String ben_Ten [] = {"Hit blast","Form arms","grey metter ","Dimond head"};
        // String copy [] ={" "," ","  "," "};
        // System.out.println("My first array");
        // for (int i = 0; i < ben_Ten.length; i++) {
        //     System.out.println(ben_Ten[i]);
        // }
        // System.out.println("\nMy Second array");
        // for (int i = 0; i < copy.length; i++) {
        //     copy[i]= ben_Ten[i];
        //     System.out.println(copy[i]);
        // }

        //sum of array element
        // avarage of array element--->total/size of array=425/5
        // int sem6_marks []={100,90,80,80,75};
        // int sum=0;
        // for (int i = 0; i < sem6_marks.length; i++) {
        //     sum = sum + sem6_marks[i];    
        // }
        // System.out.println(sum);

        // search array element
        // String cse_student [] = {"Rajdip","Sudip","Rupak","arman","Montu"};
        // String search  = "Rajdip";
        // boolean found= false ;
        // for (int i = 0; i < cse_student.length; i++) {
        //     if (cse_student[i] == search) {
        //         System.out.println(search +" ---> found in index no "+ i);
        //         found = true ;
        //         break;
        //     }
        // }
        // if (!found) {
        //         System.out.println(search +" not found in the array");
        //     }

        // // sort array element in assending order

        //  int viva_marks [] = {90,75,65,60,80};
        //  Arrays.sort(viva_marks);
        //  System.out.println("\nsort array element in assending order");
        //  for (int i = 0; i < viva_marks.length; i++) {
        //     System.out.println(viva_marks[i]);
        //  }
        //  System.out.println("\nsmallest element of array is " + viva_marks[0]);

        // // sort array element in dessending order

        //   System.out.println("\nsort array element in dessending order");
        //   for (int i = viva_marks.length - 1 ; i >= 0 ; i--) {
        //     System.out.println(viva_marks[i]);
        //   }
        //  System.out.println("\nBiggest element of array is " + viva_marks[4]);

        // check two arrays are equals are not

        // String colours [] = {"yeollow" , "blue", "cherry", "levender"};
        // String fev_colours [] = {"yeollow" , "blue", "cherry", "levender"};
        //     if (Arrays.equals(colours, fev_colours)) {
        //          System.out.println("Arrays are equals");
        //     }
        //     else 
        //     {
        //         System.out.println("NOt equals");
        //     }

        // find biggest element of array

            // int sem_5marks [] = {75,90,85,100,83};
            // int max = sem_5marks[0];
            // for (int i = 1; i < sem_5marks.length; i++) {
            //     if (sem_5marks[i] > max) { 
            //         max=sem_5marks[i];
            //     }
            // }
            // System.out.println("maximum element is "+ max);

            
            // int a[]= {80,20,30};
            // int b[] = Arrays.copyOf(a, 3); //predifined copy element of array (coppy array , size of array )
            // for (int i = 0; i < b.length; i++) {
            // System.out.println(b[i]);
            // }
            //copy element of static array to dynamic array

            // int b[]= new int [3];
            // for (int i = 0; i < a.length; i++) {
            //     System.out.println(a[i]+" first array");
            // }
            // for (int i = 0; i < b.length; i++) {
            //         b[i]=a[i];
            //          System.out.println(b[i]+ " copy array");
            //     }
            
            // insert new element in array

        // int marks[]={80,60,75,90,100};
        // int New_marks=88;
        // int position = 1;
        // int NewArray [] = new int [marks.length + 1 ];

        // for(int i=0; i< position; i++){
        //     NewArray [i] = marks[i];
        // }
        // NewArray [position]= New_marks; 

        // for(int i = position ; i<marks.length ; i++){
        //     NewArray [i+1]= marks[i];
        // }

        
        // for(int n : NewArray)
        // {
        //  System.out.print(n+" ");   
        // }

        // // deletion a element in array

        // int a[] = {20,30,70,60,44};
        // int delete_element = 30;
        // int newarray [] = new int [a.length - 1];
        // int j = 0;
        // for(int i=0; i < a.length; i++)
        // {
        //     if(a[i] != delete_element)
        //     {
        //         newarray [j] = a[i];
        //         j++;
        //     }
        // }
        // for(int n : newarray)
        // {
        //     System.out.print(n+ " ");
        // }

        // int age []={13,24,40,45,88,60,75,50};
        //     int add = 80;
        //     int p = 3;
        //     int newArray [] = new int [age.length + 1];
        //     for(int i =0; i <p; i++)
        //     {
        //         newArray[i]= age[i]; //45
        //     }
        //     newArray[p]=add ; //add 80
        //     for(int i =p; p< age.length; i++)
        //     {
        //         newArray[i+1]=age[i];
        //     }
        //     for(int s: newArray)
        //     {
        //         System.out.println(s);
        //     }

        // merge two sorted array(without library function)
        int a[] = {1,3,5,7};
        int b [] = {2,4,6,8}; 
        int c[] = new int[ a.length + b.length ];

        int i =0; int j=0; int k=0;

        while(i < a.length && j < b.length)
        {
            c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
            
        }
        while(i < a.length)
        {
            c[k++] = a[i++];
        }
        while(j < b.length)
        {
            c[k++]= b[j++];
        }
        for(int result : c)
        {
            System.out.print(result +" ");
        }
    }
}
