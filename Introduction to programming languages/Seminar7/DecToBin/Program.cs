// Перевести число в двочный код

uint number = Convert.ToUInt32(Console.ReadLine());

string BinaryView(uint source){
    if(source == 0){
        return string.Empty;
    }

    return $"{BinaryView(source / 2)}{source % 2}";
}

void PrintBinaryView(uint source){
    if(source == 0){
        return;
    }
    PrintBinaryView(source/2);
    System.Console.Write(source%2);
}

// string value = BinaryView(number);
// System.Console.WriteLine(value);
PrintBinaryView(number);
