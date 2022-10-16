// Given an integer array A of size N. You can choose a set of integers and remove all the occurrences of these integers in the array. Find the minimum size of the set so that at least half of the integers of the array are removed.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pair implements Comparable<Pair>
{
    int key , value;
    Pair(int key, int value)
    {
        this.key = key;
        this.value = value;
    }

    public int compareTo(Pair obj)
    {
        return obj.value - this.value;
    }
}
class Main {
    public static int reduceArray(int arr[], int n)
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue <Pair> pq = new PriorityQueue<>();
        for(Map.Entry <Integer, Integer> set : map.entrySet())  //Iterating throught the map and adding all its key value pair and new Pair and putting it inside the priority queue
        {
            pq.add(new Pair(set.getKey(), set.getValue())); 
        }
        int a = 0;
        int count = 0;
        for(int i = 0; i < pq.size(); i++)
        {
            Pair p = pq.remove();
            a = a + p.value;    //Adding all the value of poped pair in req
            count++;

            if(a >= arr.length / 2)     //When a becomes half of arr.length then we break out of the loop as we get minimum count at this time....
                break;                  
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(reduceArray(arr, n));
    }
}

