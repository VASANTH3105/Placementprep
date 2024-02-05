class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        return new Pair(a[0], a[(int)(n-1)]);
    }
}


//python
def getMinMax( a, n):
    l = list(a)
    mi = min(l)
    ma = max(l)
    return mi, ma
