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
            string a = Console.ReadLine();
            foreach(char arg in a)
            {
                Console.WriteLine((int)arg);
            }
        }
    }
}
