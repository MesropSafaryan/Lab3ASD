package com;
import java.util.ArrayList;
public class BinaryTree {
    private class Node {
        Student student;
        Node right;
        Node left;
        public Node(Student data) {
            this.student = data;
        }
    }
    private Node root;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    public BinaryTree() {
        root = null;
    }
    public void Add(Student student) {
        root = Insert(root, student);
    }

    public ArrayList<Student> GetData(){
        return studentList;
    }

    private Node Insert(Node current, Student studentData) {
        if (current == null) {
            return new Node(studentData);
        } else {
            if (studentData.GetStudentTicket() < current.student.GetStudentTicket()) {
                current.left = Insert(current.left, studentData);
            } else if (studentData.GetStudentTicket() > current.student.GetStudentTicket()) {
                current.right = Insert(current.right, studentData);
            }
        }
        return current;
    }
    private void inOrder(Node current, ArrayList<Student> dataList) {
        if (current != null) {
            inOrder(current.left, dataList);
            dataList.add(current.student);
            inOrder(current.right, dataList);
        }
    }
    public void inOrderInsert() {
        inOrder(root, studentList);
    }
}