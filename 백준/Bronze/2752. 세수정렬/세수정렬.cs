using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C샵백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] sort = new int[3];

            string[] str = Console.ReadLine().Split(' ');

            for(int i=0; i<3; i++)
            {
                sort[i] = int.Parse(str[i]);
            }
            Array.Sort(sort);

            Console.WriteLine(string.Join(" ", sort));
            Console.ReadLine();
        }
    }
}
