//Задача1. Массив символов в строку

char[] array = {'D','a','n','y','a'};

string Stroka(char[] chars){
    string str = string.Empty;
    for(int i = 0; i < chars.Length; i++){
        //str = str + chars[(chars.Length-1) - i];
        // str = chars[i] + str; //Варианты вывода строки наоборот
        str = str + chars[i];
    }
    return str;
}

string str = Stroka(array);
System.Console.WriteLine(str);
