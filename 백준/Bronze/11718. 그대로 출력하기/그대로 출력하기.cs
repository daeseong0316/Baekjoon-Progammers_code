using System;
using System.Globalization;
using static System.Console;

namespace Baekjoon
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
            while(i < 100)
            {
                string name = ReadLine()?.Trim();

                if(name == null)
                {
                    break;
                }
                Console.WriteLine(name);
                i++;
            }
        }
    }
}