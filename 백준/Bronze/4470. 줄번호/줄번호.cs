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

            for (int i = 0; i < N; i++) 
            {
                string name = Console.ReadLine();
                Console.WriteLine((i+1)+ ". " + name);
            }
        }
    }
}
