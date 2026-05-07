void main() {
    IO.println(execute(new int[] {1, 3, 5, 6, 7, 8, 9, 10, 14, 34, 35}, 7));
}

boolean execute(int[] arr, int target) {

    var l = 0;
    var h = arr.length - 1;
    
    while(l <= h) {
        var m = (l + h) / 2;

        if(target == arr[m])
            return true;
        else if (target < arr[m]) 
            h = m - 1;
         else
            l = m + 1;
    }
    
    return false;
}
