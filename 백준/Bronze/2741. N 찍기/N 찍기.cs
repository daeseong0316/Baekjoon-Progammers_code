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
            int N = int.Parse(Console.ReadLine().Trim());

            StringBuilder a = new StringBuilder();
            
            for (int i = 1; i <= N; i++) 
            {
                a.AppendLine(i.ToString());
            }
            Console.WriteLine(a.ToString());
        }
    }
}
