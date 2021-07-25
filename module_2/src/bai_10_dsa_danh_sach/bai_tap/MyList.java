package bai_10_dsa_danh_sach.bai_tap;

import bai_10_dsa_danh_sach.thuc_hanh.linkedlist.MyLinkedList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];
    private MyList(){
        element = new Object[DEFAULT_CAPACITY];
    };
    private MyList(int capacity){
    }
}
