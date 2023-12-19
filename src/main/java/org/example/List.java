package org.example;


public class List implements MyList {
    private Element head;
    private Element tail;

    private int length = 0;
    public List(){
        head = null;
        tail = null;
    }
    public int min(){
        int res = 100000000;
        Element e = head;
        while(e != null){
            if (e.value < res){
                res = e.value;
            }
            e = e.next;
        }
        return res;
    }
    public int max(){
        int res = -1000000000;
        Element e = head;
        while(e != null){
            if (e.value > res){
                res = e.value;
            }
            e = e.next;
        }
        return res;
    }
    public void listAdd(Element e){
        if (length == 0){
            head = e;
            length+=1;
        } else if (length ==1){
            tail = e;
            head.next = tail;
            tail.prev = head;
            length+=1;
        }else if (length > 1) {
            Element oldTail = tail;
            tail = e;
            oldTail.next = e;
            tail.prev = oldTail;
            length+=1;
        }
    }



    public void listOutput(){
        Element e = head;
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + e.value + " ");
            e = e.next;
        }
        System.out.println("]");

    }
    protected void swap(Element first, Element second){
        int e = first.value;
        first.value = second.value;
        second.value = e;
    }
    public void sort(){
        boolean isDone = false;
        while (isDone == false){
            isDone = true;
            Element e1 = head;
            Element e2 = head.next;
            for (int i = 0; i < length-1; i++) {
                if (e1.value > e2.value){
                    isDone = false;
                    swap(e1,e2);
                }
                e1 = e1.next;
                e2 = e2.next;
            }
        }
    }
}
