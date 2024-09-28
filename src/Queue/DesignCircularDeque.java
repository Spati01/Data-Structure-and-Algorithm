package Queue;

import java.util.ArrayList;

public class DesignCircularDeque {

    class MyCircularDeque {

        ArrayList<Integer> list;
        int size;

        public MyCircularDeque(int k) {
            this.list = new ArrayList<>();
            this.size = k;

        }

        public boolean insertFront(int value) {
            if(list.size() < size){
                list.add(0,value);
                return true;
            }
            return false;
        }

        public boolean insertLast(int value) {
            if(list.size() < size){
                list.add(value);
                return true;
            }
            return false;
        }

        public boolean deleteFront() {
            if(list.size() > 0){
                list.remove(0);
                return true;
            }
            return false;
        }

        public boolean deleteLast() {
            if(list.size() > 0){
                list.remove(list.size() - 1);
                return true;
            }
            return false;
        }

        public int getFront() {
            return list.size() > 0 ? list.get(0) : -1;
        }

        public int getRear() {
            return list.size() > 0 ? list.get(list.size() - 1) : -1;
        }

        public boolean isEmpty() {
            return list.size() == 0 ? true : false;
        }

        public boolean isFull() {
            return list.size() == size ? true : false;
        }
    }

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
}
