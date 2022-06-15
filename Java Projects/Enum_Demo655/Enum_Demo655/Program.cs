using System;

namespace Example556
{
    internal static class example556
    {
        static void Main(string[] args)
        {
            String name4 = gemStones.roseQuartz.ToString();
            String name1 = gemStones.Quartz.ToString();
            String name6 = gemStones.Gold.ToString();
            String name9 = gemStones.Jade.ToString();

            Console.WriteLine("This is one of my favorite gems," + name4 + ",it is great for loving and nurturing yourself and others");
            Console.WriteLine(name1 + " is for amplifying the current energy that is around " );
            Console.WriteLine("This is one of the most versitle metals on Earth, " + name6 + " is the quintesential symbol of wealth, as well as the best electrical conductor");
            Console.WriteLine("Ita uh shimmers rike a most precious " + name9);



        }
        enum gemStones
        {
            Quartz = 1,
            Amathyst = 2,
            Agate = 3,
            roseQuartz = 4,
            Pyrites = 5,
            Gold = 6,
            Silver = 7,
            Urainium = 8,
            Jade  =  9,
        }

    }

}


