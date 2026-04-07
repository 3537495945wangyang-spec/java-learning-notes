# Sharpen your thinking.
##  first code
## variable
1. 作为一个变量存储数字、字母、字符串
- 类似与数学当中的x,区别是不局限于数字
2. 八个基本变量类型
- 有一个特殊的规则，使用float类型的时候，需要在值的后面加上f
3. 基本数据类型（primitive）与引用数据类型（reference）的区别
- 字节数，基本数据类型一般占8个字节，引用数据类型没有界限，由使用者决定（user defined）
- 基本数据类型只有数据，引用数据类型既有数字又有地址
- 基本数据类型只有一个值，引用数据类型有多个值
- 基本数据类型使用的内存少，引用数据类型占用内存多
- 基本数据类型操作更快
4. 如何create a variable
- declaration 声明变量 int x;
- assignment 赋值 x = 123;
- initialization 初始化 int x = 123;
5. 变量之间值的互换
```java
String x = "water";
String y = "coffee";
String temp = null;//temperate临时

temp = x;
x = y;
y = temp;
```
## Scanner
1. 导包 `import java.util.Scanner;`
2. 创建对象`Scanner sc = new Scanner(System.in);`
3. `Int x = sc.nextInt();`
4. `sc.nextLine();`
5. `String y = sc.nextLine;`
## expression 表达式 
1. 加减乘除
- 简单写法
`friends++；friends--；`
- 使用除法的时候，因为除不尽会忽略小数部分，如果要保留就得强转为double类型
`double friends = 10; friends = (double) friends/3;`
## GUI
`import javax.swing.JOptionPane;`
```java
String name = JOptionPane.showInputDialog("请输入你的名字");  
JOptionPane.showMessageDialog(null,"hello "+name);    
int age = Integer.parseInt(JOptionPane.showInputDialog("请输入你的年龄"));
//JOptionPane输出的是字符串  
JOptionPane.showMessageDialog(null,"you are "+age+" years old");    
double height = Double.parseDouble(JOptionPane.showInputDialog("请输入你的身高"));
JOptionPane.showMessageDialog(null,"you are "+height+" cm");
```
## Math API
1. max`Math.max(x,y);`
2. min
3. abs 绝对值`Math.abs();`
4. sqrt平方根`Math.sqrt();`
5. round四舍五入
6. ceil 向上舍入 floor向下舍入
7. 计算斜边
```java
double x;  
double y;  
double z;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter side x:  ");  
x = sc.nextDouble();  
System.out.println("Enter side y:  ");  
y = sc.nextDouble();    
z = Math.sqrt(x*x + y*y);  
System.out.println("The hypotenuse is " + z);
sc.close();
```
8. random生成的随机数属于伪随机数，是数学算法产生的，可以预测的
```java
Random random = new Random();  
int x = random.nextInt(6) + 1; //括号里限制的是最大值，加上一后生成1-6 
boolean y = random.nextBoolean();
```
## if statement
perform a block of code if it's condition evaluates to be true
展示一部分代码当条件为真的时候 
## Switch
statement that allows a variable to be tested for equality against a list of values
替代多个if语句 开关有多种可能匹配的值
```java
String day = "Friday";  
switch (day){  
    case "Monday":  
        System.out.println("Today is Monday");  
  break;  
  case "Tuesday":  
        System.out.println("Today is Tuesday");  
  break;  
  case "Wednesday":  
        System.out.println("Today is Wednesday");  
  break;  
  case "Thursday":  
        System.out.println("Today is Thursday");  
  break;  
  case "Friday":  
        System.out.println("Today is Friday,i love it");
  default:
			  System.out.println("That is not a day");
```
## & and | and !逻辑运算符
1. && both condition must be true
```java
int temp = 25;  
if(temp > 30){  
    System.out.println("It's hot outside");  
} else if (temp > 20 && temp <=30) {  
    System.out.println("It's warm outside");  
}else if (temp > 10 && temp <=20) {  
    System.out.println("It's cold outside");  
} else {  
    System.out.println("It's very cold outside");  
}
```
2. || either condition must be true
```java
String respond = "q";  
if(respond.equals("q") || respond.equals("Q")) {  
    System.out.println("Goodbye");  
  }else {  
    System.out.println("Still playing");  
}
```
3. ! reverses boolean value of a condition
```java
String respond = "q";  
if(!respond.equals("q") && !respond.equals("Q")) {  
    System.out.println("Still playing");  
  }else {  
    System.out.println("Goodbye");  
}
```
## 循环 
1.  While 
> executes(执行) a block of code as long as a it's condition remains true  
```java
String name = "";  
while(name.isBlank()){  
    System.out.println("Enter your name: ");  
  name = sc.nextLine();  
}  
System.out.println("Hello " + name);
```
2. do while 循环至少执行一次再检查条件
```java
String name = "";  
do{  
    System.out.println("Enter your name: ");  
  name = sc.nextLine();  
}  while(name.isBlank());
System.out.println("Hello " + name);
```
3. for loop 
 >for loop = executes(执行)  a block of code a limited amount of times
 
  for(index索引/count计数器；condition；端口)
