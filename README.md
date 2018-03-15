# Input-Output Tasks
> by Dacharat Pankong (5910546643)

- From :
 ```sh
public static long fibonacci(int n) {
    // the base case
    if (n < 2) return 1;
    // the recursive step
    return fibonacci(n-1) + fibonacci(n-2);
}
 ```
 It takes a long time to run big value because in fibonacci method have return 2 recursive of fibonacci and it will do until finish that mean if you call `fibonacci(3)` it will call `fibonacci(2)` and `fibonacci(1)` and `fibonacci(2)` will call `fibonacci(1)` and `fibonacci(0)` from this recursive it use time to run or Big-O = O(2^n).
