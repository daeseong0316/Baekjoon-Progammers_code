using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C샵백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int result = 1;

            if (N < 0 || N > 12)
            {
                Console.WriteLine("조건이 맞지 않습니다");
            }
            else
            {
                for (int i = 1; i <= N; i++)
                {
                    result *= i;
                }
                Console.WriteLine(result);
            }
            Console.ReadLine();
        }
    }
}
