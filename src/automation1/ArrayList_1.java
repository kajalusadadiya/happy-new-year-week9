package automation1;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//Generic array list
        //   String[] a= { "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman"};
        //for(int i= 0; i<a.length; i++ ){
        //  System.out.println(a[i]);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Scrum");
        list1.add("Java");
        list1.add("Jira");
        list1.add("Selenium");
        list1.add("Cucumber");
        list1.add("Postman");
        for (String str : list1) {
            System.out.println(str);
        }
        ArrayList<Integer> list2 = new ArrayList();
        for (Integer str : list2) {

        }
    }
}