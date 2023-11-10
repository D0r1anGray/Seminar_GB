// программа принимает на вход трехзначное число и возводит вторую цифру этого числа в степень третьего числа
System.Console.WriteLine("Введите трёхзначное число: ");
//123
int treh = Convert.ToInt32(Console.ReadLine());
int i = 0;
int nov = 1;
 while (i < treh%10){
    nov = nov * ((treh/10)%10);
    i++;
 }
System.Console.WriteLine("Вторая цифра числа в степени третьего: " + nov);