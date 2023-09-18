vector<int> generateFibonacciNumbers(int n) {
    vector<int> fib(n);  // Create a vector to store the Fibonacci numbers
    fib[0] = 0;          // First Fibonacci number
    fib[1] = 1;          // Second Fibonacci number

    // Generate the Fibonacci numbers
    for (int i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];  // Compute the next Fibonacci number
    }

    return fib;
}

