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
            List<string> list = new List<string>(Console.ReadLine().Split());

            list.RemoveAll(string.IsNullOrEmpty);

            Console.WriteLine(list.Count);
        }
    }
}
