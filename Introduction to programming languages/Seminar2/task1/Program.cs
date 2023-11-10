//Напишите программу, которая принимает на вход трёхзначное число и удаляет вторую цифру этого числа.
System.Console.WriteLine("Введите трёхзначное число: ");

int treh = Convert.ToInt32(Console.ReadLine());

if(treh < 100 || treh > 1000){
    System.Console.WriteLine("Вы ввели не трёхзначное число!");
}
else{
    treh = (treh/100)*10 + treh%10;
    System.Console.WriteLine("Число без второй цифры: " + treh);
}
