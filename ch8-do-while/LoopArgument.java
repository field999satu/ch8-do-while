void main(String[] args) {
    int count = 0;
    int Sum = 0;
    for (String arg : args) {
        int number = Integer.parseInt(arg);
        count = count + number;
        if (count % 2 == 0)
            Sum = Sum + count;
    }

    IO.println("Sum : " + count);
}