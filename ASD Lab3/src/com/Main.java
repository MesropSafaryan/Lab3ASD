package com;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Олег", "Кузнець", 169, 70, 3454);
        Student student2 = new Student("Святослав", "Величко", 189, 79, 0000);
        Student student3 = new Student("Артем", "Бартош", 192, 90, 1234);
        Student student4 = new Student("Андрій", "Мартиненко", 184, 80, 8888);
        System.out.println("Перелік студентів: ");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        BinaryTree binTree = new BinaryTree();
        binTree.Add(student1);
        binTree.Add(student2);
        binTree.Add(student3);
        binTree.Add(student4);
        binTree.inOrderInsert();
        System.out.println("Результат послідовного обходу дерева: ");
        for (Student student : binTree.GetData()) {
            System.out.println(student.toString());
        }
    }
}
