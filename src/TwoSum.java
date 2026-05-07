void main() {
    var arr = new int[] { 1, 5, 9, 2, 7 };

    var result = execute(arr, 9);

    IO.println(result[0] + ", " + result[1]);
}

int[] execute(int[] arr, int target) {

    var map = new HashMap<Integer, Integer>();

    for (var i = 0; i < arr.length; i++) {
        var value = target - arr[i];
        if(map.containsKey(value))
            return new int[] {map.get(value), i};

        map.put(arr[i], i);
    }

    return new int[] { -1, -1 };
}