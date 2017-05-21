public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=1,f=0,b=0;i<=n;i++){
            f++;
            b++;
            if(f==3&&b==5){
                arr.add("FizzBuzz");
                f=0;b=0;
            }
            else if(f==3){
                arr.add("Fizz");
                f=0;
            }
            else if(b==5){
                arr.add("Buzz");
                b=0;
            }
            else
                arr.add(Integer.toString(i));
        }
        return arr;
    }
}

Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

