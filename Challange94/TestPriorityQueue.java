package Challange94;
import java.util.*;

public class TestPriorityQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-- welcome to Student sorting program based on  marks  --");
//        System.out.println("Enter the number of student ");
//        int n = sc.nextInt();
//        Queue<Students> priorityQueue = new PriorityQueue<>(new Comparator<Students>() {
//            public int compare(Students s1, Students s2) {
//                return Integer.compare(s1.marks, s2.marks);
//            }
//        });
        Queue<Students> priorityQueue = new PriorityQueue<>(new Comparator<Students>() {
            public int compare(Students s1, Students s2) {
                return Integer.compare(s2.marks, s1.marks); // descending order
            }
        });

        priorityQueue.offer(new Students("raj",100));
        priorityQueue.offer(new Students("mohan",101));
        priorityQueue.offer(new Students("deepak",90));
        priorityQueue.offer(new Students("sumit",49));
        System.out.println(priorityQueue);
    }

    public static class Students {
        private String name;
        private int marks;
        public Students(String name){
            this(name,0);
        }
        public Students(String name, int marks){
            this.name = name;
            this.marks=marks;
        }
        public void showStudent(){
            System.out.println(this.toString());
        }
        public String toString(){
            return "Name = "+this.name+
                    "    Total Mark = "+marks+"\n";
        }
    }

}
