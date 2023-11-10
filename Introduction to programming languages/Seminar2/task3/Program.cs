//Напишите программу, которая будет принимать на вход два числа и выводить, является ли второе число кратным первому.
//Если второе число некратно первому, то программа выводит остаток от деления.
System.Console.WriteLine("Введите два целых числа: ");
int perv = Convert.ToInt32(Console.ReadLine());
int vtor = Convert.ToInt32(Console.ReadLine());

if(perv%vtor == 0){
    System.Console.WriteLine("Число " + vtor + " кратно числу " + perv +"!");
}
else{
    System.Console.WriteLine("Число " + vtor + " НЕ кратно числу " + perv + "! Отстаток равен " + perv%vtor);
}