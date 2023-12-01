// Считать строку с консоли, состоящую из латинских букв в нижнем регистре. Выяснить, сколько среди введённых букв гласных.
//Пример “hello” => 2 “world” => 1

System.Console.Write("Введите строку латиницей: ");
string str = Console.ReadLine();

int CountVowel(string str){
    str = str.ToLower();
    char[] vowels = {'a','e','i','o','u','y'};
    int count = 0;
    for(int i = 0;i < str.Length; i++){
        for(int j = 0; j< vowels.Length; j++){
            if(vowels[j] == str[i]){
                count++;
            }
        }
    }
    return count;
}

Console.WriteLine(CountVowel(str));