```java
for(int i = 0;i<=10;i++){
	System.out.println(i);
}
```
4. 循环嵌套 
>nested loops = a loop inside of a loop

```java
int rows;  
int columns;  
String symbol;  
System.out.println("Enter number of rows: ");  
rows = sc.nextInt();  
System.out.println("Enter number of columns: ");  
columns = sc.nextInt();  
System.out.println("Enter symbol: ");  
symbol = sc.next();  
for(int i = 1;i<=rows;i++){  
    System.out.println();  
  for(int j = 1; j<=columns;j++){  
        System.out.print(symbol);  
  }  
}
```

## Array
> used to store multiple values in a single variable
> 存储单个变量中的多个值
>2 demonstrate array = an array of arrays

`String[] cars = {"mi","S,"T"}`
`String[] cars = new String[3]; `
`String[][] cars = new String[3][3]; `
## String
```java
 String name = "  Stick  ";  
boolean result = name.equals("Stick");  
int result = name.length();  
char letter = name.charAt(0);  
int result = name.indexOf("S");  
boolean result = name.isEmpty();  
String result = name.toUpperCase(); 
String result = name.toLowerCase(); 
String result = name.trim();//移除空白  
String result = name.replace('t','l');
```
## Wrapper包装类
>由原始数据类型变化为引用数据类型
>引用数据类型含有一些特别的方法可供使用useful methods

auto boxing自动类型转换
`Boolean a = true
Character b = ‘a’
Integer c = 23
Double d c= 2.14
String e = "Stick"` 
## Array List
```java
List<String> food = new ArrayList<String>();  
food.add("pizza");  
food.add("hamburger");  
food.add("hotdog");  
food.set(0,"sushi");  
food.remove(2);  
food.clear();  
for(int i=0;i<food.size();i++){  
    System.out.println(food.get(i));  
}
```

- 2 D Array List 
>a dynamic list of lists动态列表
>you can change the size of these lists during runtime运行时可以改变大小

```java
List<ArrayList<String>> groceeyList = new ArrayList<>();  
  
ArrayList<String> BakeryList = new ArrayList<>();  
BakeryList.add("pasta");  
BakeryList.add("garlic bread");  
BakeryList.add("donuts");  
  
ArrayList<String> ProduceList = new ArrayList<>();  
ProduceList.add("tomatoes");  
ProduceList.add("zucchini");  
  
  
ArrayList<String> DrinkList = new ArrayList<>();  
DrinkList.add("soda");  
DrinkList.add("coffee");  
  
groceeyList.add(BakeryList);  
groceeyList.add(ProduceList);  
groceeyList.add(DrinkList);  
System.out.println(groceeyList);  
System.out.println(groceeyList.get(0).get(1));
```
## for each loop

```java
String[] animals = {"cat","dog","bird"};  
for(String animal : animals){  
    System.out.println(animal);  
}
```

## Method
1. 方法的名字由小写字母开头
2. 为了保证传递进方法的参数不会混乱，方法需要先设置一个参数
形成一组互相匹配的变量
3. overload 相同名字，不同参数  

## object oriented programming
> 对象可以保存数据（属性）执行操作（方法）
> 是一种引用数据类型reference data

```java
String make = "Ford福特";  
int year = 2026;  
double price = 50000;  
boolean isElectric = false;  
void start(){  
    isElectric = true;  
  System.out.println("you start the engine");  
}  
void stop(){  
    System.out.println("you stop the engine");  
}  
void drive(){  
    System.out.println("you drive the " + make);  
}  
void brake(){  
    System.out.println("you brake the " + make);  
}
```

### constructor
>创建构造函数
>overload constructor
>array of objects

```java
Ccar[] cars = new Ccar[]{  
        new Ccar("Ford","Red"),  
  new Ccar("Mustang","Black"),  
  new Ccar("Tesla","White")};  
  
for(Ccar c : cars){  
  c.drive();  
}
```

## static
属于类而不属于任何对象,由类拥有，所有对象都可以访问
```java
String nama;  
static int numOfFriends;  
  
Friends(String name) {  
    this.nama = name;  
  numOfFriends++;  
}
static void printNumOfFriends(){  
    System.out.println("You have " + numOfFriends + " friends");  
}

Friends f1 = new Friends("Spongebob");  
Friends f2 = new Friends("Patrick");  
Friends f3 = new Friends("Sandy");  
  
System.out.println(Friends.numOfFriends);
```

## inheritance继承