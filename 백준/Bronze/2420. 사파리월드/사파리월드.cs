using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 백준_4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] A = Console.ReadLine().Split();
            long a, b;
            long result = 0;

            a = long.Parse(A[0]);
            b = long.Parse(A[1]);

            result = a - b;
            Console.WriteLine(Math.Abs(result));
            Console.ReadLine();
        }
    }
}
