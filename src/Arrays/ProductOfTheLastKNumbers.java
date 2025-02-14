package Arrays;

import java.util.ArrayList;

public class ProductOfTheLastKNumbers {

    class ProductOfNumbers {
        ArrayList<Integer> list;

        public ProductOfNumbers() {
            this.list = new ArrayList<>();
        }

        public void add(int num) {
            list.add(num);
        }

        public int getProduct(int k) {
            int j = list.size()-1;
            int product = 1;
            while(j >= 0 && k > 0){
                product *= list.get(j);
                j--;
                k--;
            }

            return product;
        }
    }

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
}
