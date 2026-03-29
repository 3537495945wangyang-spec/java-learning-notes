package com.gdut.demo;

public class PrimeNumberTest2
{
    public static void main(String[] args)
    {
        int count = 0;
        int number = 2;
        boolean isPrime;
        System.out.println("将为您输出1-50间的素数");
        while (count < 50)
        {
            isPrime = true;
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime)
                {

                    count++;
                    if(count % 10 == 0) {
                        System.out.printf("%5d%n",number);
                    }
                    else {
                        System.out.printf("%5d",number  );
                    }
                }
                number++;
        }
    }
}

