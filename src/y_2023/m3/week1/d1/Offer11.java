package y_2023.m3.week1.d1;

public class Offer11 {

    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(numbers[mid] < numbers[right])
                right = mid;
            else if(numbers[mid] > numbers[right])
                left = mid + 1;
            else
                right--;
        }
        return numbers[left];
    }

    public int search(int[] numbers, int left, int right){
        int mid = (right -left) / 2;
        if(numbers[mid] > numbers[mid + 1])
            return numbers[mid];
        else if(numbers[mid] < numbers[mid + 1])
            return search(numbers,mid + 1 , right);
        else
            return search(numbers,left, mid - 1);
    }


}
