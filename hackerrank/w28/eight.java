Hackerrank Editorial Notes

In this problem, you are given a sequence of digits of length N. You have to find the number of non-contiguous subsequences, such that the number formed by their concatenation is divisible by 8.

Observe a bit,

The number is formed by concatenating the non-contiguous subsequences, which implies that the number itself is a subsequence and vice-versa.

So the problem boils down to counting the ways you can make a subsequence divisible by 8. This can be done by Dynamic Programming.

At any position of the sequence, you need to consider two cases:

    Concatenate the digit at the position with your current subsequence and move to next position.

    Leave the digit and move to next position.

The idea can be coded with states: Current position and Remainder of the subsequence modulo 8.

Frequency table of sample test case: 968

I tried to put together a table to illustrate the idea of bottom-up solution using dynamic programming, and call it a frequency table, with 3 rows: 9, 96, 968, 8 columns representing all possible remainder of module 8 operation in ascending order, 0, 1, 2, 3, 4, 5, 6, 7.

At first, the first digit of number 968 is 9, the possible subsequences of 9 is empty number(none is selected) and 9. So the remainders are 0 or 1, since 9 % 8 = 1.

Work on the next digit 6, so either the digit 6 is not included in the subsequences or is included in the sequence.

For first choice of excluding digit 6, we just copy the subsequences in last step, two numbers: 0 and 9, frequency table row entry: 1, 1, 0, 0, 0, 0, 0

For second choice of including digit 6, we will include 6 in the subsequences, therefore, we have to iterate the remainder with nonzero values: 0 and 1. two numbers of 6 and 16, 6's remainder of module 8 is 6, and 16' remainder of 8 is 0. The row entry: 1, 0, 0, 0, 0, 0, 1, 0.

So, combining the above two choices, second row frequency table 2, 1, 0, 0,0, 0, 1, 0.

enter image description here

So, following the table from left-top corner, row by row, top to down, frequencyTablep[0,0] = 1, 0 can be divisible by 8, even 0 is not a subsequence of 968. We add to the table first, and then later take away 1 from frequencyTable[2,0]. So the numbers obtained from sequences of 968 are 96,9,968, 3 is the answer. 


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hackerrank_LuckyNumber8_DP_Studycode
{
    /*
     * Problem statement:
     * 
     * https://www.hackerrank.com/contests/w28/challenges/lucky-number-eight
     * 
     * Study dynamic programming solution 
     * 
     * questions on two things: 
     * first value is 1, count[0][0] = 1, why? count 0 as the first digit. see the frequency table. 
     * second, count[n - 1][0] + Module - 1, why? Remove number 0 as the answer. 
     */
    class Program
    {
        private static long Module = 1000000007;

        static void Main(string[] args)
        {
            var n = Convert.ToInt32(Console.ReadLine());

            var number = Console.ReadLine().ToString();

            var frequencyTable = new int[n][];  // subsequences 

            for (int i = 0; i < n; i++)
            {
                frequencyTable[i] = new int[8];
            }

            BuildFrequencyTableFromBottomUp(frequencyTable, number, n);

            Console.WriteLine((frequencyTable[n - 1][0] - 1) % Module);
        }

        /*
         * Build frequency table using bottom up method - dynamic programming
         * Design of the algorithm: 
         * At any position of the sequence, you need to consider two cases:
            Concatenate the digit at the position with your current subsequence and move to next position.
            Leave the digit and move to next position.
            The idea can be coded with states: Current position and Remainder of the subsequence modulo 8.
         * 
         */
        public static void BuildFrequencyTableFromBottomUp(int[][] frequencyTable, string number, int n)
        {
            const int SIZE = 8;
            frequencyTable[0][0] = 1;  // ask why here? count 0 as the first digit
            frequencyTable[0][(number[0] - '0') % SIZE]++;

            // build a frequency table - 
            for (int i = 1; i < n; i++)
            {
                // subseqences - just ignore the current elment
                for (int remainder = 0; remainder < SIZE; remainder++)
                {
                    frequencyTable[i][remainder] = frequencyTable[i - 1][remainder];
                }

                // iterate each element in the array - go over all possible remainders in ascending order
                for (int remainder = 0; remainder < SIZE; remainder++)
                {
                    long current = frequencyTable[i - 1][remainder];

                    // if the remainder's related count is 0, then no possible subsequences to the nextRemainder
                    // skip the remainder. 
                    if (current == 0)
                    {
                        continue;
                    }

                    int nextRemainder = (10 * remainder + (number[i] - '0')) % SIZE;

                    frequencyTable[i][nextRemainder] = (Int32)((frequencyTable[i][nextRemainder] + current) % Module);
                }
            }
        }
    }
