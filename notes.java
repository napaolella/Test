
public class notes {

	public static void main(String [] args) {
	
	System.out.print("hello");
	System.out.println("hello");
	System.out.print("hello\n");

	}
	
}
/**

Computers are dumb
turn on and off
hardware is hard sowftware isnt

compiler vs translator
java is compiler and translator at same time
compiler makes new file
java compiles bytecode file and then translates to machine

wworks across platforms by JVM

compiler error = syntax
runtime error = illeagle

algorithm = series of steps to solve problem
pseudocode = english help

take in itial amount and raise to the power of 1.05y, where y is the number of years
set equal to 20000
solve for y

variable = memory wit data
declare = create
initialize = giv valu
int = integers
double = floating point
char = single characters
boolean = trufalse
^not classes, primitive
String = class, complex

primitive stores it in the variable 
complex just stores a reference to the object somewhere in memory

loerCase

int num;
num = 0;
int num = 0;

method names look like variables with parrenissies
object.method();

objeccs have state
state = current situation of object (cumulative effect of all methods that have run on objecc)
instance variables hold state of objecc
constructor gives object an initial state
instantiating
string object = instance of stirng class (same thing)

accesssor = accesses/gets: getBalance()
mutator = changes: setBalance()

instance var = has data bout object

public class Joey
{
  private int weight;
}

constructor creates and initializes objeccs with feilds

how class looks 

Public class classname{
feilds (declare)
constructor
methods

var = var + 1
var++
var+=1

encapsulation - hiding implementation data and letting users access your feilds appropriatelty thru metheods

100_000 = 100,000
Overflow: 100000000 * 100000000 = -727379968 which is wrong

double can be bad: 4.35 * 100 = 4.349999999999994

constants:
final double QUARTER_VALUE = 0.25

static final constants:

public static final double PI =3.148548375893475923....

double circumfrerence = Matha.PI + diameter

5/2 = 2
7/4 = 1
7%4 = 3

Math.sqrt(x)
Math.pow(x, n)
Math.round goes to closest integer

scanners

nextInt()
nextDouble()
next() - string
nextLine() - includes return character

formatting output

System.out.printf("%10.2f", price) -rounds price to 2 decimals occupying 10 total characters

%d - integer
%f  - float
%s - string
.2 = round
2 = 2 spaces
%10.2f = float formatted to 10 spaces rounded to 2 decimals

sting of len 0 is ""

- left justifies

string = sequence of unicode characters 
characters 'H' 

str.subString(start, pastEnd)
leave pastend blank to go to end

Double.parseDouble(String)
Integer.parseInt(String)

no braces of if statement = one line

== equal to
!= not equal to
< less
> greater

!bool

alphabetical order;

string1.compareTo(string2) < 0 
-string1 comes before string2 in dictionary
-capital Z comes before a
-spaces come first, same with numbers and special stuff

!(A && B) = !A || !B
!(A || B) = !A && !B
!(A || !B) = !A && B
!((A || !B) || (A && B)) = (!A && B) && (!A || B) = (!A && B)



}

*/