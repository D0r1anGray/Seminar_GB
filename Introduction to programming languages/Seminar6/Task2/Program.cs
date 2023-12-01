//На основе символов строки (тип string) сформировать массив символов (тип char[]). Вывести массив на экран.
//Указание: Метод строки ToCharArray() не использовать.
//Пример: “Hello!” => [‘H’, ‘e’, ‘l’, ‘l’, ‘o’, ‘!’ ]

string text = Console.ReadLine();

char[] ArrayFromString(string str){
    char[] chars = new char[str.Length];
    for(int i = 0; i < str.Length; i++){
        chars[i] = str[i];
    }
    return chars;
}

// void ViewArray(char[] chars){
//     for(int i = 0; i < chars.Length; i++){
//         System.Console.Write(chars[i]);
//     }
// }

//char[] chars = ArrayFromString(text);
// ViewArray(chars);

System.Console.WriteLine(ArrayFromString(text));
